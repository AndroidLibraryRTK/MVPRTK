package demo.material.finalmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import demo.material.finalmvp.presenter.impl.SelectRegionPresenterImpl;
import demo.material.finalmvp.presenter.wrapper.SelectRegionActPresenterWrapper;
import demo.material.finalmvp.view.callback.SelectRegionActViewCallback;

public class SelectRegionActivity extends AppCompatActivity implements SelectRegionActViewCallback{

    private SelectRegionActPresenterWrapper selectRegionActPresenterWrapper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_region);

        selectRegionActPresenterWrapper = new SelectRegionPresenterImpl();
        selectRegionActPresenterWrapper.setCallbackListener(this);
        selectRegionActPresenterWrapper.findUsername();
    }

    @Override
    public void getUsername(String name) {
        Toast.makeText(this, "Hello, "+ name, Toast.LENGTH_SHORT).show();
    }
}

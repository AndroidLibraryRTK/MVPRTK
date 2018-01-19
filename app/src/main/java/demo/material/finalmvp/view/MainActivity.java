package demo.material.finalmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import demo.material.finalmvp.R;
import demo.material.finalmvp.model.impl.MainActivityModelImpl;
import demo.material.finalmvp.presenter.impl.MainActivityPresenterImpl;
import demo.material.finalmvp.presenter.wrapper.MainActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.MainActivityViewCallback;

public class MainActivity extends AppCompatActivity implements MainActivityViewCallback {

    TextView tvTitle;
    MainActivityPresenterWrapper mainActivityPresenterWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle=findViewById(R.id.tvTitle);

        mainActivityPresenterWrapper = new MainActivityPresenterImpl();
        mainActivityPresenterWrapper.setViewCallListener(this);


        //Hey MVP, I want to get text from your model
        mainActivityPresenterWrapper.fromViewToPresenterGetText();

    }

    @Override
    public void fromPresenterToViewSetText(String text) {
        if(text!=null){
            tvTitle.setText(text);
        }else{
            Toast.makeText(this, "Value is null!", Toast.LENGTH_SHORT).show();
        }
    }
}

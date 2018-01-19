package demo.material.finalmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import demo.material.finalmvp.R;
import demo.material.finalmvp.presenter.impl.SignUpActivityPresenterImpl;
import demo.material.finalmvp.presenter.wrapper.SignUpActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.SignUpActivityViewCallback;

public class SignUpActivity extends AppCompatActivity implements SignUpActivityViewCallback {

    SignUpActivityPresenterWrapper signUpActivityPresenterWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        signUpActivityPresenterWrapper=new SignUpActivityPresenterImpl();
        signUpActivityPresenterWrapper.setSignUpViewCallback(this);

        signUpActivityPresenterWrapper.findGirlYouLove();

    }

    @Override
    public void getGirlNameYouLove(String name) {
        Toast.makeText(this, "Her name is "+ name, Toast.LENGTH_SHORT).show();
    }
}

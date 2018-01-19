package demo.material.finalmvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import demo.material.finalmvp.R;
import demo.material.finalmvp.presenter.impl.SignInActivityPresenterImpl;
import demo.material.finalmvp.presenter.wrapper.SignInActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.SignInActivityViewCallback;

public class SignInActivity extends AppCompatActivity implements SignInActivityViewCallback{


    private SignInActivityPresenterWrapper  signInActivityPresenterWrapper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        signInActivityPresenterWrapper= new SignInActivityPresenterImpl();
        signInActivityPresenterWrapper.setSignInActivityListenter(this);

        signInActivityPresenterWrapper.findBook();

    }

    @Override
    public void getBook(String name) {
        Toast.makeText(this, "Book Name : "+ name, Toast.LENGTH_SHORT).show();
    }
}

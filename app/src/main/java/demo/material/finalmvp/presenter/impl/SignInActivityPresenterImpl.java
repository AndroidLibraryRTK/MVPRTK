package demo.material.finalmvp.presenter.impl;

import demo.material.finalmvp.model.impl.MainActivityModelImpl;
import demo.material.finalmvp.model.impl.SignInActivityModelImpl;
import demo.material.finalmvp.model.wrapper.MainActivityModelWrapper;
import demo.material.finalmvp.model.wrapper.SignInModelWrapper;
import demo.material.finalmvp.presenter.callback.SignInActivityPresenterCallback;
import demo.material.finalmvp.presenter.wrapper.SignInActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.MainActivityViewCallback;
import demo.material.finalmvp.view.callback.SignInActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SignInActivityPresenterImpl implements SignInActivityPresenterWrapper , SignInActivityPresenterCallback{

    SignInModelWrapper signInModelWrapper;
    SignInActivityViewCallback signInActivityViewCallback;

    public SignInActivityPresenterImpl() {
      signInModelWrapper=new SignInActivityModelImpl();
      signInModelWrapper.setSignInActivityPresenterCallback(this);
    }

    @Override
    public void findBook() {
        signInModelWrapper.findBookFromDB();
    }

    @Override
    public void setSignInActivityListenter(SignInActivityViewCallback signInActivityListenter) {
        this.signInActivityViewCallback=signInActivityListenter;
    }

    @Override
    public void setBook(String name) {
        signInActivityViewCallback.getBook(name);
    }
}

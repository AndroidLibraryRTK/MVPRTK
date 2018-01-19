package demo.material.finalmvp.model.impl;

import demo.material.finalmvp.model.wrapper.SignInModelWrapper;
import demo.material.finalmvp.presenter.callback.SignInActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SignInActivityModelImpl implements SignInModelWrapper {

    SignInActivityPresenterCallback signInActivityPresenterCallback;

    @Override
    public void findBookFromDB() {
        signInActivityPresenterCallback.setBook("Harry Potter!");
    }

    @Override
    public void setSignInActivityPresenterCallback(SignInActivityPresenterCallback signInActivityPresenterCallback) {
        this.signInActivityPresenterCallback=signInActivityPresenterCallback;
    }
}

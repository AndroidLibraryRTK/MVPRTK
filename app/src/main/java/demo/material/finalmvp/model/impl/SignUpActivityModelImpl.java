package demo.material.finalmvp.model.impl;

import demo.material.finalmvp.model.wrapper.SignUpActivityModelWrapper;
import demo.material.finalmvp.presenter.callback.SignUpActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SignUpActivityModelImpl implements SignUpActivityModelWrapper {
    SignUpActivityPresenterCallback signUpActivityPresenterCallback;


    @Override
    public void findGirlName() {
        signUpActivityPresenterCallback.setGirlName("Kanha Nop Jit!");
    }

    @Override
    public void setSignUpActivityPresenterCallback(SignUpActivityPresenterCallback signUpActivityPresenterCallback) {
        this.signUpActivityPresenterCallback=signUpActivityPresenterCallback;
    }
}

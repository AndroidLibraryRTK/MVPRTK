package demo.material.finalmvp.presenter.impl;

import demo.material.finalmvp.model.impl.SignUpActivityModelImpl;
import demo.material.finalmvp.model.wrapper.SignUpActivityModelWrapper;
import demo.material.finalmvp.presenter.callback.SignUpActivityPresenterCallback;
import demo.material.finalmvp.presenter.wrapper.SignUpActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.SignUpActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SignUpActivityPresenterImpl implements SignUpActivityPresenterCallback, SignUpActivityPresenterWrapper{
    SignUpActivityViewCallback signUpActivityViewCallback;
    SignUpActivityModelWrapper signUpActivityModel;

    public SignUpActivityPresenterImpl() {
       signUpActivityModel= new SignUpActivityModelImpl();
       signUpActivityModel.setSignUpActivityPresenterCallback(this);
    }

    @Override
    public void setGirlName(String name) {
        signUpActivityViewCallback.getGirlNameYouLove(name);
    }

    @Override
    public void findGirlYouLove() {
        signUpActivityModel.findGirlName();
    }

    @Override
    public void setSignUpViewCallback(SignUpActivityViewCallback signUpViewCallback) {
        this.signUpActivityViewCallback=signUpViewCallback;
    }
}

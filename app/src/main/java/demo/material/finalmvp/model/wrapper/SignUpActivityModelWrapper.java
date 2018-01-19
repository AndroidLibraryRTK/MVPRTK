package demo.material.finalmvp.model.wrapper;

import demo.material.finalmvp.presenter.callback.SignUpActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SignUpActivityModelWrapper {
    void findGirlName();
    void setSignUpActivityPresenterCallback(SignUpActivityPresenterCallback signUpActivityPresenterCallback);
}

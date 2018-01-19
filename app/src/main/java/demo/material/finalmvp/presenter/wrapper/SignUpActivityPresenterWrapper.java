package demo.material.finalmvp.presenter.wrapper;

import demo.material.finalmvp.view.callback.SignUpActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SignUpActivityPresenterWrapper {
    void findGirlYouLove();
    void setSignUpViewCallback(SignUpActivityViewCallback signUpViewCallback);
}

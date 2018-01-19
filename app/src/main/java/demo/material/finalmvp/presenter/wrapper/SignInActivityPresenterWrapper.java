package demo.material.finalmvp.presenter.wrapper;

import demo.material.finalmvp.view.callback.SignInActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SignInActivityPresenterWrapper {
    void findBook();
    void setSignInActivityListenter(SignInActivityViewCallback signInActivityListenter);
}

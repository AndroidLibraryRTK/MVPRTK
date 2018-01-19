package demo.material.finalmvp.model.wrapper;

import demo.material.finalmvp.presenter.callback.SignInActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SignInModelWrapper {
    void findBookFromDB();
    void setSignInActivityPresenterCallback(SignInActivityPresenterCallback signInActivityPresenterCallback);
}

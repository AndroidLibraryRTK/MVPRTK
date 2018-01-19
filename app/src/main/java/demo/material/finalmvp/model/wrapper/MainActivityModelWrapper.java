package demo.material.finalmvp.model.wrapper;

import demo.material.finalmvp.presenter.callback.MainActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface MainActivityModelWrapper {
    void fromPresenterToModelGetText();
    void setMainActivityPresenterCallback(MainActivityPresenterCallback mainActivityPresenterCallback);
}

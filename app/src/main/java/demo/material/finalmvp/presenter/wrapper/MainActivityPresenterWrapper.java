package demo.material.finalmvp.presenter.wrapper;

import demo.material.finalmvp.view.callback.MainActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface MainActivityPresenterWrapper {
    void fromViewToPresenterGetText();
    void setViewCallListener(MainActivityViewCallback viewCallListener);
}

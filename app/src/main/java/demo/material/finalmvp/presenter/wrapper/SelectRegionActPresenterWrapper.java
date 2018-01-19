package demo.material.finalmvp.presenter.wrapper;

import demo.material.finalmvp.view.callback.SelectRegionActViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SelectRegionActPresenterWrapper {
    void findUsername();
    void setCallbackListener(SelectRegionActViewCallback callbackListener);
}

package demo.material.finalmvp.model.wrapper;

import demo.material.finalmvp.presenter.callback.SelectRegionActPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public interface SelectRegionActModelWrapper {
    void findUsername();

    void setPresenterCallback(SelectRegionActPresenterCallback presenterCallback);
}

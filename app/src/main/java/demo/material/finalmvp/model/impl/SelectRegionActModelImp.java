package demo.material.finalmvp.model.impl;

import demo.material.finalmvp.model.wrapper.SelectRegionActModelWrapper;
import demo.material.finalmvp.presenter.callback.SelectRegionActPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SelectRegionActModelImp implements SelectRegionActModelWrapper {
    SelectRegionActPresenterCallback presenterCallback;



    @Override
    public void findUsername() {
        presenterCallback.finduserName("Pek Ratanak");
    }

    public void setPresenterCallback(SelectRegionActPresenterCallback presenterCallback) {
        this.presenterCallback = presenterCallback;
    }
}

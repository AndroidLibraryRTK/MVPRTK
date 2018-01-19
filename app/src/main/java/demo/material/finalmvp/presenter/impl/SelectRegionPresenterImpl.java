package demo.material.finalmvp.presenter.impl;

import demo.material.finalmvp.model.impl.SelectRegionActModelImp;
import demo.material.finalmvp.model.wrapper.SelectRegionActModelWrapper;
import demo.material.finalmvp.presenter.callback.SelectRegionActPresenterCallback;
import demo.material.finalmvp.presenter.wrapper.SelectRegionActPresenterWrapper;
import demo.material.finalmvp.view.callback.SelectRegionActViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class SelectRegionPresenterImpl implements SelectRegionActPresenterWrapper , SelectRegionActPresenterCallback{
    SelectRegionActViewCallback callbackListener;
    SelectRegionActModelWrapper selectRegionActModelWrapper;

    public SelectRegionPresenterImpl() {
        selectRegionActModelWrapper=new SelectRegionActModelImp();
        selectRegionActModelWrapper.setPresenterCallback(this);
    }

    @Override
    public void findUsername() {
        selectRegionActModelWrapper.findUsername();
    }

    @Override
    public void setCallbackListener(SelectRegionActViewCallback callbackListener) {
        this.callbackListener = callbackListener;
    }


    @Override
    public void finduserName(String name) {
        callbackListener.getUsername(name);
    }
}

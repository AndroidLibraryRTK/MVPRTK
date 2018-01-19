package demo.material.finalmvp.model.impl;


import demo.material.finalmvp.model.wrapper.MainActivityModelWrapper;
import demo.material.finalmvp.presenter.callback.MainActivityPresenterCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class MainActivityModelImpl implements MainActivityModelWrapper{

    MainActivityPresenterCallback mainActivityPresenterCallback;


    @Override
    public void fromPresenterToModelGetText() {
        mainActivityPresenterCallback.fromModelToPresenterSetText("Hello World!");
    }


    @Override
    public void setMainActivityPresenterCallback(MainActivityPresenterCallback mainActivityPresenterCallback) {
        this.mainActivityPresenterCallback=mainActivityPresenterCallback;
    }
}

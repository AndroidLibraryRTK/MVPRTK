package demo.material.finalmvp.presenter.impl;

import demo.material.finalmvp.model.impl.MainActivityModelImpl;
import demo.material.finalmvp.model.wrapper.MainActivityModelWrapper;
import demo.material.finalmvp.presenter.callback.MainActivityPresenterCallback;
import demo.material.finalmvp.presenter.wrapper.MainActivityPresenterWrapper;
import demo.material.finalmvp.view.callback.MainActivityViewCallback;

/**
 * Created by r.pek on 1/19/2018.
 */

public class MainActivityPresenterImpl implements MainActivityPresenterWrapper, MainActivityPresenterCallback{

    MainActivityModelWrapper mainActivityModelWrapper;
    MainActivityViewCallback mainActivityCallback;

    public MainActivityPresenterImpl() {
        this.mainActivityModelWrapper = new MainActivityModelImpl();
        this.mainActivityModelWrapper.setMainActivityPresenterCallback(this);
    }


    @Override
    public void fromViewToPresenterGetText() {
        mainActivityModelWrapper.fromPresenterToModelGetText();
    }

    @Override
    public void fromModelToPresenterSetText(String text) {
        mainActivityCallback.fromPresenterToViewSetText(text);
    }

    @Override
    public void setViewCallListener(MainActivityViewCallback viewCallListener) {
        this.mainActivityCallback=viewCallListener;
    }

}

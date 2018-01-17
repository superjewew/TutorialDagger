package com.norman.tutorialdagger;

import javax.inject.Inject;

/**
 * Created by norman on 16/01/18.
 */

public class MainPresenterImpl implements MainContract.Presenter {

    private MainContract.View view;
    private ApiService apiService;

    @Inject
    public MainPresenterImpl(MainContract.View mainView, ApiService apiService) {
        view = mainView;
        this.apiService = apiService;
    }

    @Override
    public void loadData() {
        view.showResult();
    }
}

package com.norman.tutorialdagger.feature.help;

import android.widget.Toast;

import javax.inject.Inject;

/**
 * Created by norman on 17/01/18.
 */

public class HelpPresenter implements HelpContract.Presenter{

    HelpContract.View mView;

    @Inject
    public HelpPresenter(HelpContract.View view) {
        mView = view;
    }

    @Override
    public void loadHelp() {
        mView.showToast();
    }
}

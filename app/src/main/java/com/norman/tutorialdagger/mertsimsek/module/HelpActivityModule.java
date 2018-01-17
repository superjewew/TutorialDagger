package com.norman.tutorialdagger.mertsimsek.module;

import com.norman.tutorialdagger.feature.help.HelpActivity;
import com.norman.tutorialdagger.feature.help.HelpContract;
import com.norman.tutorialdagger.feature.help.HelpPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by norman on 17/01/18.
 */

@Module
public class HelpActivityModule {

    @Provides
    HelpContract.View providesView(HelpActivity activity) {
        return activity;
    }

    @Provides
    HelpContract.Presenter providesPresenter(HelpPresenter presenter) {
        return presenter;
    }
}

package com.norman.tutorialdagger;

import android.app.Activity;
import android.app.Application;


import com.norman.tutorialdagger.mertsimsek.component.AppComponent;
import com.norman.tutorialdagger.mertsimsek.component.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.HasActivityInjector;

/**
 * Created by norman on 16/01/18.
 */

public class TestApp extends DaggerApplication {

//    @Inject
//    AndroidInjector<Activity> androidInjector;
//
//    @Override
//    public AndroidInjector<Activity> activityInjector() {
//        return androidInjector;
//    }

//    @Override
//    public void onCreate() {
//        super.onCreate();
//        DaggerAppComponent.builder().application(this).build().inject(this);
//    }

        @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent component = DaggerAppComponent.builder().application(this).build();
        component.inject(this);
        return component;
    }

}

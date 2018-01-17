package com.norman.tutorialdagger.mertsimsek.component;

import android.app.Application;

import com.norman.tutorialdagger.TestApp;
import com.norman.tutorialdagger.mertsimsek.module.ActivityBuilder;
import com.norman.tutorialdagger.mertsimsek.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by norman on 16/01/18.
 */

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        AppModule.class,
        ActivityBuilder.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {

    void inject(TestApp app);

    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);
        AppComponent build();
    }
}

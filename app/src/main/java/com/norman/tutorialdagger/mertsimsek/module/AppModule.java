package com.norman.tutorialdagger.mertsimsek.module;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by norman on 16/01/18.
 */

@Module
public abstract class AppModule {

    @Binds
    abstract Context provideContext(Application application);

}

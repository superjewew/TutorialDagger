package com.norman.tutorialdagger.mertsimsek.module;

import com.norman.tutorialdagger.MainActivity;
import com.norman.tutorialdagger.feature.help.HelpActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by norman on 16/01/18.
 */

@Module
public abstract class ActivityBuilder {

//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = HelpActivityModule.class)
    abstract HelpActivity bindHelpActivity();
}

package com.norman.tutorialdagger.mertsimsek.module;

import com.norman.tutorialdagger.ApiService;
import com.norman.tutorialdagger.MainActivity;
import com.norman.tutorialdagger.MainContract;
import com.norman.tutorialdagger.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by norman on 16/01/18.
 */

@Module
public class MainActivityModule {

    @Provides
    MainContract.View provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainContract.Presenter provideMainPresenter(MainContract.View mainView, ApiService apiService){
        return new MainPresenterImpl(mainView, apiService);
    }
}

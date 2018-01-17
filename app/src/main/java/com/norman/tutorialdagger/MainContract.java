package com.norman.tutorialdagger;

/**
 * Created by norman on 16/01/18.
 */

public interface MainContract {
    interface View {
        void showResult();
    }
    interface Presenter {
        void loadData();
    }
}

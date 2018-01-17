package com.norman.tutorialdagger.feature.help;

/**
 * Created by norman on 17/01/18.
 */

public interface HelpContract {
    interface View {
        void showToast();
    }
    interface Presenter {
        void loadHelp();
    }
}

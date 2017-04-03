package com.okason.prontoshopapp;

import android.app.Application;

import com.okason.prontoshopapp.dagger.AppComponent;
import com.okason.prontoshopapp.dagger.AppModule;
import com.okason.prontoshopapp.dagger.DaggerAppComponent;

/**
 * Created by Valentine on 4/20/2016.
 */
public class ProntoShopApplication extends Application {

        private static ProntoShopApplication instance = new ProntoShopApplication();
        private static AppComponent appComponent;

        public static ProntoShopApplication getInstance() {
            return instance;
        }

        @Override
        public void onCreate() {
            super.onCreate();
            getAppComponent();
        }

        public AppComponent getAppComponent() {
            if (appComponent == null){
                appComponent = DaggerAppComponent.builder()
                        .appModule(new AppModule(this))
                        .build();
            }
            return appComponent;
        }

}

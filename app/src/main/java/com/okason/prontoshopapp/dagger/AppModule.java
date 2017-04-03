package com.okason.prontoshopapp.dagger;

import android.content.Context;

import com.okason.prontoshopapp.ProntoShopApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Valentine on 4/20/2016.
 */
@Module
public class AppModule {
    private final ProntoShopApplication app;

    public AppModule(ProntoShopApplication app) {
        this.app = app;
    }


    @Provides @Singleton
    public Context provideContext() {
        return app;
    }
}
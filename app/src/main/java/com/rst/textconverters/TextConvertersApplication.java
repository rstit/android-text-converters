package com.rst.textconverters;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import com.rst.textconverters.di.base.AppComponent;
import com.rst.textconverters.di.base.AppModule;
import com.rst.textconverters.di.base.DaggerAppComponent;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class TextConvertersApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public @NonNull AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static @NonNull TextConvertersApplication get(@NonNull Context context) {
        return (TextConvertersApplication) context.getApplicationContext();
    }
}

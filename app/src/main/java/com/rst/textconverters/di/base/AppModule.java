package com.rst.textconverters.di.base;

import android.app.Application;
import android.content.Context;
import android.support.annotation.NonNull;

import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

import java.util.Locale;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Marcin Przepiórkowski
 * @since 08.05.2016
 */
@Module
public class AppModule {
    private final static String PATTERN_STANDARD_DAY = "dd MMMM yyyy";

    Application mApplication;

    public AppModule(@NonNull Application application) {
        mApplication = checkNotNull(application);
    }

    @Provides
    @Singleton
    @NonNull DateTimeFormatter provideDefaultDateFormat() {
        return new DateTimeFormatterBuilder()
                .appendPattern(PATTERN_STANDARD_DAY)
                .toFormatter()
                .withLocale(Locale.ENGLISH);
    }

    @Provides
    @NonNull Context provideContext() {
        return mApplication.getApplicationContext();
    }
}

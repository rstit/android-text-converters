package com.rst.textconverters.util.converter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.DateTimeFormatterBuilder;

import java.util.Locale;

import javax.inject.Inject;

/**
 * @author Bartosz Mądry
 * @since 07.04.2017
 */
public class BirthDateConverter implements Converter<DateTime, String> {

    @Inject
    protected DateTimeFormatter mStandardDateFormatter;

    @Inject
    public BirthDateConverter() {
    }

    @Override
    public @NonNull String convert(@Nullable DateTime input) {
        return input != null ? mStandardDateFormatter.print(input) : "";
    }
}
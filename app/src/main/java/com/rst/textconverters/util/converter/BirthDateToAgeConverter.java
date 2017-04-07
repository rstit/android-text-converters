package com.rst.textconverters.util.converter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import org.joda.time.DateTime;
import org.joda.time.Years;

import javax.inject.Inject;

/**
 * @author Bartosz Mądry
 * @since 07.04.2017
 */
public class BirthDateToAgeConverter implements Converter<DateTime, String> {
    @Inject
    public BirthDateToAgeConverter() {
    }

    @Override
    public @NonNull String convert(@Nullable DateTime input) {
        return input != null ? Integer.toString(Years.yearsBetween(input, DateTime.now()).getYears()) : "";
    }
}
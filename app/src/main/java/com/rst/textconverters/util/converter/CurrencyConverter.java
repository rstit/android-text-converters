package com.rst.textconverters.util.converter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.rst.textconverters.model.Pricing;

import java.util.Locale;

import javax.inject.Inject;

/**
 * @author Bartosz Mądry
 * @since 07.04.2017
 */
public class CurrencyConverter implements Converter<Pricing, String> {
    @Inject
    public CurrencyConverter() {
    }

    @Override
    public @NonNull String convert(@Nullable Pricing input) {
        return input != null ? String.format(Locale.ENGLISH, "%.2f %s", input.getValue(), input.getCurrency()) : "";
    }
}
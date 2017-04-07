package com.rst.textconverters.model;

import android.support.annotation.NonNull;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class Pricing {
    private final double mValue;
    private final String mCurrency;

    public Pricing(double value, @NonNull String currency) {
        mValue = value;
        mCurrency = checkNotNull(currency);
    }

    public double getValue() {
        return mValue;
    }

    public @NonNull String getCurrency() {
        return mCurrency;
    }
}

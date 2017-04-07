package com.rst.textconverters.model;

import android.support.annotation.NonNull;

import org.joda.time.DateTime;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class User {
    private final DateTime mBirthDate;

    public User(@NonNull DateTime birthDate) {
        mBirthDate = checkNotNull(birthDate);
    }

    public @NonNull DateTime getBirthDate() {
        return mBirthDate;
    }
}

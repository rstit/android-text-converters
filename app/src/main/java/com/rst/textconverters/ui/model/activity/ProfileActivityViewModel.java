package com.rst.textconverters.ui.model.activity;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.support.annotation.NonNull;

import com.rst.textconverters.model.Pricing;
import com.rst.textconverters.model.User;
import com.rst.textconverters.util.converter.BirthDateConverter;
import com.rst.textconverters.util.converter.BirthDateToAgeConverter;
import com.rst.textconverters.util.converter.CurrencyConverter;

import javax.inject.Inject;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class ProfileActivityViewModel extends BaseObservable {

    @Inject
    public BirthDateConverter mBirthDateConverter;

    @Inject
    public BirthDateToAgeConverter mBirthDateToAgeConverter;

    @Inject
    public CurrencyConverter mCurrencyConverter;

    public final ObservableField<User> mUser = new ObservableField<>();
    public final ObservableField<Pricing> mPricing = new ObservableField<>();

    @Inject
    public ProfileActivityViewModel() {
    }

    public void setData(@NonNull User user, @NonNull Pricing pricing) {
        mUser.set(checkNotNull(user));
        mPricing.set(checkNotNull(pricing));
    }
}

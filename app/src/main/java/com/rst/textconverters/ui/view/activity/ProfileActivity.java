package com.rst.textconverters.ui.view.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.rst.textconverters.R;
import com.rst.textconverters.TextConvertersApplication;
import com.rst.textconverters.databinding.ActivityProfileBinding;
import com.rst.textconverters.di.profile.ProfileModule;
import com.rst.textconverters.model.Pricing;
import com.rst.textconverters.model.User;
import com.rst.textconverters.ui.model.activity.ProfileActivityViewModel;

import org.joda.time.DateTime;

import javax.inject.Inject;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

public class ProfileActivity extends Activity {
    private static final long EXAMPLE_BIRTH_DATE = 683935200000L;
    private static final double EXAMPLE_PRICE = 12.3456789;
    private static final String EXAMPLE_CURRENCY = "PLN";

    @Inject
    protected ProfileActivityViewModel mModel;

    private ActivityProfileBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextConvertersApplication.get(this)
                .getAppComponent()
                .plus(new ProfileModule(this))
                .inject(this);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile);
        mBinding.setModel(mModel);

        setData();
    }

    private void setData() {
        User exampleUser = new User(new DateTime().withMillis(EXAMPLE_BIRTH_DATE));
        Pricing examplePricing = new Pricing(EXAMPLE_PRICE, EXAMPLE_CURRENCY);
        mModel.setData(exampleUser, examplePricing);
    }
}

package com.rst.textconverters.di.profile;

import android.support.annotation.NonNull;

import com.rst.textconverters.ui.view.activity.ProfileActivity;

import dagger.Module;
import dagger.Provides;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

@Module
public class ProfileModule {
    private ProfileActivity mActivity;

    public ProfileModule(@NonNull ProfileActivity profileActivity) {
        mActivity = checkNotNull(profileActivity);
    }

    @Provides
    @NonNull ProfileActivity provideProfileActivity() {
        return mActivity;
    }
}

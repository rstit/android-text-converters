package com.rst.textconverters.di.profile;

import com.rst.textconverters.ui.view.activity.ProfileActivity;

import dagger.Subcomponent;

/**
 * @author Bartosz Madry
 * @since 07.04.17
 */

@Subcomponent(modules = ProfileModule.class)
public interface ProfileComponent {
    ProfileActivity inject(ProfileActivity activity);
}

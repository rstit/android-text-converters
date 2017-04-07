package com.rst.textconverters.di.base;

import com.rst.textconverters.di.profile.ProfileComponent;
import com.rst.textconverters.di.profile.ProfileModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Marcin Przepiórkowski
 * @since 08.05.2016
 */
@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    ProfileComponent plus(ProfileModule module);
}

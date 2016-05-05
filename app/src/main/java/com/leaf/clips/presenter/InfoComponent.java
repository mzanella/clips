package com.leaf.clips.presenter;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 */
@Singleton
@Component(modules = {AppModule.class, InfoModule.class})
public interface InfoComponent {
    void inject(HomeActivity mainActivity);
}

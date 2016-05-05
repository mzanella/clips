package com.leaf.clips.presenter;

import android.content.Context;

import com.leaf.clips.model.InformationManager;
import com.leaf.clips.model.InformationManagerImp;
import com.leaf.clips.model.dataaccess.service.DatabaseService;

import dagger.Module;
import dagger.Provides;

/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 */
@Module
public class InfoModule {

    DatabaseService service;
    Context context;

    public InfoModule (DatabaseService service, Context context){
        this.service = service;
        this.context = context;
    }

    @Provides @UserScope public InformationManager providesInformationManager(){
        return new InformationManagerImp(service, context);
    }
}

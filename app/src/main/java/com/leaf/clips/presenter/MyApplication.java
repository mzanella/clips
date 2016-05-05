package com.leaf.clips.presenter;

import android.app.Application;

import com.leaf.clips.model.dataaccess.service.DatabaseService;
import com.leaf.clips.model.dataaccess.service.DatabaseServiceImp;

/**
 * @author Marco Zanella
 * @version 0.01
 * @since 0.01
 */
public class MyApplication extends Application {

    private InfoComponent infoComponent;
    private static DatabaseService service = new DatabaseServiceImp();

    @Override
    public void onCreate() {
        super.onCreate();
        infoComponent = DaggerInfoComponent.buillder().appModule(new AppModule(this)).
                infoModule(new InfoModule(service, this)).build();
    }

    public InfoComponent getInfoComponent(){
        return infoComponent;
    }
}

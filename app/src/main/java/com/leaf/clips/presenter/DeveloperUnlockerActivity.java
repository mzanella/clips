package com.leaf.clips.presenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leaf.clips.view.DeveloperUnlockerView;
import com.leaf.clips.view.DeveloperUnlockerViewImp;

public class DeveloperUnlockerActivity extends AppCompatActivity {
    DeveloperUnlockerView developerUnlockerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        developerUnlockerView = new DeveloperUnlockerViewImp(this);
    }

    public boolean unlockDeveloper(String code){
        //TODO
        return true;
    }
}

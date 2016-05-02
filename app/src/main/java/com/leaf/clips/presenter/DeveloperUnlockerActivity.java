package com.leaf.clips.presenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.leaf.clips.R;

public class DeveloperUnlockerActivity extends AppCompatActivity {
    //TODO: creare la View e spostare relativa logica

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_unlocker);
    }

    public boolean unlockDeveloper(String code){
        //TODO
        return true;
    }
}

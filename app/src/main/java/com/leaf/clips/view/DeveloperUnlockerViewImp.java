package com.leaf.clips.view;

import com.leaf.clips.R;
import com.leaf.clips.presenter.DeveloperUnlockerActivity;

/**
 * @author Andrea Tombolato
 * @version 0.01
 * @since 0.00
 */
public class DeveloperUnlockerViewImp implements DeveloperUnlockerView {
    DeveloperUnlockerActivity developerUnlockerActivity;

    public DeveloperUnlockerViewImp(DeveloperUnlockerActivity developerUnlockerActivity) {
        developerUnlockerActivity.setContentView(R.layout.activity_developer_unlocker);
        this.developerUnlockerActivity = developerUnlockerActivity;

    }

    @Override
    public void showWrongCode() {

    }
}

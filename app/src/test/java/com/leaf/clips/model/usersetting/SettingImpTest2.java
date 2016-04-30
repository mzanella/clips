package com.leaf.clips.model.usersetting;
/**
 * @author Federico Tavella
 * @version 0.01
 * @since 0.00
 */

import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Unit Test 3
 */
@RunWith(JUnit4.class)
@SmallTest
public class SettingImpTest2 {

    private Setting setting;

    @Before
    public void init(){
        setting = new SettingImp();
        boolean isDev = setting.unlockDeveloper("");// TODO: 01/05/2016 Insert a developer code
        Assert.assertTrue(isDev);
    }

    @Test
    public void shouldBeADeveloper(){
        Assert.assertTrue(setting.isDeveloper());
    }
}

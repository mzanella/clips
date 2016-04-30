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
 * Unit Test 2
 */
@RunWith(JUnit4.class)
@SmallTest
public class DeveloperCodeManagerTest {

    private DeveloperCodeManager dev;

    @Before
    void init(){
        dev = new DeveloperCodeManager();
    }

    @Test
    void shouldAcceptDeveloperCode(){
        Assert.assertTrue(dev.isValid(""));// TODO: 01/05/2016

    }


    @Test
    void shouldRejectDeveloperCode(){
        Assert.assertFalse(dev.isValid(""));// TODO: 01/05/2016

    }
}

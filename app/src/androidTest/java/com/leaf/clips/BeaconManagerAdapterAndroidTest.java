package com.leaf.clips;
/**
 * @author Federico Tavella
 * @version 0.00
 * @since 0.00
 */

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;

import com.leaf.clips.model.beacon.BeaconRanger;
import com.leaf.clips.model.beacon.PeriodType;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Class Description
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class BeaconManagerAdapterAndroidTest {

    BeaconRanger ranger;

    @Before
    public void init(){
    }

    @Test
    public void shouldModifyScanPeriod(){
        long period = 101;

        ranger.modifyScanPeriod(period, PeriodType.FOREGROUND);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.FOREGROUND));
        ranger.modifyScanPeriod(period, PeriodType.BACKGROUND);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.BACKGROUND));

        ranger.modifyScanPeriod(period, PeriodType.FOREGROUND_BETWEEN);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.FOREGROUND_BETWEEN));

        ranger.modifyScanPeriod(period, PeriodType.BACKGROUND_BETWEEN);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.BACKGROUND_BETWEEN));

    }

    @Test
    public void shouldSwitchToBackgroundMode(){
        boolean value = true;
        ranger.setBackgroundMode(value);
        Assert.assertEquals(value, ranger.isBackground());

        value = false;

        ranger.setBackgroundMode(value);
        Assert.assertEquals(value, ranger.isBackground());
    }

}


package com.leaf.clips.model.beacon;
/**
 * @author Federico Tavella
 * @version 0.01
 * @since 0.00
 */

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.test.InstrumentationRegistry;

import android.support.test.rule.ServiceTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.SmallTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

/**
 * Unit test 40
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class BeaconManagerAndroidTest40 extends InstrumentationTestCase{

    private BeaconRanger ranger;

    private Intent intent;

    private Context context = InstrumentationRegistry.getTargetContext();

    @Rule
    public final ServiceTestRule mServiceRule = new ServiceTestRule();

    @Before
    public void init() throws TimeoutException {

        intent = new Intent(context, BeaconManagerAdapter.class);
        IBinder binder = mServiceRule.bindService(intent);
        ranger = ((BeaconManagerAdapter.LocalBinder) binder).getService();

    }

    @Test
    public void shouldModifyScanPeriod() {
        // TODO: 30/04/2016
        long period = 101;

        ranger.modifyScanPeriod(period, PeriodType.FOREGROUND);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.FOREGROUND));
        ranger.modifyScanPeriod(period, PeriodType.BACKGROUND);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.BACKGROUND));

        ranger.modifyScanPeriod(period, PeriodType.FOREGROUND_BETWEEN);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.FOREGROUND_BETWEEN));

        ranger.modifyScanPeriod(period, PeriodType.BACKGROUND_BETWEEN);
        Assert.assertEquals(period, ranger.getPeriod(PeriodType.BACKGROUND_BETWEEN));
        context.stopService(intent);
    }
}


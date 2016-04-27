package com.leaf.clips.model.beacon;
/**
 * @author Federico Tavella
 * @version 0.01
 * @since 0.00
 */

import com.leaf.clips.model.beacon.BeaconManagerAdapter;
import com.leaf.clips.model.beacon.BeaconRanger;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit Test 39 & 40
 */
public class BeaconManagerAdapterTest {

    BeaconRanger ranger;
    @Before
    public void init(){
        ranger = new BeaconManagerAdapter();
    }

    @Test
    public void shouldModifyScanPeriod(){
        //TO-DO
    }

    @Test
    public void shouldSwitchToBackgroundMode(){
        //TO-DO
    }
}

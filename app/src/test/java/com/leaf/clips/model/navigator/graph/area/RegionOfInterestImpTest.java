package com.leaf.clips.model.navigator.graph.area;

import com.leaf.clips.model.beacon.MyBeacon;
import com.leaf.clips.model.beacon.MyBeaconImp;

import junit.framework.Assert;

import org.altbeacon.beacon.AltBeacon;
import org.altbeacon.beacon.Beacon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Oscar Elia Conti
 * @version 0.01
 * @since 0.00
 */

// TODO: 4/30/16 ToVerify

public class RegionOfInterestImpTest {

    int id = 46;
    String uuid = "xyz";
    int major = 299990;
    int minor = 109120;

    MyBeacon myBeaconContained;
    MyBeacon myBeaconNotContained;

    RegionOfInterestImp regionOfInterestImp;

    @Before
    public void init() {

        //Construct the Beacons for tests
        List<Long> data = new LinkedList<>();
        data.add((long) 88);
        this.myBeaconContained = new MyBeaconImp(new AltBeacon.Builder().setId1("xyz").setId2("299990").setId3("109120").setRssi(-55).setTxPower(-55).setBluetoothAddress("prova").setDataFields(data).setBeaconTypeCode(1).build());

        this.myBeaconContained = new MyBeaconImp(new AltBeacon.Builder().setId1("x").setId2("46").setId3("29").setRssi(-55).setTxPower(-55).setBluetoothAddress("prova").setDataFields(data).setBeaconTypeCode(1).build());



        this.regionOfInterestImp = new RegionOfInterestImp(id, uuid, major, minor);
    }

    @Test
    public void testContains() throws Exception {
        Assert.assertTrue(regionOfInterestImp.contains(myBeaconContained));
        Assert.assertFalse(regionOfInterestImp.contains(myBeaconNotContained));
    }

    @Test
    public void testGetAllNearbyPOIs() throws Exception {
        PointOfInterestInformation poiInfo = new PointOfInterestInformation("name", "description", "category");
        PointOfInterest poi = new PointOfInterestImp(99, poiInfo);

        Collection<PointOfInterest> collection = new ArrayList<>();
        collection.add(poi);
        regionOfInterestImp.setNearbyPOIs(collection);

        Assert.assertEquals(regionOfInterestImp.getAllNearbyPOIs().iterator().next(), poi);
    }

    @Test
    public void testGetFloor() throws Exception {
        int floor = this.minor / 1000;
        Assert.assertEquals(floor, regionOfInterestImp.getFloor());
    }

    @Test
    public void testGetMajor() throws Exception {
        Assert.assertEquals(this.major, regionOfInterestImp.getMajor());
    }

    @Test
    public void testGetMinor() throws Exception {
        Assert.assertEquals(this.minor, regionOfInterestImp.getMinor());
    }

    @Test
    public void testGetUUID() throws Exception {
        Assert.assertEquals(this.uuid, regionOfInterestImp.getUUID());
    }

    @Test
    public void testSetNearbyPOIs() throws Exception {
        PointOfInterestInformation poiInfo = new PointOfInterestInformation("name", "description", "category");
        PointOfInterest poi = new PointOfInterestImp(99, poiInfo);

        Collection<PointOfInterest> collection = new ArrayList<>();
        collection.add(poi);
        regionOfInterestImp.setNearbyPOIs(collection);

        Assert.assertEquals(regionOfInterestImp.getAllNearbyPOIs().iterator().next(), poi);
    }
}
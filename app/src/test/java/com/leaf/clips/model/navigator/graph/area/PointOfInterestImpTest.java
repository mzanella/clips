package com.leaf.clips.model.navigator.graph.area;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * @author Oscar Elia Conti
 * @version 0.01
 * @since 0.00
 */

// TODO: 4/30/16 codify test Set ROI

public class PointOfInterestImpTest {

    PointOfInterestImp pointOfInterestImp;
    PointOfInterestInformation pointOfInterestInformation;
    int id = 99;

    @Before
    public void init() {
        pointOfInterestInformation = new PointOfInterestInformation("name", "description", "dategory");
        this.pointOfInterestImp = new PointOfInterestImp(this.id, pointOfInterestInformation);
    }

    @Test
    public void testGetAllBelongingROIs() throws Exception {
        Collection<RegionOfInterest> belonginROIs = pointOfInterestImp.getAllBelongingROIs();
        for(RegionOfInterest ROI : belonginROIs){
            Assert.assertNotNull(ROI);
        }
    }

    @Test
    public void testGetCategory() throws Exception {
        Assert.assertEquals("category", pointOfInterestImp.getCategory());
    }

    @Test
    public void testGetDescription() throws Exception {
        Assert.assertEquals("description", pointOfInterestImp.getDescription());
    }

    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(this.id, pointOfInterestImp.getId());
    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("name", pointOfInterestImp.getName());
    }

    @Test
    public void testSetBelongingROIs() throws Exception {
    }
}
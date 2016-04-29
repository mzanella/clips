package com.leaf.clips.model.navigator.graph.area;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Oscar Elia Conti
 * @version 0.01
 * @since 0.00
 */
public class PointOfInterestInformationTest {

    private PointOfInterestInformation pointOfInterestInformation;

    @Before
    public void init() {
        this.pointOfInterestInformation = new PointOfInterestInformation("name", "description", "category");
    }

    @Test
    public void testGetCategory() throws Exception {
        Assert.assertEquals("category", pointOfInterestInformation.getCategory());
    }

    @Test
    public void testGetDescription() throws Exception {
        Assert.assertEquals("category", pointOfInterestInformation.getCategory());
    }

    @Test
    public void testGetName() throws Exception {
        Assert.assertEquals("category", pointOfInterestInformation.getCategory());
    }
}
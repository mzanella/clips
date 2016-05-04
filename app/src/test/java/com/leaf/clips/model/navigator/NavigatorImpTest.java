package com.leaf.clips.model.navigator;
/**
 * @author Eduard Bicego
 * @version 0.01
 * @since 0.00
 */

import com.leaf.clips.model.beacon.MyBeacon;
import com.leaf.clips.model.compass.Compass;
import com.leaf.clips.model.navigator.graph.MapGraph;
import com.leaf.clips.model.navigator.graph.area.RegionOfInterest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.PriorityQueue;

import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

/**
 * TU33, TU34, TU35
 * TODO: TU35 e parte di TU34 non è coperta da test
 */
@RunWith(MockitoJUnitRunner.class)
public class NavigatorImpTest {

    private NavigatorImp navigatorImp;

    @Mock
    private Compass mockCompass;

    @Mock
    private RegionOfInterest mockStartRoi;

    @Mock
    private RegionOfInterest mockEndRoi;

    @Mock
    private PriorityQueue<MyBeacon> mockVisibleBeacons;

    @Mock
    private MapGraph mockMapGraph;

    @Before
    public void setUp() throws Exception {
        navigatorImp = new NavigatorImp(mockCompass);

        when(mockCompass.getLastCoordinate()).thenReturn(new Float(180));
    }

    @Test(expected = NoGraphSetException.class)
    public void testCalculatePathException() throws Exception {
        navigatorImp.calculatePath(mockStartRoi, mockEndRoi);
        fail("Should throw NoGraphException");
    }

    @Test(expected = NullPointerException.class)
    public void testSetGraph() throws Exception {
        navigatorImp.setGraph(mockMapGraph);
        navigatorImp.calculatePath(mockStartRoi, mockEndRoi);
    }

    @Test(expected = NoNavigationInformationException.class)
    public void testGetAllInstructionsException() throws Exception {
        navigatorImp.getAllInstructions();
        fail("Should throw NoNavigationInformationException");
        //TODO: come testare path che è istanziato all'interno della classe
    }

    @Test
    public void testToNextRegion() throws Exception {
        //TODO: come lo verifico senza utilizzare dati?
        // CalculatePath di JGraphT ha bisogno di dati
        /*navigatorImp.setGraph(mockMapGraph);
        navigatorImp.calculatePath(mockStartRoi, mockEndRoi);
        navigatorImp.toNextRegion(mockVisibleBeacons);*/
    }
}
package com.leaf.clips.model.navigator;
/**
 * @author Eduard Bicego
 * @version 0.01
 * @since 0.00
 */
import com.leaf.clips.model.navigator.graph.navigationinformation.PhotoInformation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * TU7
 */
@RunWith(MockitoJUnitRunner.class)
public class ProcessedInformationImpTest {

    private static final String FAKE_BASIC_INFORMATION = "FakeBasicInformation";
    private static final String FAKE_DETAIL_INFORMATION = "FakeDetailInformation";
    @Mock
    private PhotoInformation mockPhotoInformation;


    private ProcessedInformationImp processedInformationImp;

    @Mock
    private EnrichedEdge mockEnrichedEdge;


    @Before
    public void setUp() throws Exception {
        when(mockEnrichedEdge.getBasicInformation()).thenReturn(FAKE_BASIC_INFORMATION);
        when(mockEnrichedEdge.getDetailInformation()).thenReturn(FAKE_DETAIL_INFORMATION);
        when(mockEnrichedEdge.getPhotoInformation()).thenReturn(mockPhotoInformation);

        processedInformationImp = new ProcessedInformationImp(mockEnrichedEdge);
    }

    /*@Test
    public void testBuildProcessedInformationImp() throws Exception {
        when(mockEnrichedEdge.getBasicInformation()).thenReturn(FAKE_BASIC_INFORMATION);
        when(mockEnrichedEdge.getDetailInformation()).thenReturn(FAKE_DETAIL_INFORMATION);
        when(mockEnrichedEdge.getPhotoInformation()).thenReturn(mockPhotoInformation);

        processedInformationImp = new ProcessedInformationImp(mockEnrichedEdge);
    }*/

    @Test
    public void testGettingAttribute() throws Exception {
        assertEquals("Different basic info", processedInformationImp.getProcessedBasicInstruction(), FAKE_BASIC_INFORMATION);
        assertEquals("Different detail info", processedInformationImp.getDetailedInstruction(), FAKE_DETAIL_INFORMATION);
        assertEquals("Different PhotoInformation info", processedInformationImp.getPhotoInstruction(), processedInformationImp);
    }
}
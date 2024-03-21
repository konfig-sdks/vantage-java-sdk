/*
 * Vantage
 * Vantage API
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@vantage.sh
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.PostSegments;
import com.konfigthis.client.model.PostSegmentsReportSettings;
import com.konfigthis.client.model.PutSegments;
import com.konfigthis.client.model.Segment;
import com.konfigthis.client.model.Segments;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SegmentsApi
 */
@Disabled
public class SegmentsApiTest {

    private static SegmentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new SegmentsApi(apiClient);
    }

    /**
     * Create a Segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSegmentTest() throws ApiException {
        String title = null;
        String description = null;
        Integer priority = null;
        Boolean trackUnallocated = null;
        PostSegmentsReportSettings reportSettings = null;
        String workspaceToken = null;
        String filter = null;
        String parentSegmentToken = null;
        Segment response = api.createSegment(title)
                .description(description)
                .priority(priority)
                .trackUnallocated(trackUnallocated)
                .reportSettings(reportSettings)
                .workspaceToken(workspaceToken)
                .filter(filter)
                .parentSegmentToken(parentSegmentToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a Segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSegmentByIdTest() throws ApiException {
        String segmentToken = null;
        Segment response = api.getSegmentById(segmentToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Segments.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        Segments response = api.list()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeSegmentTest() throws ApiException {
        String segmentToken = null;
        Segment response = api.removeSegment(segmentToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Segment.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSegmentByIdTest() throws ApiException {
        String segmentToken = null;
        String title = null;
        String description = null;
        Integer priority = null;
        Boolean trackUnallocated = null;
        PostSegmentsReportSettings reportSettings = null;
        String filter = null;
        String parentSegmentToken = null;
        Segment response = api.updateSegmentById(segmentToken)
                .title(title)
                .description(description)
                .priority(priority)
                .trackUnallocated(trackUnallocated)
                .reportSettings(reportSettings)
                .filter(filter)
                .parentSegmentToken(parentSegmentToken)
                .execute();
        // TODO: test validations
    }

}

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
import com.konfigthis.client.model.CostReport;
import com.konfigthis.client.model.CostReports;
import com.konfigthis.client.model.Costs;
import com.konfigthis.client.model.Dashboard;
import com.konfigthis.client.model.Dashboards;
import com.konfigthis.client.model.PostCostReports;
import com.konfigthis.client.model.PostCostReportsBusinessMetricTokensWithMetadataInner;
import com.konfigthis.client.model.PostCostReportsSettings;
import com.konfigthis.client.model.PostDashboards;
import com.konfigthis.client.model.PutCostReports;
import com.konfigthis.client.model.PutCostReportsBusinessMetricTokensWithMetadataInner;
import com.konfigthis.client.model.PutCostReportsSettings;
import com.konfigthis.client.model.PutDashboards;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CostsApi
 */
@Disabled
public class CostsApiTest {

    private static CostsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new CostsApi(apiClient);
    }

    /**
     * Create a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDashboardTest() throws ApiException {
        String title = null;
        String endDate = null;
        List<String> widgetTokens = null;
        List<String> savedFilterTokens = null;
        String dateBin = null;
        String dateInterval = null;
        String startDate = null;
        String workspaceToken = null;
        Dashboard response = api.createDashboard(title, endDate)
                .widgetTokens(widgetTokens)
                .savedFilterTokens(savedFilterTokens)
                .dateBin(dateBin)
                .dateInterval(dateInterval)
                .startDate(startDate)
                .workspaceToken(workspaceToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Create a CostReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createReportTest() throws ApiException {
        String title = null;
        String workspaceToken = null;
        String groupings = null;
        String filter = null;
        List<String> savedFilterTokens = null;
        List<PostCostReportsBusinessMetricTokensWithMetadataInner> businessMetricTokensWithMetadata = null;
        String folderToken = null;
        PostCostReportsSettings settings = null;
        CostReport response = api.createReport(title)
                .workspaceToken(workspaceToken)
                .groupings(groupings)
                .filter(filter)
                .savedFilterTokens(savedFilterTokens)
                .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
                .folderToken(folderToken)
                .settings(settings)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a CostReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCostReportTest() throws ApiException {
        String costReportToken = null;
        CostReport response = api.deleteCostReport(costReportToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDashboardTest() throws ApiException {
        String dashboardToken = null;
        Dashboard response = api.deleteDashboard(dashboardToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Dashboards.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        Dashboards response = api.getAll()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all CostReports.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllCostReportsTest() throws ApiException {
        Integer page = null;
        Integer limit = null;
        CostReports response = api.getAllCostReports()
                .page(page)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a CostReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCostReportTest() throws ApiException {
        String costReportToken = null;
        CostReport response = api.getCostReport(costReportToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return a specific Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSpecificDashboardTest() throws ApiException {
        String dashboardToken = null;
        Dashboard response = api.getSpecificDashboard(dashboardToken)
                .execute();
        // TODO: test validations
    }

    /**
     * Return all Costs for a CostReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listCostReportTest() throws ApiException {
        String costReportToken = null;
        String startDate = null;
        String endDate = null;
        List<String> groupings = null;
        String order = null;
        Integer limit = null;
        Costs response = api.listCostReport(costReportToken)
                .startDate(startDate)
                .endDate(endDate)
                .groupings(groupings)
                .order(order)
                .limit(limit)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a Dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDashboardTest() throws ApiException {
        String endDate = null;
        String dashboardToken = null;
        String title = null;
        List<String> widgetTokens = null;
        List<String> savedFilterTokens = null;
        String dateBin = null;
        String dateInterval = null;
        String startDate = null;
        Dashboard response = api.updateDashboard(endDate, dashboardToken)
                .title(title)
                .widgetTokens(widgetTokens)
                .savedFilterTokens(savedFilterTokens)
                .dateBin(dateBin)
                .dateInterval(dateInterval)
                .startDate(startDate)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a CostReport.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateReportTest() throws ApiException {
        String costReportToken = null;
        String title = null;
        String groupings = null;
        String filter = null;
        List<String> savedFilterTokens = null;
        List<PutCostReportsBusinessMetricTokensWithMetadataInner> businessMetricTokensWithMetadata = null;
        String folderToken = null;
        PutCostReportsSettings settings = null;
        CostReport response = api.updateReport(costReportToken)
                .title(title)
                .groupings(groupings)
                .filter(filter)
                .savedFilterTokens(savedFilterTokens)
                .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
                .folderToken(folderToken)
                .settings(settings)
                .execute();
        // TODO: test validations
    }

}

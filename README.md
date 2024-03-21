<div align="center">

[![Visit Vantage](./header.png)](https://vantage.sh)

# [Vantage](https://vantage.sh)

Vantage API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Vantage&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>vantage-java-sdk</artifactId>
  <version>2.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:vantage-java-sdk:2.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/vantage-java-sdk-2.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.AccessGrantsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.vantage.sh/v2";
    // Configure OAuth2 client credentials for "application" OAuth flow
    String clientId = System.getenv("CLIENT_ID");
    String clientSecret = System.getenv("CLIENT_SECRET");
    configuration.clientId = "clientId";
    configuration.clientSecret = "clientSecret";
    
    Vantage client = new Vantage(configuration);
    String resourceToken = "resourceToken_example"; // The token of the resource for which you are granting access.
    String teamToken = "teamToken_example"; // The token of the Team you want to grant access to.
    String access = "denied"; // The access level you want to grant. Defaults to 'allowed'.
    try {
      AccessGrant result = client
              .accessGrants
              .createGrant(resourceToken, teamToken)
              .access(access)
              .execute();
      System.out.println(result);
      System.out.println(result.getToken());
      System.out.println(result.getResourceToken());
      System.out.println(result.getAccess());
      System.out.println(result.getTeamToken());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getCreatedBy());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGrantsApi#createGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AccessGrant> response = client
              .accessGrants
              .createGrant(resourceToken, teamToken)
              .access(access)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling AccessGrantsApi#createGrant");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.vantage.sh/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccessGrantsApi* | [**createGrant**](docs/AccessGrantsApi.md#createGrant) | **POST** /access_grants | 
*AccessGrantsApi* | [**delete**](docs/AccessGrantsApi.md#delete) | **DELETE** /access_grants/{access_grant_token} | 
*AccessGrantsApi* | [**getSpecificGrant**](docs/AccessGrantsApi.md#getSpecificGrant) | **GET** /access_grants/{access_grant_token} | 
*AccessGrantsApi* | [**listAccessible**](docs/AccessGrantsApi.md#listAccessible) | **GET** /access_grants | 
*AccessGrantsApi* | [**updateGrantToken**](docs/AccessGrantsApi.md#updateGrantToken) | **PUT** /access_grants/{access_grant_token} | 
*BusinessMetricsApi* | [**createNewMetric**](docs/BusinessMetricsApi.md#createNewMetric) | **POST** /business_metrics | 
*BusinessMetricsApi* | [**deleteExistingMetric**](docs/BusinessMetricsApi.md#deleteExistingMetric) | **DELETE** /business_metrics/{business_metric_token} | 
*BusinessMetricsApi* | [**getAllMetrics**](docs/BusinessMetricsApi.md#getAllMetrics) | **GET** /business_metrics | 
*BusinessMetricsApi* | [**getMetricById**](docs/BusinessMetricsApi.md#getMetricById) | **GET** /business_metrics/{business_metric_token} | 
*BusinessMetricsApi* | [**updateExistingMetric**](docs/BusinessMetricsApi.md#updateExistingMetric) | **PUT** /business_metrics/{business_metric_token} | 
*BusinessMetricsApi* | [**updateValuesCsv**](docs/BusinessMetricsApi.md#updateValuesCsv) | **PUT** /business_metrics/{business_metric_token}/values.csv | 
*CostsApi* | [**createDashboard**](docs/CostsApi.md#createDashboard) | **POST** /dashboards | 
*CostsApi* | [**createReport**](docs/CostsApi.md#createReport) | **POST** /cost_reports | 
*CostsApi* | [**deleteCostReport**](docs/CostsApi.md#deleteCostReport) | **DELETE** /cost_reports/{cost_report_token} | 
*CostsApi* | [**deleteDashboard**](docs/CostsApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_token} | 
*CostsApi* | [**getAll**](docs/CostsApi.md#getAll) | **GET** /dashboards | 
*CostsApi* | [**getAllCostReports**](docs/CostsApi.md#getAllCostReports) | **GET** /cost_reports | 
*CostsApi* | [**getCostReport**](docs/CostsApi.md#getCostReport) | **GET** /cost_reports/{cost_report_token} | 
*CostsApi* | [**getSpecificDashboard**](docs/CostsApi.md#getSpecificDashboard) | **GET** /dashboards/{dashboard_token} | 
*CostsApi* | [**listCostReport**](docs/CostsApi.md#listCostReport) | **GET** /costs | 
*CostsApi* | [**updateDashboard**](docs/CostsApi.md#updateDashboard) | **PUT** /dashboards/{dashboard_token} | 
*CostsApi* | [**updateReport**](docs/CostsApi.md#updateReport) | **PUT** /cost_reports/{cost_report_token} | 
*DashboardsApi* | [**createDashboard**](docs/DashboardsApi.md#createDashboard) | **POST** /dashboards | 
*DashboardsApi* | [**deleteDashboard**](docs/DashboardsApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_token} | 
*DashboardsApi* | [**getAll**](docs/DashboardsApi.md#getAll) | **GET** /dashboards | 
*DashboardsApi* | [**getSpecificDashboard**](docs/DashboardsApi.md#getSpecificDashboard) | **GET** /dashboards/{dashboard_token} | 
*DashboardsApi* | [**updateDashboard**](docs/DashboardsApi.md#updateDashboard) | **PUT** /dashboards/{dashboard_token} | 
*FiltersApi* | [**createSavedFilterForCostReports**](docs/FiltersApi.md#createSavedFilterForCostReports) | **POST** /saved_filters | 
*FiltersApi* | [**deleteSavedFilter**](docs/FiltersApi.md#deleteSavedFilter) | **DELETE** /saved_filters/{saved_filter_token} | 
*FiltersApi* | [**getCostReportFilters**](docs/FiltersApi.md#getCostReportFilters) | **GET** /saved_filters | 
*FiltersApi* | [**getSavedFilter**](docs/FiltersApi.md#getSavedFilter) | **GET** /saved_filters/{saved_filter_token} | 
*FiltersApi* | [**updateSavedFilterForCostReports**](docs/FiltersApi.md#updateSavedFilterForCostReports) | **PUT** /saved_filters/{saved_filter_token} | 
*FoldersApi* | [**createFolderForCostReports**](docs/FoldersApi.md#createFolderForCostReports) | **POST** /folders | 
*FoldersApi* | [**deleteFolderForCostReports**](docs/FoldersApi.md#deleteFolderForCostReports) | **DELETE** /folders/{folder_token} | 
*FoldersApi* | [**getSpecificFolder**](docs/FoldersApi.md#getSpecificFolder) | **GET** /folders/{folder_token} | 
*FoldersApi* | [**listCostReports**](docs/FoldersApi.md#listCostReports) | **GET** /folders | 
*FoldersApi* | [**updateFolderForCostReports**](docs/FoldersApi.md#updateFolderForCostReports) | **PUT** /folders/{folder_token} | 
*NotificationsApi* | [**createReportNotification**](docs/NotificationsApi.md#createReportNotification) | **POST** /report_notifications | 
*NotificationsApi* | [**deleteReportNotification**](docs/NotificationsApi.md#deleteReportNotification) | **DELETE** /report_notifications/{report_notification_token} | 
*NotificationsApi* | [**getAllReportNotifications**](docs/NotificationsApi.md#getAllReportNotifications) | **GET** /report_notifications | 
*NotificationsApi* | [**getReportNotification**](docs/NotificationsApi.md#getReportNotification) | **GET** /report_notifications/{report_notification_token} | 
*NotificationsApi* | [**updateReportNotification**](docs/NotificationsApi.md#updateReportNotification) | **PUT** /report_notifications/{report_notification_token} | 
*PingApi* | [**healthCheck**](docs/PingApi.md#healthCheck) | **GET** /ping | 
*PricesApi* | [**getProduct**](docs/PricesApi.md#getProduct) | **GET** /products/{id} | 
*PricesApi* | [**getProductPrice**](docs/PricesApi.md#getProductPrice) | **GET** /products/{product_id}/prices/{id} | 
*PricesApi* | [**getProductPrices**](docs/PricesApi.md#getProductPrices) | **GET** /products/{product_id}/prices | 
*PricesApi* | [**listAvailableProducts**](docs/PricesApi.md#listAvailableProducts) | **GET** /products | 
*SegmentsApi* | [**createSegment**](docs/SegmentsApi.md#createSegment) | **POST** /segments | 
*SegmentsApi* | [**getSegmentById**](docs/SegmentsApi.md#getSegmentById) | **GET** /segments/{segment_token} | 
*SegmentsApi* | [**list**](docs/SegmentsApi.md#list) | **GET** /segments | 
*SegmentsApi* | [**removeSegment**](docs/SegmentsApi.md#removeSegment) | **DELETE** /segments/{segment_token} | 
*SegmentsApi* | [**updateSegmentById**](docs/SegmentsApi.md#updateSegmentById) | **PUT** /segments/{segment_token} | 
*TeamsApi* | [**createNewTeam**](docs/TeamsApi.md#createNewTeam) | **POST** /teams | 
*TeamsApi* | [**getSpecificTeam**](docs/TeamsApi.md#getSpecificTeam) | **GET** /teams/{team_token} | 
*TeamsApi* | [**listAccessible**](docs/TeamsApi.md#listAccessible) | **GET** /teams | 
*TeamsApi* | [**removeTeam**](docs/TeamsApi.md#removeTeam) | **DELETE** /teams/{team_token} | 
*TeamsApi* | [**updateTeam**](docs/TeamsApi.md#updateTeam) | **PUT** /teams/{team_token} | 
*UsersApi* | [**getSpecificUser**](docs/UsersApi.md#getSpecificUser) | **GET** /users/{user_token} | 
*UsersApi* | [**listAccessible**](docs/UsersApi.md#listAccessible) | **GET** /users | 
*WorkspacesApi* | [**getSpecificWorkspace**](docs/WorkspacesApi.md#getSpecificWorkspace) | **GET** /workspaces/{workspace_token} | 
*WorkspacesApi* | [**listAccessible**](docs/WorkspacesApi.md#listAccessible) | **GET** /workspaces | 


## Documentation for Models

 - [AccessGrant](docs/AccessGrant.md)
 - [AccessGrants](docs/AccessGrants.md)
 - [BusinessMetric](docs/BusinessMetric.md)
 - [BusinessMetrics](docs/BusinessMetrics.md)
 - [BusinessMetricsUpdateValuesCsvRequest](docs/BusinessMetricsUpdateValuesCsvRequest.md)
 - [Cost](docs/Cost.md)
 - [CostReport](docs/CostReport.md)
 - [CostReportSettings](docs/CostReportSettings.md)
 - [CostReports](docs/CostReports.md)
 - [Costs](docs/Costs.md)
 - [Dashboard](docs/Dashboard.md)
 - [Dashboards](docs/Dashboards.md)
 - [Folder](docs/Folder.md)
 - [Folders](docs/Folders.md)
 - [PostAccessGrants](docs/PostAccessGrants.md)
 - [PostBusinessMetrics](docs/PostBusinessMetrics.md)
 - [PostBusinessMetricsCostReportTokensWithMetadataInner](docs/PostBusinessMetricsCostReportTokensWithMetadataInner.md)
 - [PostBusinessMetricsValuesInner](docs/PostBusinessMetricsValuesInner.md)
 - [PostCostReports](docs/PostCostReports.md)
 - [PostCostReportsBusinessMetricTokensWithMetadataInner](docs/PostCostReportsBusinessMetricTokensWithMetadataInner.md)
 - [PostCostReportsSettings](docs/PostCostReportsSettings.md)
 - [PostDashboards](docs/PostDashboards.md)
 - [PostFolders](docs/PostFolders.md)
 - [PostReportNotifications](docs/PostReportNotifications.md)
 - [PostSavedFilters](docs/PostSavedFilters.md)
 - [PostSegments](docs/PostSegments.md)
 - [PostSegmentsReportSettings](docs/PostSegmentsReportSettings.md)
 - [PostTeams](docs/PostTeams.md)
 - [Price](docs/Price.md)
 - [Prices](docs/Prices.md)
 - [Product](docs/Product.md)
 - [Products](docs/Products.md)
 - [PutAccessGrants](docs/PutAccessGrants.md)
 - [PutBusinessMetrics](docs/PutBusinessMetrics.md)
 - [PutBusinessMetricsCostReportTokensWithMetadataInner](docs/PutBusinessMetricsCostReportTokensWithMetadataInner.md)
 - [PutCostReports](docs/PutCostReports.md)
 - [PutCostReportsBusinessMetricTokensWithMetadataInner](docs/PutCostReportsBusinessMetricTokensWithMetadataInner.md)
 - [PutCostReportsSettings](docs/PutCostReportsSettings.md)
 - [PutDashboards](docs/PutDashboards.md)
 - [PutFolders](docs/PutFolders.md)
 - [PutReportNotifications](docs/PutReportNotifications.md)
 - [PutSavedFilters](docs/PutSavedFilters.md)
 - [PutSegments](docs/PutSegments.md)
 - [PutTeams](docs/PutTeams.md)
 - [ReportNotification](docs/ReportNotification.md)
 - [ReportNotifications](docs/ReportNotifications.md)
 - [SavedFilter](docs/SavedFilter.md)
 - [SavedFilters](docs/SavedFilters.md)
 - [Segment](docs/Segment.md)
 - [SegmentReportSettings](docs/SegmentReportSettings.md)
 - [Segments](docs/Segments.md)
 - [Team](docs/Team.md)
 - [Teams](docs/Teams.md)
 - [User](docs/User.md)
 - [Users](docs/Users.md)
 - [Workspace](docs/Workspace.md)
 - [Workspaces](docs/Workspaces.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)

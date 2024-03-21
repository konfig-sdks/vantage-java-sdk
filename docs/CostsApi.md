# CostsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboard**](CostsApi.md#createDashboard) | **POST** /dashboards |  |
| [**createReport**](CostsApi.md#createReport) | **POST** /cost_reports |  |
| [**deleteCostReport**](CostsApi.md#deleteCostReport) | **DELETE** /cost_reports/{cost_report_token} |  |
| [**deleteDashboard**](CostsApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_token} |  |
| [**getAll**](CostsApi.md#getAll) | **GET** /dashboards |  |
| [**getAllCostReports**](CostsApi.md#getAllCostReports) | **GET** /cost_reports |  |
| [**getCostReport**](CostsApi.md#getCostReport) | **GET** /cost_reports/{cost_report_token} |  |
| [**getSpecificDashboard**](CostsApi.md#getSpecificDashboard) | **GET** /dashboards/{dashboard_token} |  |
| [**listCostReport**](CostsApi.md#listCostReport) | **GET** /costs |  |
| [**updateDashboard**](CostsApi.md#updateDashboard) | **PUT** /dashboards/{dashboard_token} |  |
| [**updateReport**](CostsApi.md#updateReport) | **PUT** /cost_reports/{cost_report_token} |  |


<a name="createDashboard"></a>
# **createDashboard**
> Dashboard createDashboard(postDashboards).execute();



Create a Dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String title = "title_example"; // The title of the Dashboard.
    String endDate = "endDate_example"; // The end date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with 'date_interval' parameter.
    List<String> widgetTokens = Arrays.asList(); // The tokens of the widgets to add to the Dashboard. Currently only supports CostReport tokens.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the Saved Filters used in the Dashboard.
    String dateBin = "cumulative"; // Determines how to group costs in the Dashboard.
    String dateInterval = "this_month"; // Determines the date range in the Dashboard. Incompatible with 'start_date' and 'end_date' parameters.
    String startDate = "startDate_example"; // The start date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with 'date_interval' parameter.
    String workspaceToken = "workspaceToken_example"; // The token of the Workspace to add the Dashboard to. Required if the API token is associated with multiple Workspaces.
    try {
      Dashboard result = client
              .costs
              .createDashboard(title, endDate)
              .widgetTokens(widgetTokens)
              .savedFilterTokens(savedFilterTokens)
              .dateBin(dateBin)
              .dateInterval(dateInterval)
              .startDate(startDate)
              .workspaceToken(workspaceToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getWidgetTokens());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getDateBin());
      System.out.println(result.getDateInterval());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#createDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .costs
              .createDashboard(title, endDate)
              .widgetTokens(widgetTokens)
              .savedFilterTokens(savedFilterTokens)
              .dateBin(dateBin)
              .dateInterval(dateInterval)
              .startDate(startDate)
              .workspaceToken(workspaceToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#createDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postDashboards** | [**PostDashboards**](PostDashboards.md)|  | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="createReport"></a>
# **createReport**
> CostReport createReport(postCostReports).execute();



Create a CostReport.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String title = "title_example"; // The title of the CostReport.
    String workspaceToken = "workspaceToken_example"; // The token of the Workspace to add the Cost Report to. Ignored if 'folder_token' is set. Required if the API token is associated with multiple Workspaces.
    String groupings = "groupings_example"; // Grouping values for aggregating costs on the report. Valid groupings: account_id, billing_account_id, charge_type, cost_category, cost_subcategory, provider, region, resource_id, service, tagged, tag:<tag_value>. If providing multiple groupings, join as comma separated values: groupings=provider,service,region
    String filter = "filter_example"; // The filter query language to apply to the CostReport. Additional documentation available at https://docs.vantage.sh/vql.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the SavedFilters to apply to the CostReport.
    List<PostCostReportsBusinessMetricTokensWithMetadataInner> businessMetricTokensWithMetadata = Arrays.asList(); // The tokens for any BusinessMetrics to attach to the CostReport, and the unit scale.
    String folderToken = "folderToken_example"; // The token of the Folder to add the CostReport to. Determines the Workspace the report is assigned to.
    PostCostReportsSettings settings = new PostCostReportsSettings();
    try {
      CostReport result = client
              .costs
              .createReport(title)
              .workspaceToken(workspaceToken)
              .groupings(groupings)
              .filter(filter)
              .savedFilterTokens(savedFilterTokens)
              .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
              .folderToken(folderToken)
              .settings(settings)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getBusinessMetricTokensWithMetadata());
      System.out.println(result.getFilter());
      System.out.println(result.getGroupings());
      System.out.println(result.getSettings());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#createReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostReport> response = client
              .costs
              .createReport(title)
              .workspaceToken(workspaceToken)
              .groupings(groupings)
              .filter(filter)
              .savedFilterTokens(savedFilterTokens)
              .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
              .folderToken(folderToken)
              .settings(settings)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#createReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **postCostReports** | [**PostCostReports**](PostCostReports.md)|  | |

### Return type

[**CostReport**](CostReport.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteCostReport"></a>
# **deleteCostReport**
> CostReport deleteCostReport(costReportToken).execute();



Delete a CostReport.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String costReportToken = "costReportToken_example";
    try {
      CostReport result = client
              .costs
              .deleteCostReport(costReportToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getBusinessMetricTokensWithMetadata());
      System.out.println(result.getFilter());
      System.out.println(result.getGroupings());
      System.out.println(result.getSettings());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#deleteCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostReport> response = client
              .costs
              .deleteCostReport(costReportToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#deleteCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **costReportToken** | **String**|  | |

### Return type

[**CostReport**](CostReport.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="deleteDashboard"></a>
# **deleteDashboard**
> Dashboard deleteDashboard(dashboardToken).execute();



Delete a Dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String dashboardToken = "dashboardToken_example";
    try {
      Dashboard result = client
              .costs
              .deleteDashboard(dashboardToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getWidgetTokens());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getDateBin());
      System.out.println(result.getDateInterval());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#deleteDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .costs
              .deleteDashboard(dashboardToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#deleteDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardToken** | **String**|  | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="getAll"></a>
# **getAll**
> Dashboards getAll().page(page).limit(limit).execute();



Return all Dashboards.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    Integer page = 56; // The page of results to return.
    Integer limit = 56; // The amount of results to return. The maximum is 1000.
    try {
      Dashboards result = client
              .costs
              .getAll()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getDashboards());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboards> response = client
              .costs
              .getAll()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The page of results to return. | [optional] |
| **limit** | **Integer**| The amount of results to return. The maximum is 1000. | [optional] |

### Return type

[**Dashboards**](Dashboards.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getAllCostReports"></a>
# **getAllCostReports**
> CostReports getAllCostReports().page(page).limit(limit).execute();



Return all CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    Integer page = 56; // The page of results to return.
    Integer limit = 56; // The amount of results to return. The maximum is 1000.
    try {
      CostReports result = client
              .costs
              .getAllCostReports()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getCostReports());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getAllCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostReports> response = client
              .costs
              .getAllCostReports()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getAllCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The page of results to return. | [optional] |
| **limit** | **Integer**| The amount of results to return. The maximum is 1000. | [optional] |

### Return type

[**CostReports**](CostReports.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getCostReport"></a>
# **getCostReport**
> CostReport getCostReport(costReportToken).execute();



Return a CostReport.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String costReportToken = "costReportToken_example";
    try {
      CostReport result = client
              .costs
              .getCostReport(costReportToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getBusinessMetricTokensWithMetadata());
      System.out.println(result.getFilter());
      System.out.println(result.getGroupings());
      System.out.println(result.getSettings());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostReport> response = client
              .costs
              .getCostReport(costReportToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **costReportToken** | **String**|  | |

### Return type

[**CostReport**](CostReport.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getSpecificDashboard"></a>
# **getSpecificDashboard**
> Dashboard getSpecificDashboard(dashboardToken).execute();



Return a specific Dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String dashboardToken = "dashboardToken_example";
    try {
      Dashboard result = client
              .costs
              .getSpecificDashboard(dashboardToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getWidgetTokens());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getDateBin());
      System.out.println(result.getDateInterval());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getSpecificDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .costs
              .getSpecificDashboard(dashboardToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#getSpecificDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardToken** | **String**|  | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listCostReport"></a>
# **listCostReport**
> Costs listCostReport(costReportToken).startDate(startDate).endDate(endDate).groupings(groupings).order(order).limit(limit).execute();



Return all Costs for a CostReport.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String costReportToken = "costReportToken_example"; // The CostReport token.
    String startDate = "startDate_example"; // First date you would like to filter costs from. ISO 8601 formatted.
    String endDate = "endDate_example"; // Last date you would like to filter costs to. ISO 8601 formatted.
    List<String> groupings = Arrays.asList(); // Group the results by specific field(s). Defaults to provider, service, account_id. Valid groupings: account_id, billing_account_id, charge_type, cost_category, cost_subcategory, provider, region, resource_id, service, tagged, tag:<tag_value>. If providing multiple groupings, join as comma separated values: groupings=provider,service,region
    String order = "asc"; // Whether to order costs by date in an ascending or descending manner.
    Integer limit = 56; // The amount of results to return. The maximum is 1000.
    try {
      Costs result = client
              .costs
              .listCostReport(costReportToken)
              .startDate(startDate)
              .endDate(endDate)
              .groupings(groupings)
              .order(order)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getTotalCost());
      System.out.println(result.getCosts());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#listCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Costs> response = client
              .costs
              .listCostReport(costReportToken)
              .startDate(startDate)
              .endDate(endDate)
              .groupings(groupings)
              .order(order)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#listCostReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **costReportToken** | **String**| The CostReport token. | |
| **startDate** | **String**| First date you would like to filter costs from. ISO 8601 formatted. | [optional] |
| **endDate** | **String**| Last date you would like to filter costs to. ISO 8601 formatted. | [optional] |
| **groupings** | [**List&lt;String&gt;**](String.md)| Group the results by specific field(s). Defaults to provider, service, account_id. Valid groupings: account_id, billing_account_id, charge_type, cost_category, cost_subcategory, provider, region, resource_id, service, tagged, tag:&lt;tag_value&gt;. If providing multiple groupings, join as comma separated values: groupings&#x3D;provider,service,region | [optional] |
| **order** | **String**| Whether to order costs by date in an ascending or descending manner. | [optional] [default to desc] [enum: asc, desc] |
| **limit** | **Integer**| The amount of results to return. The maximum is 1000. | [optional] |

### Return type

[**Costs**](Costs.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateDashboard"></a>
# **updateDashboard**
> Dashboard updateDashboard(dashboardToken, putDashboards).execute();



Update a Dashboard.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String endDate = "endDate_example"; // The end date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with 'date_interval' parameter.
    String dashboardToken = "dashboardToken_example";
    String title = "title_example"; // The title of the Dashboard.
    List<String> widgetTokens = Arrays.asList(); // The tokens of the widgets to add to the Dashboard. Currently only supports CostReport tokens.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the Saved Filters used in the Dashboard.
    String dateBin = "cumulative"; // Determines how to group costs in the Dashboard.
    String dateInterval = "this_month"; // Determines the date range in the Dashboard. Incompatible with 'start_date' and 'end_date' parameters.
    String startDate = "startDate_example"; // The start date for the date range for costs in the Dashboard. ISO 8601 Formatted. Incompatible with 'date_interval' parameter.
    try {
      Dashboard result = client
              .costs
              .updateDashboard(endDate, dashboardToken)
              .title(title)
              .widgetTokens(widgetTokens)
              .savedFilterTokens(savedFilterTokens)
              .dateBin(dateBin)
              .dateInterval(dateInterval)
              .startDate(startDate)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getWidgetTokens());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getDateBin());
      System.out.println(result.getDateInterval());
      System.out.println(result.getStartDate());
      System.out.println(result.getEndDate());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#updateDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .costs
              .updateDashboard(endDate, dashboardToken)
              .title(title)
              .widgetTokens(widgetTokens)
              .savedFilterTokens(savedFilterTokens)
              .dateBin(dateBin)
              .dateInterval(dateInterval)
              .startDate(startDate)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#updateDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **dashboardToken** | **String**|  | |
| **putDashboards** | [**PutDashboards**](PutDashboards.md)|  | |

### Return type

[**Dashboard**](Dashboard.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateReport"></a>
# **updateReport**
> CostReport updateReport(costReportToken, putCostReports).execute();



Update a CostReport.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CostsApi;
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
    String costReportToken = "costReportToken_example";
    String title = "title_example"; // The title of the CostReport.
    String groupings = "groupings_example"; // Grouping values for aggregating costs on the report. Valid groupings: account_id, billing_account_id, charge_type, cost_category, cost_subcategory, provider, region, resource_id, service, tagged, tag:<tag_value>. If providing multiple groupings, join as comma separated values: groupings=provider,service,region
    String filter = "filter_example"; // The filter query language to apply to the CostReport. Additional documentation available at https://docs.vantage.sh/vql.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the SavedFilters to apply to the CostReport.
    List<PutCostReportsBusinessMetricTokensWithMetadataInner> businessMetricTokensWithMetadata = Arrays.asList(); // The tokens for any BusinessMetrics to attach to the CostReport, and the unit scale.
    String folderToken = "folderToken_example"; // The token of the Folder to add the CostReport to. Determines the Workspace the report is assigned to.
    PutCostReportsSettings settings = new PutCostReportsSettings();
    try {
      CostReport result = client
              .costs
              .updateReport(costReportToken)
              .title(title)
              .groupings(groupings)
              .filter(filter)
              .savedFilterTokens(savedFilterTokens)
              .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
              .folderToken(folderToken)
              .settings(settings)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getBusinessMetricTokensWithMetadata());
      System.out.println(result.getFilter());
      System.out.println(result.getGroupings());
      System.out.println(result.getSettings());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#updateReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CostReport> response = client
              .costs
              .updateReport(costReportToken)
              .title(title)
              .groupings(groupings)
              .filter(filter)
              .savedFilterTokens(savedFilterTokens)
              .businessMetricTokensWithMetadata(businessMetricTokensWithMetadata)
              .folderToken(folderToken)
              .settings(settings)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CostsApi#updateReport");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **costReportToken** | **String**|  | |
| **putCostReports** | [**PutCostReports**](PutCostReports.md)|  | |

### Return type

[**CostReport**](CostReport.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


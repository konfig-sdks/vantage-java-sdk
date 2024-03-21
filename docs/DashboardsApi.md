# DashboardsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /dashboards |  |
| [**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /dashboards/{dashboard_token} |  |
| [**getAll**](DashboardsApi.md#getAll) | **GET** /dashboards |  |
| [**getSpecificDashboard**](DashboardsApi.md#getSpecificDashboard) | **GET** /dashboards/{dashboard_token} |  |
| [**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /dashboards/{dashboard_token} |  |


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
import com.konfigthis.client.api.DashboardsApi;
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
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#createDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#createDashboard");
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
import com.konfigthis.client.api.DashboardsApi;
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
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#deleteDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .deleteDashboard(dashboardToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#deleteDashboard");
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
import com.konfigthis.client.api.DashboardsApi;
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
              .dashboards
              .getAll()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getDashboards());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getAll");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboards> response = client
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#getAll");
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
import com.konfigthis.client.api.DashboardsApi;
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
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#getSpecificDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
              .getSpecificDashboard(dashboardToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getSpecificDashboard");
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
import com.konfigthis.client.api.DashboardsApi;
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
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#updateDashboard");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Dashboard> response = client
              .dashboards
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
      System.err.println("Exception when calling DashboardsApi#updateDashboard");
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


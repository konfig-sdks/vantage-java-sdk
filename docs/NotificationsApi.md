# NotificationsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReportNotification**](NotificationsApi.md#createReportNotification) | **POST** /report_notifications |  |
| [**deleteReportNotification**](NotificationsApi.md#deleteReportNotification) | **DELETE** /report_notifications/{report_notification_token} |  |
| [**getAllReportNotifications**](NotificationsApi.md#getAllReportNotifications) | **GET** /report_notifications |  |
| [**getReportNotification**](NotificationsApi.md#getReportNotification) | **GET** /report_notifications/{report_notification_token} |  |
| [**updateReportNotification**](NotificationsApi.md#updateReportNotification) | **PUT** /report_notifications/{report_notification_token} |  |


<a name="createReportNotification"></a>
# **createReportNotification**
> ReportNotification createReportNotification(postReportNotifications).execute();



Create a ReportNotification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String title = "title_example"; // The title of the ReportNotification.
    String costReportToken = "costReportToken_example"; // The CostReport token.
    String frequency = "frequency_example"; // The frequency the ReportNotification is sent. Possible values: daily, weekly, monthly.
    String change = "change_example"; // The type of change the ReportNotification is tracking. Possible values: percentage, dollars.
    String workspaceToken = "workspaceToken_example"; // The token of the Workspace to add the ReportNotification to. Required if the API token is associated with multiple Workspaces.
    List<String> userTokens = Arrays.asList(); // The Users that receive the notification.
    List<String> recipientChannels = Arrays.asList(); // The Slack or Microsoft Teams channels that receive the notification.
    try {
      ReportNotification result = client
              .notifications
              .createReportNotification(title, costReportToken, frequency, change)
              .workspaceToken(workspaceToken)
              .userTokens(userTokens)
              .recipientChannels(recipientChannels)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCostReportToken());
      System.out.println(result.getUserTokens());
      System.out.println(result.getRecipientChannels());
      System.out.println(result.getFrequency());
      System.out.println(result.getChange());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createReportNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportNotification> response = client
              .notifications
              .createReportNotification(title, costReportToken, frequency, change)
              .workspaceToken(workspaceToken)
              .userTokens(userTokens)
              .recipientChannels(recipientChannels)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#createReportNotification");
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
| **postReportNotifications** | [**PostReportNotifications**](PostReportNotifications.md)|  | |

### Return type

[**ReportNotification**](ReportNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteReportNotification"></a>
# **deleteReportNotification**
> ReportNotification deleteReportNotification(reportNotificationToken).execute();



Delete a ReportNotification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String reportNotificationToken = "reportNotificationToken_example";
    try {
      ReportNotification result = client
              .notifications
              .deleteReportNotification(reportNotificationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCostReportToken());
      System.out.println(result.getUserTokens());
      System.out.println(result.getRecipientChannels());
      System.out.println(result.getFrequency());
      System.out.println(result.getChange());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteReportNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportNotification> response = client
              .notifications
              .deleteReportNotification(reportNotificationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#deleteReportNotification");
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
| **reportNotificationToken** | **String**|  | |

### Return type

[**ReportNotification**](ReportNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="getAllReportNotifications"></a>
# **getAllReportNotifications**
> ReportNotifications getAllReportNotifications().page(page).limit(limit).execute();



Return all ReportNotifications.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
      ReportNotifications result = client
              .notifications
              .getAllReportNotifications()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getReportNotifications());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getAllReportNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportNotifications> response = client
              .notifications
              .getAllReportNotifications()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getAllReportNotifications");
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

[**ReportNotifications**](ReportNotifications.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getReportNotification"></a>
# **getReportNotification**
> ReportNotification getReportNotification(reportNotificationToken).execute();



Return a ReportNotification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String reportNotificationToken = "reportNotificationToken_example";
    try {
      ReportNotification result = client
              .notifications
              .getReportNotification(reportNotificationToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCostReportToken());
      System.out.println(result.getUserTokens());
      System.out.println(result.getRecipientChannels());
      System.out.println(result.getFrequency());
      System.out.println(result.getChange());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getReportNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportNotification> response = client
              .notifications
              .getReportNotification(reportNotificationToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getReportNotification");
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
| **reportNotificationToken** | **String**|  | |

### Return type

[**ReportNotification**](ReportNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateReportNotification"></a>
# **updateReportNotification**
> ReportNotification updateReportNotification(reportNotificationToken, putReportNotifications).execute();



Update a ReportNotification.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
    String reportNotificationToken = "reportNotificationToken_example";
    String title = "title_example"; // The title of the ReportNotification.
    String costReportToken = "costReportToken_example"; // The CostReport token.
    List<String> userTokens = Arrays.asList(); // The Users that receive the notification.
    List<String> recipientChannels = Arrays.asList(); // The Slack or Microsoft Teams channels that receive the notification.
    String frequency = "frequency_example"; // The frequency the ReportNotification is sent. Possible values: daily, weekly, monthly.
    String change = "change_example"; // The type of change the ReportNotification is tracking. Possible values: percentage, dollars.
    try {
      ReportNotification result = client
              .notifications
              .updateReportNotification(reportNotificationToken)
              .title(title)
              .costReportToken(costReportToken)
              .userTokens(userTokens)
              .recipientChannels(recipientChannels)
              .frequency(frequency)
              .change(change)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCostReportToken());
      System.out.println(result.getUserTokens());
      System.out.println(result.getRecipientChannels());
      System.out.println(result.getFrequency());
      System.out.println(result.getChange());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateReportNotification");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportNotification> response = client
              .notifications
              .updateReportNotification(reportNotificationToken)
              .title(title)
              .costReportToken(costReportToken)
              .userTokens(userTokens)
              .recipientChannels(recipientChannels)
              .frequency(frequency)
              .change(change)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#updateReportNotification");
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
| **reportNotificationToken** | **String**|  | |
| **putReportNotifications** | [**PutReportNotifications**](PutReportNotifications.md)|  | |

### Return type

[**ReportNotification**](ReportNotification.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


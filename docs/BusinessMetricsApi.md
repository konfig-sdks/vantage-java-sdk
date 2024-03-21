# BusinessMetricsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewMetric**](BusinessMetricsApi.md#createNewMetric) | **POST** /business_metrics |  |
| [**deleteExistingMetric**](BusinessMetricsApi.md#deleteExistingMetric) | **DELETE** /business_metrics/{business_metric_token} |  |
| [**getAllMetrics**](BusinessMetricsApi.md#getAllMetrics) | **GET** /business_metrics |  |
| [**getMetricById**](BusinessMetricsApi.md#getMetricById) | **GET** /business_metrics/{business_metric_token} |  |
| [**updateExistingMetric**](BusinessMetricsApi.md#updateExistingMetric) | **PUT** /business_metrics/{business_metric_token} |  |
| [**updateValuesCsv**](BusinessMetricsApi.md#updateValuesCsv) | **PUT** /business_metrics/{business_metric_token}/values.csv |  |


<a name="createNewMetric"></a>
# **createNewMetric**
> BusinessMetric createNewMetric(postBusinessMetrics).execute();



Create a new Business Metric.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
    String title = "title_example"; // The title of the Business Metric.
    List<PostBusinessMetricsCostReportTokensWithMetadataInner> costReportTokensWithMetadata = Arrays.asList(); // The tokens for any CostReports that use the BusinessMetric, and the unit scale.
    List<PostBusinessMetricsValuesInner> values = Arrays.asList(); // The dates and amounts for the BusinessMetric.
    try {
      BusinessMetric result = client
              .businessMetrics
              .createNewMetric(title)
              .costReportTokensWithMetadata(costReportTokensWithMetadata)
              .values(values)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCreatedByToken());
      System.out.println(result.getCostReportTokensWithMetadata());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#createNewMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetric> response = client
              .businessMetrics
              .createNewMetric(title)
              .costReportTokensWithMetadata(costReportTokensWithMetadata)
              .values(values)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#createNewMetric");
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
| **postBusinessMetrics** | [**PostBusinessMetrics**](PostBusinessMetrics.md)|  | |

### Return type

[**BusinessMetric**](BusinessMetric.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteExistingMetric"></a>
# **deleteExistingMetric**
> BusinessMetric deleteExistingMetric(businessMetricToken).execute();



Deletes an existing BusinessMetric.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
    String businessMetricToken = "businessMetricToken_example";
    try {
      BusinessMetric result = client
              .businessMetrics
              .deleteExistingMetric(businessMetricToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCreatedByToken());
      System.out.println(result.getCostReportTokensWithMetadata());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#deleteExistingMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetric> response = client
              .businessMetrics
              .deleteExistingMetric(businessMetricToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#deleteExistingMetric");
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
| **businessMetricToken** | **String**|  | |

### Return type

[**BusinessMetric**](BusinessMetric.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="getAllMetrics"></a>
# **getAllMetrics**
> BusinessMetrics getAllMetrics().page(page).limit(limit).execute();



Return all Business Metrics that the current API token has access to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
      BusinessMetrics result = client
              .businessMetrics
              .getAllMetrics()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getBusinessMetrics());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#getAllMetrics");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetrics> response = client
              .businessMetrics
              .getAllMetrics()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#getAllMetrics");
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

[**BusinessMetrics**](BusinessMetrics.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getMetricById"></a>
# **getMetricById**
> BusinessMetric getMetricById(businessMetricToken).execute();



Return a specific Business Metric.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
    String businessMetricToken = "businessMetricToken_example";
    try {
      BusinessMetric result = client
              .businessMetrics
              .getMetricById(businessMetricToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCreatedByToken());
      System.out.println(result.getCostReportTokensWithMetadata());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#getMetricById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetric> response = client
              .businessMetrics
              .getMetricById(businessMetricToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#getMetricById");
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
| **businessMetricToken** | **String**|  | |

### Return type

[**BusinessMetric**](BusinessMetric.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateExistingMetric"></a>
# **updateExistingMetric**
> BusinessMetric updateExistingMetric(businessMetricToken, putBusinessMetrics).execute();



Updates an existing BusinessMetric.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
    String businessMetricToken = "businessMetricToken_example";
    String title = "title_example"; // The title of the BusinessMetric.
    List<PutBusinessMetricsCostReportTokensWithMetadataInner> costReportTokensWithMetadata = Arrays.asList(); // The tokens for any CostReports that use the BusinessMetric, and the unit scale.
    List<PostBusinessMetricsValuesInner> values = Arrays.asList(); // The dates and amounts for the BusinessMetric.
    try {
      BusinessMetric result = client
              .businessMetrics
              .updateExistingMetric(businessMetricToken)
              .title(title)
              .costReportTokensWithMetadata(costReportTokensWithMetadata)
              .values(values)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCreatedByToken());
      System.out.println(result.getCostReportTokensWithMetadata());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#updateExistingMetric");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetric> response = client
              .businessMetrics
              .updateExistingMetric(businessMetricToken)
              .title(title)
              .costReportTokensWithMetadata(costReportTokensWithMetadata)
              .values(values)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#updateExistingMetric");
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
| **businessMetricToken** | **String**|  | |
| **putBusinessMetrics** | [**PutBusinessMetrics**](PutBusinessMetrics.md)|  | |

### Return type

[**BusinessMetric**](BusinessMetric.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="updateValuesCsv"></a>
# **updateValuesCsv**
> BusinessMetric updateValuesCsv(businessMetricToken, csv, businessMetricsUpdateValuesCsvRequest).execute();



Updates the values for an existing BusinessMetric from a CSV file.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.BusinessMetricsApi;
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
    String businessMetricToken = "businessMetricToken_example";
    File csv = new File("/path/to/file"); // CSV file containing BusinessMetric dates and amounts
    try {
      BusinessMetric result = client
              .businessMetrics
              .updateValuesCsv(businessMetricToken, csv)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getCreatedByToken());
      System.out.println(result.getCostReportTokensWithMetadata());
      System.out.println(result.getValues());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#updateValuesCsv");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<BusinessMetric> response = client
              .businessMetrics
              .updateValuesCsv(businessMetricToken, csv)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessMetricsApi#updateValuesCsv");
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
| **businessMetricToken** | **String**|  | |
| **csv** | **File**| CSV file containing BusinessMetric dates and amounts | |
| **businessMetricsUpdateValuesCsvRequest** | [**BusinessMetricsUpdateValuesCsvRequest**](BusinessMetricsUpdateValuesCsvRequest.md)|  | |

### Return type

[**BusinessMetric**](BusinessMetric.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


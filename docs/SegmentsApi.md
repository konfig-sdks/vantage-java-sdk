# SegmentsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSegment**](SegmentsApi.md#createSegment) | **POST** /segments |  |
| [**getSegmentById**](SegmentsApi.md#getSegmentById) | **GET** /segments/{segment_token} |  |
| [**list**](SegmentsApi.md#list) | **GET** /segments |  |
| [**removeSegment**](SegmentsApi.md#removeSegment) | **DELETE** /segments/{segment_token} |  |
| [**updateSegmentById**](SegmentsApi.md#updateSegmentById) | **PUT** /segments/{segment_token} |  |


<a name="createSegment"></a>
# **createSegment**
> Segment createSegment(postSegments).execute();



Create a Segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
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
    String title = "title_example"; // The title of the Segment.
    String description = "description_example"; // The description of the Segment.
    Integer priority = 56; // The priority of the Segment.
    Boolean trackUnallocated = false; // Track Unallocated Costs which are not assigned to any of the created Segments.
    PostSegmentsReportSettings reportSettings = new PostSegmentsReportSettings();
    String workspaceToken = "workspaceToken_example"; // The token of the Workspace to add the Segment to. Ignored if 'segment_token' is set. Required if the API token is associated with multiple Workspaces.
    String filter = "filter_example"; // The filter query language to apply to the Segment. Additional documentation available at https://docs.vantage.sh/vql.
    String parentSegmentToken = "parentSegmentToken_example"; // The token of the parent Segment this new Segment belongs to. Determines the Workspace the segment is assigned to.
    try {
      Segment result = client
              .segments
              .createSegment(title)
              .description(description)
              .priority(priority)
              .trackUnallocated(trackUnallocated)
              .reportSettings(reportSettings)
              .workspaceToken(workspaceToken)
              .filter(filter)
              .parentSegmentToken(parentSegmentToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getParentSegmentToken());
      System.out.println(result.getTrackUnallocated());
      System.out.println(result.getReportSettings());
      System.out.println(result.getPriority());
      System.out.println(result.getFilter());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segment> response = client
              .segments
              .createSegment(title)
              .description(description)
              .priority(priority)
              .trackUnallocated(trackUnallocated)
              .reportSettings(reportSettings)
              .workspaceToken(workspaceToken)
              .filter(filter)
              .parentSegmentToken(parentSegmentToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createSegment");
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
| **postSegments** | [**PostSegments**](PostSegments.md)|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getSegmentById"></a>
# **getSegmentById**
> Segment getSegmentById(segmentToken).execute();



Return a Segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
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
    String segmentToken = "segmentToken_example";
    try {
      Segment result = client
              .segments
              .getSegmentById(segmentToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getParentSegmentToken());
      System.out.println(result.getTrackUnallocated());
      System.out.println(result.getReportSettings());
      System.out.println(result.getPriority());
      System.out.println(result.getFilter());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getSegmentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segment> response = client
              .segments
              .getSegmentById(segmentToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#getSegmentById");
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
| **segmentToken** | **String**|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="list"></a>
# **list**
> Segments list().page(page).limit(limit).execute();



Return all Segments.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
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
      Segments result = client
              .segments
              .list()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getSegments());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#list");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segments> response = client
              .segments
              .list()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#list");
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

[**Segments**](Segments.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeSegment"></a>
# **removeSegment**
> Segment removeSegment(segmentToken).execute();



Delete a Segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
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
    String segmentToken = "segmentToken_example";
    try {
      Segment result = client
              .segments
              .removeSegment(segmentToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getParentSegmentToken());
      System.out.println(result.getTrackUnallocated());
      System.out.println(result.getReportSettings());
      System.out.println(result.getPriority());
      System.out.println(result.getFilter());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#removeSegment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segment> response = client
              .segments
              .removeSegment(segmentToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#removeSegment");
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
| **segmentToken** | **String**|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="updateSegmentById"></a>
# **updateSegmentById**
> Segment updateSegmentById(segmentToken, putSegments).execute();



Update a Segment.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.SegmentsApi;
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
    String segmentToken = "segmentToken_example";
    String title = "title_example"; // The title of the Segment.
    String description = "description_example"; // The description of the Segment.
    Integer priority = 56; // The priority of the Segment.
    Boolean trackUnallocated = false; // Track Unallocated Costs which are not assigned to any of the created Segments.
    PostSegmentsReportSettings reportSettings = new PostSegmentsReportSettings();
    String filter = "filter_example"; // The filter query language to apply to the Segment. Additional documentation available at https://docs.vantage.sh/vql.
    String parentSegmentToken = "parentSegmentToken_example"; // The token of the parent Segment this new Segment belongs to. Determines the Workspace the segment is assigned to.
    try {
      Segment result = client
              .segments
              .updateSegmentById(segmentToken)
              .title(title)
              .description(description)
              .priority(priority)
              .trackUnallocated(trackUnallocated)
              .reportSettings(reportSettings)
              .filter(filter)
              .parentSegmentToken(parentSegmentToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getParentSegmentToken());
      System.out.println(result.getTrackUnallocated());
      System.out.println(result.getReportSettings());
      System.out.println(result.getPriority());
      System.out.println(result.getFilter());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#updateSegmentById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Segment> response = client
              .segments
              .updateSegmentById(segmentToken)
              .title(title)
              .description(description)
              .priority(priority)
              .trackUnallocated(trackUnallocated)
              .reportSettings(reportSettings)
              .filter(filter)
              .parentSegmentToken(parentSegmentToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#updateSegmentById");
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
| **segmentToken** | **String**|  | |
| **putSegments** | [**PutSegments**](PutSegments.md)|  | |

### Return type

[**Segment**](Segment.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


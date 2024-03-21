# PingApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCheck**](PingApi.md#healthCheck) | **GET** /ping |  |


<a name="healthCheck"></a>
# **healthCheck**
> healthCheck().execute();



This is a health check endpoint that can be used to determine Vantage API healthiness. It will return 200 if everything is running smoothly.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.PingApi;
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
    try {
      client
              .ping
              .healthCheck()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling PingApi#healthCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .ping
              .healthCheck()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling PingApi#healthCheck");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This is a health check endpoint that can be used to determine Vantage API healthiness. It will return 200 if everything is running smoothly. |  -  |


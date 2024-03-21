# FoldersApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFolderForCostReports**](FoldersApi.md#createFolderForCostReports) | **POST** /folders |  |
| [**deleteFolderForCostReports**](FoldersApi.md#deleteFolderForCostReports) | **DELETE** /folders/{folder_token} |  |
| [**getSpecificFolder**](FoldersApi.md#getSpecificFolder) | **GET** /folders/{folder_token} |  |
| [**listCostReports**](FoldersApi.md#listCostReports) | **GET** /folders |  |
| [**updateFolderForCostReports**](FoldersApi.md#updateFolderForCostReports) | **PUT** /folders/{folder_token} |  |


<a name="createFolderForCostReports"></a>
# **createFolderForCostReports**
> Folder createFolderForCostReports(postFolders).execute();



Create a Folder for CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String title = "title_example"; // The title of the Folder.
    String parentFolderToken = "parentFolderToken_example"; // The token of the parent Folder.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the SavedFilters to apply to any Cost Report contained within the Folder.
    String workspaceToken = "workspaceToken_example"; // The token of the Workspace to add the Folder to. Ignored if 'parent_folder_token' is set. Required if the API token is associated with multiple Workspaces.
    try {
      Folder result = client
              .folders
              .createFolderForCostReports(title)
              .parentFolderToken(parentFolderToken)
              .savedFilterTokens(savedFilterTokens)
              .workspaceToken(workspaceToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getParentFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#createFolderForCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Folder> response = client
              .folders
              .createFolderForCostReports(title)
              .parentFolderToken(parentFolderToken)
              .savedFilterTokens(savedFilterTokens)
              .workspaceToken(workspaceToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#createFolderForCostReports");
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
| **postFolders** | [**PostFolders**](PostFolders.md)|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="deleteFolderForCostReports"></a>
# **deleteFolderForCostReports**
> Folder deleteFolderForCostReports(folderToken).execute();



Delete a Folder for CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String folderToken = "folderToken_example";
    try {
      Folder result = client
              .folders
              .deleteFolderForCostReports(folderToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getParentFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#deleteFolderForCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Folder> response = client
              .folders
              .deleteFolderForCostReports(folderToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#deleteFolderForCostReports");
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
| **folderToken** | **String**|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="getSpecificFolder"></a>
# **getSpecificFolder**
> Folder getSpecificFolder(folderToken).execute();



Return a specific Folder for CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String folderToken = "folderToken_example";
    try {
      Folder result = client
              .folders
              .getSpecificFolder(folderToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getParentFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#getSpecificFolder");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Folder> response = client
              .folders
              .getSpecificFolder(folderToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#getSpecificFolder");
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
| **folderToken** | **String**|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listCostReports"></a>
# **listCostReports**
> Folders listCostReports().page(page).limit(limit).execute();



Return all Folders for CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
      Folders result = client
              .folders
              .listCostReports()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getFolders());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#listCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Folders> response = client
              .folders
              .listCostReports()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#listCostReports");
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

[**Folders**](Folders.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="updateFolderForCostReports"></a>
# **updateFolderForCostReports**
> Folder updateFolderForCostReports(folderToken, putFolders).execute();



Update a Folder for CostReports.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.FoldersApi;
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
    String folderToken = "folderToken_example";
    String title = "title_example"; // The title of the Folder.
    String parentFolderToken = "parentFolderToken_example"; // The token of the parent Folder.
    List<String> savedFilterTokens = Arrays.asList(); // The tokens of the SavedFilters to apply to any Cost Report contained within the Folder.
    try {
      Folder result = client
              .folders
              .updateFolderForCostReports(folderToken)
              .title(title)
              .parentFolderToken(parentFolderToken)
              .savedFilterTokens(savedFilterTokens)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getToken());
      System.out.println(result.getParentFolderToken());
      System.out.println(result.getSavedFilterTokens());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUpdatedAt());
      System.out.println(result.getWorkspaceToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#updateFolderForCostReports");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Folder> response = client
              .folders
              .updateFolderForCostReports(folderToken)
              .title(title)
              .parentFolderToken(parentFolderToken)
              .savedFilterTokens(savedFilterTokens)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling FoldersApi#updateFolderForCostReports");
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
| **folderToken** | **String**|  | |
| **putFolders** | [**PutFolders**](PutFolders.md)|  | |

### Return type

[**Folder**](Folder.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


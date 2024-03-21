# TeamsApi

All URIs are relative to *https://api.vantage.sh/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewTeam**](TeamsApi.md#createNewTeam) | **POST** /teams |  |
| [**getSpecificTeam**](TeamsApi.md#getSpecificTeam) | **GET** /teams/{team_token} |  |
| [**listAccessible**](TeamsApi.md#listAccessible) | **GET** /teams |  |
| [**removeTeam**](TeamsApi.md#removeTeam) | **DELETE** /teams/{team_token} |  |
| [**updateTeam**](TeamsApi.md#updateTeam) | **PUT** /teams/{team_token} |  |


<a name="createNewTeam"></a>
# **createNewTeam**
> Team createNewTeam(postTeams).execute();



Create a new Team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String name = "name_example"; // The name of the Team.
    String description = "description_example"; // The description of the Team.
    List<String> workspaceTokens = Arrays.asList(); // The Workspace tokens to associate to the Team.
    List<String> userTokens = Arrays.asList(); // The User tokens to associate to the Team.
    List<String> userEmails = Arrays.asList(); // The User emails to associate to the Team.
    String role = "owner"; // The role to assign to the provided Users. Defaults to 'editor' which has editor permissions.
    try {
      Team result = client
              .teams
              .createNewTeam(name)
              .description(description)
              .workspaceTokens(workspaceTokens)
              .userTokens(userTokens)
              .userEmails(userEmails)
              .role(role)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getName());
      System.out.println(result.getWorkspaceTokens());
      System.out.println(result.getUserEmails());
      System.out.println(result.getUserTokens());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createNewTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .createNewTeam(name)
              .description(description)
              .workspaceTokens(workspaceTokens)
              .userTokens(userTokens)
              .userEmails(userEmails)
              .role(role)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#createNewTeam");
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
| **postTeams** | [**PostTeams**](PostTeams.md)|  | |

### Return type

[**Team**](Team.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |

<a name="getSpecificTeam"></a>
# **getSpecificTeam**
> Team getSpecificTeam(teamToken).execute();



Return a specific Team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamToken = "teamToken_example";
    try {
      Team result = client
              .teams
              .getSpecificTeam(teamToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getName());
      System.out.println(result.getWorkspaceTokens());
      System.out.println(result.getUserEmails());
      System.out.println(result.getUserTokens());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getSpecificTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .getSpecificTeam(teamToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#getSpecificTeam");
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
| **teamToken** | **String**|  | |

### Return type

[**Team**](Team.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="listAccessible"></a>
# **listAccessible**
> Teams listAccessible().page(page).limit(limit).execute();



Return all Teams that the current API token has access to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
      Teams result = client
              .teams
              .listAccessible()
              .page(page)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getLinks());
      System.out.println(result.getTeams());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listAccessible");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Teams> response = client
              .teams
              .listAccessible()
              .page(page)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listAccessible");
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

[**Teams**](Teams.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="removeTeam"></a>
# **removeTeam**
> Team removeTeam(teamToken).execute();



Delete a Team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamToken = "teamToken_example";
    try {
      Team result = client
              .teams
              .removeTeam(teamToken)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getName());
      System.out.println(result.getWorkspaceTokens());
      System.out.println(result.getUserEmails());
      System.out.println(result.getUserTokens());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .removeTeam(teamToken)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#removeTeam");
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
| **teamToken** | **String**|  | |

### Return type

[**Team**](Team.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** |  |  -  |

<a name="updateTeam"></a>
# **updateTeam**
> Team updateTeam(teamToken, putTeams).execute();



Update a Team.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Vantage;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.TeamsApi;
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
    String teamToken = "teamToken_example";
    String description = "description_example"; // The description of the Team.
    String name = "name_example"; // The name of the Team.
    List<String> workspaceTokens = Arrays.asList(); // The Workspace tokens to associate to the Team.
    List<String> userTokens = Arrays.asList(); // The User tokens to associate to the Team.
    List<String> userEmails = Arrays.asList(); // The User emails to associate to the Team.
    String role = "owner"; // The role to assign to the provided Users. Defaults to 'editor' which has editor permissions.
    try {
      Team result = client
              .teams
              .updateTeam(teamToken)
              .description(description)
              .name(name)
              .workspaceTokens(workspaceTokens)
              .userTokens(userTokens)
              .userEmails(userEmails)
              .role(role)
              .execute();
      System.out.println(result);
      System.out.println(result.getDescription());
      System.out.println(result.getToken());
      System.out.println(result.getName());
      System.out.println(result.getWorkspaceTokens());
      System.out.println(result.getUserEmails());
      System.out.println(result.getUserTokens());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeam");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Team> response = client
              .teams
              .updateTeam(teamToken)
              .description(description)
              .name(name)
              .workspaceTokens(workspaceTokens)
              .userTokens(userTokens)
              .userEmails(userEmails)
              .role(role)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#updateTeam");
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
| **teamToken** | **String**|  | |
| **putTeams** | [**PutTeams**](PutTeams.md)|  | |

### Return type

[**Team**](Team.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


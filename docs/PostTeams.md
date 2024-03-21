

# PostTeams

Create a new Team.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the Team. |  [optional] |
|**name** | **String** | The name of the Team. |  |
|**workspaceTokens** | **List&lt;String&gt;** | The Workspace tokens to associate to the Team. |  [optional] |
|**userTokens** | **List&lt;String&gt;** | The User tokens to associate to the Team. |  [optional] |
|**userEmails** | **List&lt;String&gt;** | The User emails to associate to the Team. |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | The role to assign to the provided Users. Defaults to &#39;editor&#39; which has editor permissions. |  [optional] |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| OWNER | &quot;owner&quot; |
| EDITOR | &quot;editor&quot; |
| VIEWER | &quot;viewer&quot; |




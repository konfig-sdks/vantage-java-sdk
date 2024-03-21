

# PostAccessGrants

Create an Access Grant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resourceToken** | **String** | The token of the resource for which you are granting access. |  |
|**teamToken** | **String** | The token of the Team you want to grant access to. |  |
|**access** | [**AccessEnum**](#AccessEnum) | The access level you want to grant. Defaults to &#39;allowed&#39;. |  [optional] |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| DENIED | &quot;denied&quot; |
| ALLOWED | &quot;allowed&quot; |




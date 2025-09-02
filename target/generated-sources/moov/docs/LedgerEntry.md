

# LedgerEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entryId** | **String** |  |  |
|**paymentId** | **String** |  |  |
|**side** | [**SideEnum**](#SideEnum) |  |  |
|**amount** | [**Money**](Money.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |



## Enum: SideEnum

| Name | Value |
|---- | -----|
| DEBIT | &quot;DEBIT&quot; |
| CREDIT | &quot;CREDIT&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| RESERVED | &quot;RESERVED&quot; |
| POSTED | &quot;POSTED&quot; |
| REVERSED | &quot;REVERSED&quot; |




# DefaultApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAchCredit**](DefaultApi.md#createAchCredit) | **POST** /ach/credits | Initiate ACH credit via Moov |
| [**createAchDebit**](DefaultApi.md#createAchDebit) | **POST** /ach/debits | Initiate ACH debit via Moov |
| [**getLedgerPayment**](DefaultApi.md#getLedgerPayment) | **GET** /ledger/payments/{paymentId} | Get ledger entries for a payment |
| [**getReconciliationReport**](DefaultApi.md#getReconciliationReport) | **GET** /reconciliation/report | Get reconciliation report for a date |
| [**receiveMoovWebhook**](DefaultApi.md#receiveMoovWebhook) | **POST** /webhooks/moov | Receive Moov webhook |



## createAchCredit

> AchResult createAchCredit(achInstruction)

Initiate ACH credit via Moov

### Example

```java
// Import classes:
import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.ApiException;
import com.pps.sdk.moov.Configuration;
import com.pps.sdk.moov.models.*;
import com.pps.sdk.moov.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8083");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AchInstruction achInstruction = new AchInstruction(); // AchInstruction | 
        try {
            AchResult result = apiInstance.createAchCredit(achInstruction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createAchCredit");
            System.err.println("Status code: " + e.getCode());
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
| **achInstruction** | [**AchInstruction**](AchInstruction.md)|  | |

### Return type

[**AchResult**](AchResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Credit created |  -  |
| **400** | Bad request |  -  |


## createAchDebit

> AchResult createAchDebit(achInstruction)

Initiate ACH debit via Moov

### Example

```java
// Import classes:
import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.ApiException;
import com.pps.sdk.moov.Configuration;
import com.pps.sdk.moov.models.*;
import com.pps.sdk.moov.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8083");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AchInstruction achInstruction = new AchInstruction(); // AchInstruction | 
        try {
            AchResult result = apiInstance.createAchDebit(achInstruction);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createAchDebit");
            System.err.println("Status code: " + e.getCode());
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
| **achInstruction** | [**AchInstruction**](AchInstruction.md)|  | |

### Return type

[**AchResult**](AchResult.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Debit created |  -  |
| **400** | Bad request |  -  |


## getLedgerPayment

> LedgerView getLedgerPayment(paymentId)

Get ledger entries for a payment

### Example

```java
// Import classes:
import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.ApiException;
import com.pps.sdk.moov.Configuration;
import com.pps.sdk.moov.models.*;
import com.pps.sdk.moov.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8083");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String paymentId = "paymentId_example"; // String | 
        try {
            LedgerView result = apiInstance.getLedgerPayment(paymentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getLedgerPayment");
            System.err.println("Status code: " + e.getCode());
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
| **paymentId** | **String**|  | |

### Return type

[**LedgerView**](LedgerView.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ledger entries |  -  |
| **404** | Not found |  -  |


## getReconciliationReport

> ReconciliationReport getReconciliationReport(date)

Get reconciliation report for a date

### Example

```java
// Import classes:
import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.ApiException;
import com.pps.sdk.moov.Configuration;
import com.pps.sdk.moov.models.*;
import com.pps.sdk.moov.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8083");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LocalDate date = LocalDate.now(); // LocalDate | 
        try {
            ReconciliationReport result = apiInstance.getReconciliationReport(date);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getReconciliationReport");
            System.err.println("Status code: " + e.getCode());
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
| **date** | **LocalDate**|  | |

### Return type

[**ReconciliationReport**](ReconciliationReport.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report |  -  |


## receiveMoovWebhook

> receiveMoovWebhook(requestBody)

Receive Moov webhook

### Example

```java
// Import classes:
import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.ApiException;
import com.pps.sdk.moov.Configuration;
import com.pps.sdk.moov.models.*;
import com.pps.sdk.moov.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8083");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Map<String, Object> requestBody = null; // Map<String, Object> | 
        try {
            apiInstance.receiveMoovWebhook(requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#receiveMoovWebhook");
            System.err.println("Status code: " + e.getCode());
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
| **requestBody** | [**Map&lt;String, Object&gt;**](Object.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Accepted |  -  |


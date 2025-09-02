package com.pps.sdk.moov.api;

import com.pps.sdk.moov.ApiClient;
import com.pps.sdk.moov.BaseApi;

import com.pps.sdk.moov.model.AchInstruction;
import com.pps.sdk.moov.model.AchResult;
import com.pps.sdk.moov.model.LedgerView;
import java.time.LocalDate;
import com.pps.sdk.moov.model.ReconciliationReport;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.6.0")
public class DefaultApi extends BaseApi {

    public DefaultApi() {
        super(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        super(apiClient);
    }

    /**
     * Initiate ACH credit via Moov
     * 
     * <p><b>201</b> - Credit created
     * <p><b>400</b> - Bad request
     * @param achInstruction  (required)
     * @return AchResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AchResult createAchCredit(AchInstruction achInstruction) throws RestClientException {
        return createAchCreditWithHttpInfo(achInstruction).getBody();
    }

    /**
     * Initiate ACH credit via Moov
     * 
     * <p><b>201</b> - Credit created
     * <p><b>400</b> - Bad request
     * @param achInstruction  (required)
     * @return ResponseEntity&lt;AchResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AchResult> createAchCreditWithHttpInfo(AchInstruction achInstruction) throws RestClientException {
        Object localVarPostBody = achInstruction;
        
        // verify the required parameter 'achInstruction' is set
        if (achInstruction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'achInstruction' when calling createAchCredit");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AchResult> localReturnType = new ParameterizedTypeReference<AchResult>() {};
        return apiClient.invokeAPI("/ach/credits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Initiate ACH debit via Moov
     * 
     * <p><b>201</b> - Debit created
     * <p><b>400</b> - Bad request
     * @param achInstruction  (required)
     * @return AchResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AchResult createAchDebit(AchInstruction achInstruction) throws RestClientException {
        return createAchDebitWithHttpInfo(achInstruction).getBody();
    }

    /**
     * Initiate ACH debit via Moov
     * 
     * <p><b>201</b> - Debit created
     * <p><b>400</b> - Bad request
     * @param achInstruction  (required)
     * @return ResponseEntity&lt;AchResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AchResult> createAchDebitWithHttpInfo(AchInstruction achInstruction) throws RestClientException {
        Object localVarPostBody = achInstruction;
        
        // verify the required parameter 'achInstruction' is set
        if (achInstruction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'achInstruction' when calling createAchDebit");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AchResult> localReturnType = new ParameterizedTypeReference<AchResult>() {};
        return apiClient.invokeAPI("/ach/debits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ledger entries for a payment
     * 
     * <p><b>200</b> - Ledger entries
     * <p><b>404</b> - Not found
     * @param paymentId  (required)
     * @return LedgerView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LedgerView getLedgerPayment(String paymentId) throws RestClientException {
        return getLedgerPaymentWithHttpInfo(paymentId).getBody();
    }

    /**
     * Get ledger entries for a payment
     * 
     * <p><b>200</b> - Ledger entries
     * <p><b>404</b> - Not found
     * @param paymentId  (required)
     * @return ResponseEntity&lt;LedgerView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LedgerView> getLedgerPaymentWithHttpInfo(String paymentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'paymentId' is set
        if (paymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paymentId' when calling getLedgerPayment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("paymentId", paymentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<LedgerView> localReturnType = new ParameterizedTypeReference<LedgerView>() {};
        return apiClient.invokeAPI("/ledger/payments/{paymentId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get reconciliation report for a date
     * 
     * <p><b>200</b> - Report
     * @param date  (required)
     * @return ReconciliationReport
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReconciliationReport getReconciliationReport(LocalDate date) throws RestClientException {
        return getReconciliationReportWithHttpInfo(date).getBody();
    }

    /**
     * Get reconciliation report for a date
     * 
     * <p><b>200</b> - Report
     * @param date  (required)
     * @return ResponseEntity&lt;ReconciliationReport&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReconciliationReport> getReconciliationReportWithHttpInfo(LocalDate date) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'date' is set
        if (date == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'date' when calling getReconciliationReport");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "date", date));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ReconciliationReport> localReturnType = new ParameterizedTypeReference<ReconciliationReport>() {};
        return apiClient.invokeAPI("/reconciliation/report", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Receive Moov webhook
     * 
     * <p><b>204</b> - Accepted
     * @param requestBody  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void receiveMoovWebhook(Map<String, Object> requestBody) throws RestClientException {
        receiveMoovWebhookWithHttpInfo(requestBody);
    }

    /**
     * Receive Moov webhook
     * 
     * <p><b>204</b> - Accepted
     * @param requestBody  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> receiveMoovWebhookWithHttpInfo(Map<String, Object> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling receiveMoovWebhook");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/webhooks/moov", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }

    @Override
    public <T> ResponseEntity<T> invokeAPI(String url, HttpMethod method, Object request, ParameterizedTypeReference<T> returnType) throws RestClientException {
        String localVarPath = url.replace(apiClient.getBasePath(), "");
        Object localVarPostBody = request;

        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        return apiClient.invokeAPI(localVarPath, method, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, returnType);
    }
}

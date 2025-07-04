/*
 * Allegro REST API
 * https://developer.allegro.pl/about  Documentation is generated from [this OpenAPI 3.0 specification file](https://developer.allegro.pl/swagger.yaml). To start working with our API, you can also check our [official Allegro REST API public collection](https://www.postman.com/allegro-rest-api/allegro-rest-api/collection/4puh6ls/allegro-rest-api) in Postman.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package pl.wtx.allegro.api.client;

import pl.wtx.allegro.api.client.invoker.ApiCallback;
import pl.wtx.allegro.api.client.invoker.ApiClient;
import pl.wtx.allegro.api.client.invoker.ApiException;
import pl.wtx.allegro.api.client.invoker.ApiResponse;
import pl.wtx.allegro.api.client.invoker.Configuration;
import pl.wtx.allegro.api.client.invoker.Pair;
import pl.wtx.allegro.api.client.invoker.ProgressRequestBody;
import pl.wtx.allegro.api.client.invoker.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import pl.wtx.allegro.api.client.model.ErrorsHolder;
import pl.wtx.allegro.api.client.model.StockProductList;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FulfillmentStockApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FulfillmentStockApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FulfillmentStockApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getFulfillmentStock
     * @param acceptLanguage Expected language of product name translation. (optional, default to en-US)
     * @param offset The offset of elements in the response. Ignored for text/csv content type. (optional, default to 0)
     * @param limit Maximum number of elements in response. Ignored for text/csv content type. (optional, default to 50)
     * @param phrase Filtering search results by product name. (optional)
     * @param sort Defines how elements are sorted in response. Minus sign can be added to imply descending sort order. Ignored for text/csv content type. Possible values for the \&quot;sort\&quot; parameter:   * -available - sorting by quantity of available products (descending)   * available - sorting by quantity of available products (ascending)   * -unfulfillable - sorting by quantity of unfulfillable products (descending)   * unfulfillable - sorting by quantity of unfulfillable products (ascending)   * -name - sorting by product’s name (descending)   * name - sorting by product’s name (ascending)   * lastWeekSalesAverage - sorting by product last week average sales (ascending)   * -lastWeekSalesAverage - sorting by product last week average sales (descending)   * reserve - sorting by reserve.outOfStockIn field (ascending)   * -reserve - sorting by reserve.outOfStockIn field (descending)   * lastThirtyDaysSalesSum - sorting by product last month sum sales (ascending)   * -lastThirtyDaysSalesSum - sorting by product last month sum sales (descending)   * storageFee - sorting by storage fee (ascending). The order by fee status is: NOT_APPLICABLE, then INCLUDED_IN_STORAGE_FEE, then PREDICTION, then CHARGED ordered by amountGross ascending.   * -storageFee - sorting by storage fee (descending). The order by fee status is: CHARGED ordered by amountGross descending, then PREDICTION, then INCLUDED_IN_STORAGE_FEE, then NOT_APPLICABLE. (optional, default to name)
     * @param productId Filtering search results by fulfillment product identifier. Ignored for text/csv content type. (optional)
     * @param productAvailability Filtering search results by availability. (optional)
     * @param productStatus Filtering search results by status. (optional)
     * @param asnStatus Filtering search results by ASN status. Following values are allowed: SUBMITTED - Advanced Ship Notice document has been submitted and it contains a particular product. Only the products that have ASN with products on it are returned. NOT_FOUND - Advanced Ship Notice that contains a particular product was not found. It has not been submitted, may be expired, or products have already been delivered to the warehouse. Only the products that don&#39;t have related ASN with products on it are returned. (optional)
     * @param outOfStockInFrom Filter by products with outOfStockIn greater than or equal. (optional)
     * @param outOfStockInTo Filter by products with outOfStockIn less than or equal. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available stock for the seller. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFulfillmentStockCall(@javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String phrase, @javax.annotation.Nullable String sort, @javax.annotation.Nullable UUID productId, @javax.annotation.Nullable List<String> productAvailability, @javax.annotation.Nullable String productStatus, @javax.annotation.Nullable String asnStatus, @javax.annotation.Nullable Integer outOfStockInFrom, @javax.annotation.Nullable Integer outOfStockInTo, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/fulfillment/stock";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (phrase != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("phrase", phrase));
        }

        if (sort != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("sort", sort));
        }

        if (productId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("productId", productId));
        }

        if (productAvailability != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "productAvailability", productAvailability));
        }

        if (productStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("productStatus", productStatus));
        }

        if (asnStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asnStatus", asnStatus));
        }

        if (outOfStockInFrom != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outOfStockInFrom", outOfStockInFrom));
        }

        if (outOfStockInTo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("outOfStockInTo", outOfStockInTo));
        }

        final String[] localVarAccepts = {
            "application/vnd.allegro.public.v1+json",
            "text/csv",
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (acceptLanguage != null) {
            localVarHeaderParams.put("Accept-Language", localVarApiClient.parameterToString(acceptLanguage));
        }


        String[] localVarAuthNames = new String[] { "bearer-token-for-user" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFulfillmentStockValidateBeforeCall(@javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String phrase, @javax.annotation.Nullable String sort, @javax.annotation.Nullable UUID productId, @javax.annotation.Nullable List<String> productAvailability, @javax.annotation.Nullable String productStatus, @javax.annotation.Nullable String asnStatus, @javax.annotation.Nullable Integer outOfStockInFrom, @javax.annotation.Nullable Integer outOfStockInTo, final ApiCallback _callback) throws ApiException {
        return getFulfillmentStockCall(acceptLanguage, offset, limit, phrase, sort, productId, productAvailability, productStatus, asnStatus, outOfStockInFrom, outOfStockInTo, _callback);

    }

    /**
     * Get available stock
     * Use this resource to get a list of the products belonging to the seller, which are in Allegro Warehouse. Read more: &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-0ADwgOLqWSw#jak-pobrac-aktualne-stany-magazynowe\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-4R9dXyMPlc9#get-available-stock\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param acceptLanguage Expected language of product name translation. (optional, default to en-US)
     * @param offset The offset of elements in the response. Ignored for text/csv content type. (optional, default to 0)
     * @param limit Maximum number of elements in response. Ignored for text/csv content type. (optional, default to 50)
     * @param phrase Filtering search results by product name. (optional)
     * @param sort Defines how elements are sorted in response. Minus sign can be added to imply descending sort order. Ignored for text/csv content type. Possible values for the \&quot;sort\&quot; parameter:   * -available - sorting by quantity of available products (descending)   * available - sorting by quantity of available products (ascending)   * -unfulfillable - sorting by quantity of unfulfillable products (descending)   * unfulfillable - sorting by quantity of unfulfillable products (ascending)   * -name - sorting by product’s name (descending)   * name - sorting by product’s name (ascending)   * lastWeekSalesAverage - sorting by product last week average sales (ascending)   * -lastWeekSalesAverage - sorting by product last week average sales (descending)   * reserve - sorting by reserve.outOfStockIn field (ascending)   * -reserve - sorting by reserve.outOfStockIn field (descending)   * lastThirtyDaysSalesSum - sorting by product last month sum sales (ascending)   * -lastThirtyDaysSalesSum - sorting by product last month sum sales (descending)   * storageFee - sorting by storage fee (ascending). The order by fee status is: NOT_APPLICABLE, then INCLUDED_IN_STORAGE_FEE, then PREDICTION, then CHARGED ordered by amountGross ascending.   * -storageFee - sorting by storage fee (descending). The order by fee status is: CHARGED ordered by amountGross descending, then PREDICTION, then INCLUDED_IN_STORAGE_FEE, then NOT_APPLICABLE. (optional, default to name)
     * @param productId Filtering search results by fulfillment product identifier. Ignored for text/csv content type. (optional)
     * @param productAvailability Filtering search results by availability. (optional)
     * @param productStatus Filtering search results by status. (optional)
     * @param asnStatus Filtering search results by ASN status. Following values are allowed: SUBMITTED - Advanced Ship Notice document has been submitted and it contains a particular product. Only the products that have ASN with products on it are returned. NOT_FOUND - Advanced Ship Notice that contains a particular product was not found. It has not been submitted, may be expired, or products have already been delivered to the warehouse. Only the products that don&#39;t have related ASN with products on it are returned. (optional)
     * @param outOfStockInFrom Filter by products with outOfStockIn greater than or equal. (optional)
     * @param outOfStockInTo Filter by products with outOfStockIn less than or equal. (optional)
     * @return StockProductList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available stock for the seller. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
     </table>
     */
    public StockProductList getFulfillmentStock(@javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String phrase, @javax.annotation.Nullable String sort, @javax.annotation.Nullable UUID productId, @javax.annotation.Nullable List<String> productAvailability, @javax.annotation.Nullable String productStatus, @javax.annotation.Nullable String asnStatus, @javax.annotation.Nullable Integer outOfStockInFrom, @javax.annotation.Nullable Integer outOfStockInTo) throws ApiException {
        ApiResponse<StockProductList> localVarResp = getFulfillmentStockWithHttpInfo(acceptLanguage, offset, limit, phrase, sort, productId, productAvailability, productStatus, asnStatus, outOfStockInFrom, outOfStockInTo);
        return localVarResp.getData();
    }

    /**
     * Get available stock
     * Use this resource to get a list of the products belonging to the seller, which are in Allegro Warehouse. Read more: &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-0ADwgOLqWSw#jak-pobrac-aktualne-stany-magazynowe\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-4R9dXyMPlc9#get-available-stock\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param acceptLanguage Expected language of product name translation. (optional, default to en-US)
     * @param offset The offset of elements in the response. Ignored for text/csv content type. (optional, default to 0)
     * @param limit Maximum number of elements in response. Ignored for text/csv content type. (optional, default to 50)
     * @param phrase Filtering search results by product name. (optional)
     * @param sort Defines how elements are sorted in response. Minus sign can be added to imply descending sort order. Ignored for text/csv content type. Possible values for the \&quot;sort\&quot; parameter:   * -available - sorting by quantity of available products (descending)   * available - sorting by quantity of available products (ascending)   * -unfulfillable - sorting by quantity of unfulfillable products (descending)   * unfulfillable - sorting by quantity of unfulfillable products (ascending)   * -name - sorting by product’s name (descending)   * name - sorting by product’s name (ascending)   * lastWeekSalesAverage - sorting by product last week average sales (ascending)   * -lastWeekSalesAverage - sorting by product last week average sales (descending)   * reserve - sorting by reserve.outOfStockIn field (ascending)   * -reserve - sorting by reserve.outOfStockIn field (descending)   * lastThirtyDaysSalesSum - sorting by product last month sum sales (ascending)   * -lastThirtyDaysSalesSum - sorting by product last month sum sales (descending)   * storageFee - sorting by storage fee (ascending). The order by fee status is: NOT_APPLICABLE, then INCLUDED_IN_STORAGE_FEE, then PREDICTION, then CHARGED ordered by amountGross ascending.   * -storageFee - sorting by storage fee (descending). The order by fee status is: CHARGED ordered by amountGross descending, then PREDICTION, then INCLUDED_IN_STORAGE_FEE, then NOT_APPLICABLE. (optional, default to name)
     * @param productId Filtering search results by fulfillment product identifier. Ignored for text/csv content type. (optional)
     * @param productAvailability Filtering search results by availability. (optional)
     * @param productStatus Filtering search results by status. (optional)
     * @param asnStatus Filtering search results by ASN status. Following values are allowed: SUBMITTED - Advanced Ship Notice document has been submitted and it contains a particular product. Only the products that have ASN with products on it are returned. NOT_FOUND - Advanced Ship Notice that contains a particular product was not found. It has not been submitted, may be expired, or products have already been delivered to the warehouse. Only the products that don&#39;t have related ASN with products on it are returned. (optional)
     * @param outOfStockInFrom Filter by products with outOfStockIn greater than or equal. (optional)
     * @param outOfStockInTo Filter by products with outOfStockIn less than or equal. (optional)
     * @return ApiResponse&lt;StockProductList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available stock for the seller. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StockProductList> getFulfillmentStockWithHttpInfo(@javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String phrase, @javax.annotation.Nullable String sort, @javax.annotation.Nullable UUID productId, @javax.annotation.Nullable List<String> productAvailability, @javax.annotation.Nullable String productStatus, @javax.annotation.Nullable String asnStatus, @javax.annotation.Nullable Integer outOfStockInFrom, @javax.annotation.Nullable Integer outOfStockInTo) throws ApiException {
        okhttp3.Call localVarCall = getFulfillmentStockValidateBeforeCall(acceptLanguage, offset, limit, phrase, sort, productId, productAvailability, productStatus, asnStatus, outOfStockInFrom, outOfStockInTo, null);
        Type localVarReturnType = new TypeToken<StockProductList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get available stock (asynchronously)
     * Use this resource to get a list of the products belonging to the seller, which are in Allegro Warehouse. Read more: &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-0ADwgOLqWSw#jak-pobrac-aktualne-stany-magazynowe\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../tutorials/one-fulfillment-by-allegro-4R9dXyMPlc9#get-available-stock\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param acceptLanguage Expected language of product name translation. (optional, default to en-US)
     * @param offset The offset of elements in the response. Ignored for text/csv content type. (optional, default to 0)
     * @param limit Maximum number of elements in response. Ignored for text/csv content type. (optional, default to 50)
     * @param phrase Filtering search results by product name. (optional)
     * @param sort Defines how elements are sorted in response. Minus sign can be added to imply descending sort order. Ignored for text/csv content type. Possible values for the \&quot;sort\&quot; parameter:   * -available - sorting by quantity of available products (descending)   * available - sorting by quantity of available products (ascending)   * -unfulfillable - sorting by quantity of unfulfillable products (descending)   * unfulfillable - sorting by quantity of unfulfillable products (ascending)   * -name - sorting by product’s name (descending)   * name - sorting by product’s name (ascending)   * lastWeekSalesAverage - sorting by product last week average sales (ascending)   * -lastWeekSalesAverage - sorting by product last week average sales (descending)   * reserve - sorting by reserve.outOfStockIn field (ascending)   * -reserve - sorting by reserve.outOfStockIn field (descending)   * lastThirtyDaysSalesSum - sorting by product last month sum sales (ascending)   * -lastThirtyDaysSalesSum - sorting by product last month sum sales (descending)   * storageFee - sorting by storage fee (ascending). The order by fee status is: NOT_APPLICABLE, then INCLUDED_IN_STORAGE_FEE, then PREDICTION, then CHARGED ordered by amountGross ascending.   * -storageFee - sorting by storage fee (descending). The order by fee status is: CHARGED ordered by amountGross descending, then PREDICTION, then INCLUDED_IN_STORAGE_FEE, then NOT_APPLICABLE. (optional, default to name)
     * @param productId Filtering search results by fulfillment product identifier. Ignored for text/csv content type. (optional)
     * @param productAvailability Filtering search results by availability. (optional)
     * @param productStatus Filtering search results by status. (optional)
     * @param asnStatus Filtering search results by ASN status. Following values are allowed: SUBMITTED - Advanced Ship Notice document has been submitted and it contains a particular product. Only the products that have ASN with products on it are returned. NOT_FOUND - Advanced Ship Notice that contains a particular product was not found. It has not been submitted, may be expired, or products have already been delivered to the warehouse. Only the products that don&#39;t have related ASN with products on it are returned. (optional)
     * @param outOfStockInFrom Filter by products with outOfStockIn greater than or equal. (optional)
     * @param outOfStockInTo Filter by products with outOfStockIn less than or equal. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns available stock for the seller. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Invalid request parameters. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFulfillmentStockAsync(@javax.annotation.Nullable String acceptLanguage, @javax.annotation.Nullable Integer offset, @javax.annotation.Nullable Integer limit, @javax.annotation.Nullable String phrase, @javax.annotation.Nullable String sort, @javax.annotation.Nullable UUID productId, @javax.annotation.Nullable List<String> productAvailability, @javax.annotation.Nullable String productStatus, @javax.annotation.Nullable String asnStatus, @javax.annotation.Nullable Integer outOfStockInFrom, @javax.annotation.Nullable Integer outOfStockInTo, final ApiCallback<StockProductList> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFulfillmentStockValidateBeforeCall(acceptLanguage, offset, limit, phrase, sort, productId, productAvailability, productStatus, asnStatus, outOfStockInFrom, outOfStockInTo, _callback);
        Type localVarReturnType = new TypeToken<StockProductList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

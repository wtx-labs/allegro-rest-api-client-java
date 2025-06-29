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
import pl.wtx.allegro.api.client.model.UserRatingSummaryResponse;
import pl.wtx.allegro.api.client.model.UserRatingSummaryResponseV2;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PublicUserInformationApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PublicUserInformationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PublicUserInformationApi(ApiClient apiClient) {
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
     * Build call for getUserSummaryUsingGET
     * @param userId The ID of the user. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feedback statistics returned successfully. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User with the given ID not found or user is not a seller. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserSummaryUsingGETCall(@javax.annotation.Nonnull String userId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/users/{userId}/ratings-summary"
            .replace("{" + "userId" + "}", localVarApiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/vnd.allegro.public.v1+json",
            "application/vnd.allegro.beta.v1+json"
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

        String[] localVarAuthNames = new String[] { "bearer-token-for-user" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getUserSummaryUsingGETValidateBeforeCall(@javax.annotation.Nonnull String userId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getUserSummaryUsingGET(Async)");
        }

        return getUserSummaryUsingGETCall(userId, _callback);

    }

    /**
     * Get any user&#39;s ratings summary
     * Use this resource to receive feedback statistics. Read more: &lt;a href&#x3D;\&quot;../../news/nowe-zasoby-ktorymi-pobierzesz-informacje-o-ocenach-ZM9L1WPBbUb\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../news/new-resources-to-download-sales-feedback-d2VYERBMRiz\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param userId The ID of the user. (required)
     * @return UserRatingSummaryResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feedback statistics returned successfully. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User with the given ID not found or user is not a seller. </td><td>  -  </td></tr>
     </table>
     */
    public UserRatingSummaryResponse getUserSummaryUsingGET(@javax.annotation.Nonnull String userId) throws ApiException {
        ApiResponse<UserRatingSummaryResponse> localVarResp = getUserSummaryUsingGETWithHttpInfo(userId);
        return localVarResp.getData();
    }

    /**
     * Get any user&#39;s ratings summary
     * Use this resource to receive feedback statistics. Read more: &lt;a href&#x3D;\&quot;../../news/nowe-zasoby-ktorymi-pobierzesz-informacje-o-ocenach-ZM9L1WPBbUb\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../news/new-resources-to-download-sales-feedback-d2VYERBMRiz\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param userId The ID of the user. (required)
     * @return ApiResponse&lt;UserRatingSummaryResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feedback statistics returned successfully. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User with the given ID not found or user is not a seller. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UserRatingSummaryResponse> getUserSummaryUsingGETWithHttpInfo(@javax.annotation.Nonnull String userId) throws ApiException {
        okhttp3.Call localVarCall = getUserSummaryUsingGETValidateBeforeCall(userId, null);
        Type localVarReturnType = new TypeToken<UserRatingSummaryResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get any user&#39;s ratings summary (asynchronously)
     * Use this resource to receive feedback statistics. Read more: &lt;a href&#x3D;\&quot;../../news/nowe-zasoby-ktorymi-pobierzesz-informacje-o-ocenach-ZM9L1WPBbUb\&quot; target&#x3D;\&quot;_blank\&quot;&gt;PL&lt;/a&gt; / &lt;a href&#x3D;\&quot;../../news/new-resources-to-download-sales-feedback-d2VYERBMRiz\&quot; target&#x3D;\&quot;_blank\&quot;&gt;EN&lt;/a&gt;.
     * @param userId The ID of the user. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Feedback statistics returned successfully. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> User with the given ID not found or user is not a seller. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getUserSummaryUsingGETAsync(@javax.annotation.Nonnull String userId, final ApiCallback<UserRatingSummaryResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getUserSummaryUsingGETValidateBeforeCall(userId, _callback);
        Type localVarReturnType = new TypeToken<UserRatingSummaryResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}

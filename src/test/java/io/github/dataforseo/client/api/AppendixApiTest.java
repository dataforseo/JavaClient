/*
 * DataForSEO API documentation
 * DataForSEO API is the starting point on your journey towards building powerful SEO software. With DataForSEO you can get all the data you need to build an efficient application while also saving your time and budget. DataForSEO API is using the REST technology for interchanging data between your application and our service. The data exchange is made through the widely used HTTP protocol, which allows applying our API to almost all programming languages.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.dataforseo.client.api;

import io.github.dataforseo.client.ApiException;
import io.github.dataforseo.client.model.AppendixErrorsResponseInfo;
import io.github.dataforseo.client.model.AppendixStatusResponseInfo;
import io.github.dataforseo.client.model.AppendixUserDataResponseInfo;
import io.github.dataforseo.client.model.AppendixWebhookResendRequestInfo;
import io.github.dataforseo.client.model.AppendixWebhookResendResponseInfo;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppendixApi
 */
@Disabled
public class AppendixApiTest {

    private final AppendixApi api = new AppendixApi();

    /**
     * This endpoint returns a list of possible DataForSEO API errors and general status codes. Below you will find a list of HTTP response codes and internal messages. We recommend storing the data connected to error codes in your application log and designing a necessary system for handling related exceptional or error conditions. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/errors/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appendixErrorsTest() throws ApiException {
        AppendixErrorsResponseInfo response = api.appendixErrors();
        // TODO: test validations
    }

    /**
     * By calling this API you will receive detailed information about the current status of all our APIs and endpoints. You will also get a full issue description if a problem occurs. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/status/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appendixStatusTest() throws ApiException {
        AppendixStatusResponseInfo response = api.appendixStatus();
        // TODO: test validations
    }

    /**
     * You will receive detailed information about your API usage, prices, spending and other account details by calling this API. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/user_data/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void userDataTest() throws ApiException {
        AppendixUserDataResponseInfo response = api.userData();
        // TODO: test validations
    }

    /**
     * Using this endpoint you can resend webhooks (pingbacks and postbacks) for up to 100 specified tasks. Note: Your account will not be double-charged for resending a webhook. for more info please visit &#39;https://docs.dataforseo.com/v3/appendix/webhook_resend/?bash&#39;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void webhookResendTest() throws ApiException {
        List<AppendixWebhookResendRequestInfo> appendixWebhookResendRequestInfo = null;
        AppendixWebhookResendResponseInfo response = api.webhookResend(appendixWebhookResendRequestInfo);
        // TODO: test validations
    }

}
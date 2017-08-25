/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ClusterVersions.
 */
public class ClusterVersionsInner {
    /** The Retrofit service to perform REST calls. */
    private ClusterVersionsService service;
    /** The service client containing this operation class. */
    private ServiceFabricManagementClientImpl client;

    /**
     * Initializes an instance of ClusterVersionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ClusterVersionsInner(Retrofit retrofit, ServiceFabricManagementClientImpl client) {
        this.service = retrofit.create(ClusterVersionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ClusterVersions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ClusterVersionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.ClusterVersions list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/environments/{environment}/clusterVersions")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("environment") String environment, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.servicefabric.ClusterVersions listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List cluster code versions by location.
     *
     * @param location The location for the cluster code versions, this is different from cluster location
     * @param environment Cluster operating system, the default means all. Possible values include: 'Default', 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClusterCodeVersionsResultInner&gt; object if successful.
     */
    public PagedList<ClusterCodeVersionsResultInner> list(final String location, final String environment) {
        ServiceResponse<Page<ClusterCodeVersionsResultInner>> response = listSinglePageAsync(location, environment).toBlocking().single();
        return new PagedList<ClusterCodeVersionsResultInner>(response.body()) {
            @Override
            public Page<ClusterCodeVersionsResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List cluster code versions by location.
     *
     * @param location The location for the cluster code versions, this is different from cluster location
     * @param environment Cluster operating system, the default means all. Possible values include: 'Default', 'Windows', 'Linux'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClusterCodeVersionsResultInner>> listAsync(final String location, final String environment, final ListOperationCallback<ClusterCodeVersionsResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location, environment),
            new Func1<String, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List cluster code versions by location.
     *
     * @param location The location for the cluster code versions, this is different from cluster location
     * @param environment Cluster operating system, the default means all. Possible values include: 'Default', 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClusterCodeVersionsResultInner&gt; object
     */
    public Observable<Page<ClusterCodeVersionsResultInner>> listAsync(final String location, final String environment) {
        return listWithServiceResponseAsync(location, environment)
            .map(new Func1<ServiceResponse<Page<ClusterCodeVersionsResultInner>>, Page<ClusterCodeVersionsResultInner>>() {
                @Override
                public Page<ClusterCodeVersionsResultInner> call(ServiceResponse<Page<ClusterCodeVersionsResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List cluster code versions by location.
     *
     * @param location The location for the cluster code versions, this is different from cluster location
     * @param environment Cluster operating system, the default means all. Possible values include: 'Default', 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClusterCodeVersionsResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> listWithServiceResponseAsync(final String location, final String environment) {
        return listSinglePageAsync(location, environment)
            .concatMap(new Func1<ServiceResponse<Page<ClusterCodeVersionsResultInner>>, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(ServiceResponse<Page<ClusterCodeVersionsResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List cluster code versions by location.
     *
    ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> * @param location The location for the cluster code versions, this is different from cluster location
    ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> * @param environment Cluster operating system, the default means all. Possible values include: 'Default', 'Windows', 'Linux'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClusterCodeVersionsResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> listSinglePageAsync(final String location, final String environment) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (environment == null) {
            throw new IllegalArgumentException("Parameter environment is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(location, environment, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClusterCodeVersionsResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ClusterCodeVersionsResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ClusterCodeVersionsResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * List cluster code versions by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ClusterCodeVersionsResultInner&gt; object if successful.
     */
    public PagedList<ClusterCodeVersionsResultInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ClusterCodeVersionsResultInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ClusterCodeVersionsResultInner>(response.body()) {
            @Override
            public Page<ClusterCodeVersionsResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * List cluster code versions by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ClusterCodeVersionsResultInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ClusterCodeVersionsResultInner>> serviceFuture, final ListOperationCallback<ClusterCodeVersionsResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * List cluster code versions by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClusterCodeVersionsResultInner&gt; object
     */
    public Observable<Page<ClusterCodeVersionsResultInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ClusterCodeVersionsResultInner>>, Page<ClusterCodeVersionsResultInner>>() {
                @Override
                public Page<ClusterCodeVersionsResultInner> call(ServiceResponse<Page<ClusterCodeVersionsResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * List cluster code versions by location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ClusterCodeVersionsResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ClusterCodeVersionsResultInner>>, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(ServiceResponse<Page<ClusterCodeVersionsResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * List cluster code versions by location.
     *
    ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ClusterCodeVersionsResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ClusterCodeVersionsResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ClusterCodeVersionsResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ClusterCodeVersionsResultInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ClusterCodeVersionsResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ClusterCodeVersionsResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}

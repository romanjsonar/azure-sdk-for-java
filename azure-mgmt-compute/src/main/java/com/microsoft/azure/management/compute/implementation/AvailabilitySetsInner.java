/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.microsoft.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in AvailabilitySets.
 */
public class AvailabilitySetsInner implements InnerSupportsGet<AvailabilitySetInner>, InnerSupportsDelete<OperationStatusResponseInner> {
    /** The Retrofit service to perform REST calls. */
    private AvailabilitySetsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of AvailabilitySetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AvailabilitySetsInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(AvailabilitySetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for AvailabilitySets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AvailabilitySetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.AvailabilitySets createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{name}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body AvailabilitySetInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.AvailabilitySets delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("availabilitySetName") String availabilitySetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.AvailabilitySets getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("availabilitySetName") String availabilitySetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.AvailabilitySets listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.AvailabilitySets listAvailableSizes" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/availabilitySets/{availabilitySetName}/vmSizes")
        Observable<Response<ResponseBody>> listAvailableSizes(@Path("resourceGroupName") String resourceGroupName, @Path("availabilitySetName") String availabilitySetName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the availability set.
     * @param parameters Parameters supplied to the Create Availability Set operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AvailabilitySetInner object if successful.
     */
    public AvailabilitySetInner createOrUpdate(String resourceGroupName, String name, AvailabilitySetInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, name, parameters).toBlocking().single().body();
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the availability set.
     * @param parameters Parameters supplied to the Create Availability Set operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AvailabilitySetInner> createOrUpdateAsync(String resourceGroupName, String name, AvailabilitySetInner parameters, final ServiceCallback<AvailabilitySetInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, name, parameters), serviceCallback);
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the availability set.
     * @param parameters Parameters supplied to the Create Availability Set operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AvailabilitySetInner object
     */
    public Observable<AvailabilitySetInner> createOrUpdateAsync(String resourceGroupName, String name, AvailabilitySetInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, name, parameters).map(new Func1<ServiceResponse<AvailabilitySetInner>, AvailabilitySetInner>() {
            @Override
            public AvailabilitySetInner call(ServiceResponse<AvailabilitySetInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the availability set.
     * @param parameters Parameters supplied to the Create Availability Set operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AvailabilitySetInner object
     */
    public Observable<ServiceResponse<AvailabilitySetInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String name, AvailabilitySetInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2016-04-30-preview";
        return service.createOrUpdate(resourceGroupName, name, this.client.subscriptionId(), parameters, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AvailabilitySetInner>>>() {
                @Override
                public Observable<ServiceResponse<AvailabilitySetInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AvailabilitySetInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AvailabilitySetInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AvailabilitySetInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AvailabilitySetInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatusResponseInner object if successful.
     */
    public OperationStatusResponseInner delete(String resourceGroupName, String availabilitySetName) {
        return deleteWithServiceResponseAsync(resourceGroupName, availabilitySetName).toBlocking().single().body();
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatusResponseInner> deleteAsync(String resourceGroupName, String availabilitySetName, final ServiceCallback<OperationStatusResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, availabilitySetName), serviceCallback);
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<OperationStatusResponseInner> deleteAsync(String resourceGroupName, String availabilitySetName) {
        return deleteWithServiceResponseAsync(resourceGroupName, availabilitySetName).map(new Func1<ServiceResponse<OperationStatusResponseInner>, OperationStatusResponseInner>() {
            @Override
            public OperationStatusResponseInner call(ServiceResponse<OperationStatusResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatusResponseInner object
     */
    public Observable<ServiceResponse<OperationStatusResponseInner>> deleteWithServiceResponseAsync(String resourceGroupName, String availabilitySetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (availabilitySetName == null) {
            throw new IllegalArgumentException("Parameter availabilitySetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.delete(resourceGroupName, availabilitySetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatusResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatusResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatusResponseInner> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatusResponseInner> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatusResponseInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatusResponseInner>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AvailabilitySetInner object if successful.
     */
    public AvailabilitySetInner getByResourceGroup(String resourceGroupName, String availabilitySetName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, availabilitySetName).toBlocking().single().body();
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AvailabilitySetInner> getByResourceGroupAsync(String resourceGroupName, String availabilitySetName, final ServiceCallback<AvailabilitySetInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, availabilitySetName), serviceCallback);
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AvailabilitySetInner object
     */
    public Observable<AvailabilitySetInner> getByResourceGroupAsync(String resourceGroupName, String availabilitySetName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, availabilitySetName).map(new Func1<ServiceResponse<AvailabilitySetInner>, AvailabilitySetInner>() {
            @Override
            public AvailabilitySetInner call(ServiceResponse<AvailabilitySetInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Retrieves information about an availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AvailabilitySetInner object
     */
    public Observable<ServiceResponse<AvailabilitySetInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String availabilitySetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (availabilitySetName == null) {
            throw new IllegalArgumentException("Parameter availabilitySetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.getByResourceGroup(resourceGroupName, availabilitySetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AvailabilitySetInner>>>() {
                @Override
                public Observable<ServiceResponse<AvailabilitySetInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AvailabilitySetInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AvailabilitySetInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AvailabilitySetInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AvailabilitySetInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the PagedList<AvailabilitySetInner> object if successful.
     */
    public PagedList<AvailabilitySetInner> listByResourceGroup(String resourceGroupName) {
        PageImpl<AvailabilitySetInner> page = new PageImpl<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<AvailabilitySetInner>(page) {
            @Override
            public Page<AvailabilitySetInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<AvailabilitySetInner>> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<List<AvailabilitySetInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName), serviceCallback);
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the observable to the List&lt;AvailabilitySetInner&gt; object
     */
    public Observable<Page<AvailabilitySetInner>> listByResourceGroupAsync(String resourceGroupName) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName).map(new Func1<ServiceResponse<List<AvailabilitySetInner>>, Page<AvailabilitySetInner>>() {
            @Override
            public Page<AvailabilitySetInner> call(ServiceResponse<List<AvailabilitySetInner>> response) {
                PageImpl<AvailabilitySetInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists all availability sets in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @return the observable to the List&lt;AvailabilitySetInner&gt; object
     */
    public Observable<ServiceResponse<List<AvailabilitySetInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.listByResourceGroup(resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<AvailabilitySetInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<AvailabilitySetInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<AvailabilitySetInner>> result = listByResourceGroupDelegate(response);
                        ServiceResponse<List<AvailabilitySetInner>> clientResponse = new ServiceResponse<List<AvailabilitySetInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<AvailabilitySetInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<AvailabilitySetInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<AvailabilitySetInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;VirtualMachineSizeInner&gt; object if successful.
     */
    public List<VirtualMachineSizeInner> listAvailableSizes(String resourceGroupName, String availabilitySetName) {
        return listAvailableSizesWithServiceResponseAsync(resourceGroupName, availabilitySetName).toBlocking().single().body();
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<VirtualMachineSizeInner>> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName, final ServiceCallback<List<VirtualMachineSizeInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listAvailableSizesWithServiceResponseAsync(resourceGroupName, availabilitySetName), serviceCallback);
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;VirtualMachineSizeInner&gt; object
     */
    public Observable<List<VirtualMachineSizeInner>> listAvailableSizesAsync(String resourceGroupName, String availabilitySetName) {
        return listAvailableSizesWithServiceResponseAsync(resourceGroupName, availabilitySetName).map(new Func1<ServiceResponse<List<VirtualMachineSizeInner>>, List<VirtualMachineSizeInner>>() {
            @Override
            public List<VirtualMachineSizeInner> call(ServiceResponse<List<VirtualMachineSizeInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all available virtual machine sizes that can be used to create a new virtual machine in an existing availability set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param availabilitySetName The name of the availability set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;VirtualMachineSizeInner&gt; object
     */
    public Observable<ServiceResponse<List<VirtualMachineSizeInner>>> listAvailableSizesWithServiceResponseAsync(String resourceGroupName, String availabilitySetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (availabilitySetName == null) {
            throw new IllegalArgumentException("Parameter availabilitySetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-04-30-preview";
        return service.listAvailableSizes(resourceGroupName, availabilitySetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<VirtualMachineSizeInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<VirtualMachineSizeInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<VirtualMachineSizeInner>> result = listAvailableSizesDelegate(response);
                        ServiceResponse<List<VirtualMachineSizeInner>> clientResponse = new ServiceResponse<List<VirtualMachineSizeInner>>(result.body().items(), result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<VirtualMachineSizeInner>> listAvailableSizesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<VirtualMachineSizeInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<VirtualMachineSizeInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}

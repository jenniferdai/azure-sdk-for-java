/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.implementation.HubVirtualNetworkConnectionsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing HubVirtualNetworkConnections.
 */
public interface HubVirtualNetworkConnections extends HasInner<HubVirtualNetworkConnectionsInner> {
    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HubVirtualNetworkConnection> getAsync(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HubVirtualNetworkConnection> listAsync(final String resourceGroupName, final String virtualHubName);

}

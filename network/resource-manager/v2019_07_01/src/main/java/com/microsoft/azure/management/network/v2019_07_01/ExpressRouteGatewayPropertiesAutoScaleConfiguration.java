/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration for auto scaling.
 */
public class ExpressRouteGatewayPropertiesAutoScaleConfiguration {
    /**
     * Minimum and maximum number of scale units to deploy.
     */
    @JsonProperty(value = "bounds")
    private ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds;

    /**
     * Get minimum and maximum number of scale units to deploy.
     *
     * @return the bounds value
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds() {
        return this.bounds;
    }

    /**
     * Set minimum and maximum number of scale units to deploy.
     *
     * @param bounds the bounds value to set
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfiguration object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfiguration withBounds(ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds bounds) {
        this.bounds = bounds;
        return this;
    }

}

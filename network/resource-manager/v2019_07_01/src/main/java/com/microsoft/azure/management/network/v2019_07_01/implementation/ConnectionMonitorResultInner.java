/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.ConnectionMonitorSource;
import com.microsoft.azure.management.network.v2019_07_01.ConnectionMonitorDestination;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Information about the connection monitor.
 */
@JsonFlatten
public class ConnectionMonitorResultInner extends Resource {
    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Describes the source of connection monitor.
     */
    @JsonProperty(value = "properties.source", required = true)
    private ConnectionMonitorSource source;

    /**
     * Describes the destination of connection monitor.
     */
    @JsonProperty(value = "properties.destination", required = true)
    private ConnectionMonitorDestination destination;

    /**
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "properties.autoStart")
    private Boolean autoStart;

    /**
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "properties.monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * The provisioning state of the connection monitor. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The date and time when the connection monitor was started.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The monitoring status of the connection monitor.
     */
    @JsonProperty(value = "properties.monitoringStatus")
    private String monitoringStatus;

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get describes the source of connection monitor.
     *
     * @return the source value
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set describes the source of connection monitor.
     *
     * @param source the source value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get describes the destination of connection monitor.
     *
     * @return the destination value
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set describes the destination of connection monitor.
     *
     * @param destination the destination value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

    /**
     * Get the provisioning state of the connection monitor. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the connection monitor. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the date and time when the connection monitor was started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the date and time when the connection monitor was started.
     *
     * @param startTime the startTime value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the monitoring status of the connection monitor.
     *
     * @return the monitoringStatus value
     */
    public String monitoringStatus() {
        return this.monitoringStatus;
    }

    /**
     * Set the monitoring status of the connection monitor.
     *
     * @param monitoringStatus the monitoringStatus value to set
     * @return the ConnectionMonitorResultInner object itself.
     */
    public ConnectionMonitorResultInner withMonitoringStatus(String monitoringStatus) {
        this.monitoringStatus = monitoringStatus;
        return this;
    }

}

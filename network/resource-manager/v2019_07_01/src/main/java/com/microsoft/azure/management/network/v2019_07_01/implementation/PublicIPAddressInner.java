/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_07_01.implementation;

import com.microsoft.azure.management.network.v2019_07_01.PublicIPAddressSku;
import com.microsoft.azure.management.network.v2019_07_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2019_07_01.IPVersion;
import com.microsoft.azure.management.network.v2019_07_01.IPConfiguration;
import com.microsoft.azure.management.network.v2019_07_01.PublicIPAddressDnsSettings;
import com.microsoft.azure.management.network.v2019_07_01.DdosSettings;
import java.util.List;
import com.microsoft.azure.management.network.v2019_07_01.IpTag;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2019_07_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Public IP address resource.
 */
@JsonFlatten
@SkipParentValidation
public class PublicIPAddressInner extends Resource {
    /**
     * The public IP address SKU.
     */
    @JsonProperty(value = "sku")
    private PublicIPAddressSku sku;

    /**
     * The public IP address allocation method. Possible values include:
     * 'Static', 'Dynamic'.
     */
    @JsonProperty(value = "properties.publicIPAllocationMethod")
    private IPAllocationMethod publicIPAllocationMethod;

    /**
     * The public IP address version. Possible values include: 'IPv4', 'IPv6'.
     */
    @JsonProperty(value = "properties.publicIPAddressVersion")
    private IPVersion publicIPAddressVersion;

    /**
     * The IP configuration associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private IPConfiguration ipConfiguration;

    /**
     * The FQDN of the DNS record associated with the public IP address.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private PublicIPAddressDnsSettings dnsSettings;

    /**
     * The DDoS protection custom policy associated with the public IP address.
     */
    @JsonProperty(value = "properties.ddosSettings")
    private DdosSettings ddosSettings;

    /**
     * The list of tags associated with the public IP address.
     */
    @JsonProperty(value = "properties.ipTags")
    private List<IpTag> ipTags;

    /**
     * The IP address associated with the public IP address resource.
     */
    @JsonProperty(value = "properties.ipAddress")
    private String ipAddress;

    /**
     * The Public IP Prefix this Public IP Address should be allocated from.
     */
    @JsonProperty(value = "properties.publicIPPrefix")
    private SubResource publicIPPrefix;

    /**
     * The idle timeout of the public IP address.
     */
    @JsonProperty(value = "properties.idleTimeoutInMinutes")
    private Integer idleTimeoutInMinutes;

    /**
     * The resource GUID property of the public IP address resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the public IP address resource. Possible
     * values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * A list of availability zones denoting the IP allocated for the resource
     * needs to come from.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the public IP address SKU.
     *
     * @return the sku value
     */
    public PublicIPAddressSku sku() {
        return this.sku;
    }

    /**
     * Set the public IP address SKU.
     *
     * @param sku the sku value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withSku(PublicIPAddressSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the public IP address allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @return the publicIPAllocationMethod value
     */
    public IPAllocationMethod publicIPAllocationMethod() {
        return this.publicIPAllocationMethod;
    }

    /**
     * Set the public IP address allocation method. Possible values include: 'Static', 'Dynamic'.
     *
     * @param publicIPAllocationMethod the publicIPAllocationMethod value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAllocationMethod(IPAllocationMethod publicIPAllocationMethod) {
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        return this;
    }

    /**
     * Get the public IP address version. Possible values include: 'IPv4', 'IPv6'.
     *
     * @return the publicIPAddressVersion value
     */
    public IPVersion publicIPAddressVersion() {
        return this.publicIPAddressVersion;
    }

    /**
     * Set the public IP address version. Possible values include: 'IPv4', 'IPv6'.
     *
     * @param publicIPAddressVersion the publicIPAddressVersion value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPAddressVersion(IPVersion publicIPAddressVersion) {
        this.publicIPAddressVersion = publicIPAddressVersion;
        return this;
    }

    /**
     * Get the IP configuration associated with the public IP address.
     *
     * @return the ipConfiguration value
     */
    public IPConfiguration ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Get the FQDN of the DNS record associated with the public IP address.
     *
     * @return the dnsSettings value
     */
    public PublicIPAddressDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the FQDN of the DNS record associated with the public IP address.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withDnsSettings(PublicIPAddressDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the DDoS protection custom policy associated with the public IP address.
     *
     * @return the ddosSettings value
     */
    public DdosSettings ddosSettings() {
        return this.ddosSettings;
    }

    /**
     * Set the DDoS protection custom policy associated with the public IP address.
     *
     * @param ddosSettings the ddosSettings value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withDdosSettings(DdosSettings ddosSettings) {
        this.ddosSettings = ddosSettings;
        return this;
    }

    /**
     * Get the list of tags associated with the public IP address.
     *
     * @return the ipTags value
     */
    public List<IpTag> ipTags() {
        return this.ipTags;
    }

    /**
     * Set the list of tags associated with the public IP address.
     *
     * @param ipTags the ipTags value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIpTags(List<IpTag> ipTags) {
        this.ipTags = ipTags;
        return this;
    }

    /**
     * Get the IP address associated with the public IP address resource.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address associated with the public IP address resource.
     *
     * @param ipAddress the ipAddress value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the Public IP Prefix this Public IP Address should be allocated from.
     *
     * @return the publicIPPrefix value
     */
    public SubResource publicIPPrefix() {
        return this.publicIPPrefix;
    }

    /**
     * Set the Public IP Prefix this Public IP Address should be allocated from.
     *
     * @param publicIPPrefix the publicIPPrefix value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withPublicIPPrefix(SubResource publicIPPrefix) {
        this.publicIPPrefix = publicIPPrefix;
        return this;
    }

    /**
     * Get the idle timeout of the public IP address.
     *
     * @return the idleTimeoutInMinutes value
     */
    public Integer idleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes;
    }

    /**
     * Set the idle timeout of the public IP address.
     *
     * @param idleTimeoutInMinutes the idleTimeoutInMinutes value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        return this;
    }

    /**
     * Get the resource GUID property of the public IP address resource.
     *
     * @return the resourceGuid value
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resource GUID property of the public IP address resource.
     *
     * @param resourceGuid the resourceGuid value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
        return this;
    }

    /**
     * Get the provisioning state of the public IP address resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of the public IP address resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

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
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @return the zones value
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set a list of availability zones denoting the IP allocated for the resource needs to come from.
     *
     * @param zones the zones value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the PublicIPAddressInner object itself.
     */
    public PublicIPAddressInner withId(String id) {
        this.id = id;
        return this;
    }

}

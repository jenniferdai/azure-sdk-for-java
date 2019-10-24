// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.Map;

/**
 * A listed Azure Storage share item.
 */
@JacksonXmlRootElement(localName = "Share")
@Fluent
public final class ShareItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /*
     * The snapshot property.
     */
    @JsonProperty(value = "Snapshot")
    private String snapshot;

    /*
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private ShareProperties properties;

    /*
     * The metadata property.
     */
    @JsonProperty(value = "Metadata")
    private Map<String, String> metadata;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ShareItem object itself.
     */
    public ShareItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the snapshot property: The snapshot property.
     *
     * @return the snapshot value.
     */
    public String getSnapshot() {
        return this.snapshot;
    }

    /**
     * Set the snapshot property: The snapshot property.
     *
     * @param snapshot the snapshot value to set.
     * @return the ShareItem object itself.
     */
    public ShareItem setSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public ShareProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the ShareItem object itself.
     */
    public ShareItem setProperties(ShareProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the ShareItem object itself.
     */
    public ShareItem setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
}

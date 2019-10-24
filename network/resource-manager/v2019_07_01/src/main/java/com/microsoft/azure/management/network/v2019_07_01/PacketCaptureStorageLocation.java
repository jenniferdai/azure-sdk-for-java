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
 * Describes the storage location for a packet capture session.
 */
public class PacketCaptureStorageLocation {
    /**
     * The ID of the storage account to save the packet capture session.
     * Required if no local file path is provided.
     */
    @JsonProperty(value = "storageId")
    private String storageId;

    /**
     * The URI of the storage path to save the packet capture. Must be a
     * well-formed URI describing the location to save the packet capture.
     */
    @JsonProperty(value = "storagePath")
    private String storagePath;

    /**
     * A valid local path on the targeting VM. Must include the name of the
     * capture file (*.cap). For linux virtual machine it must start with
     * /var/captures. Required if no storage ID is provided, otherwise
     * optional.
     */
    @JsonProperty(value = "filePath")
    private String filePath;

    /**
     * Get the ID of the storage account to save the packet capture session. Required if no local file path is provided.
     *
     * @return the storageId value
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the ID of the storage account to save the packet capture session. Required if no local file path is provided.
     *
     * @param storageId the storageId value to set
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     *
     * @return the storagePath value
     */
    public String storagePath() {
        return this.storagePath;
    }

    /**
     * Set the URI of the storage path to save the packet capture. Must be a well-formed URI describing the location to save the packet capture.
     *
     * @param storagePath the storagePath value to set
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * Get a valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set a valid local path on the targeting VM. Must include the name of the capture file (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided, otherwise optional.
     *
     * @param filePath the filePath value to set
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

}

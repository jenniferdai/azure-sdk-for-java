/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2018_09_01.implementation;

import com.microsoft.azure.management.iotcentral.v2018_09_01.AppTemplatesResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.iotcentral.v2018_09_01.AppTemplate;

class AppTemplatesResultImpl extends WrapperImpl<AppTemplatesResultInner> implements AppTemplatesResult {
    private final IoTCentralManager manager;
    AppTemplatesResultImpl(AppTemplatesResultInner inner, IoTCentralManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public IoTCentralManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<AppTemplate> value() {
        return this.inner().value();
    }

}

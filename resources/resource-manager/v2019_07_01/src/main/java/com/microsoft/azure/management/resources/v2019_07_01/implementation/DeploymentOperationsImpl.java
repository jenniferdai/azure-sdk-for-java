/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.resources.v2019_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.v2019_07_01.DeploymentOperations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.resources.v2019_07_01.DeploymentOperation;

class DeploymentOperationsImpl extends WrapperImpl<DeploymentOperationsInner> implements DeploymentOperations {
    private final ResourcesManager manager;

    DeploymentOperationsImpl(ResourcesManager manager) {
        super(manager.inner().deploymentOperations());
        this.manager = manager;
    }

    public ResourcesManager manager() {
        return this.manager;
    }

    private DeploymentOperationImpl wrapModel(DeploymentOperationInner inner) {
        return  new DeploymentOperationImpl(inner, manager());
    }

    @Override
    public Observable<DeploymentOperation> getAtTenantScopeAsync(String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAtTenantScopeAsync(deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listAtTenantScopeAsync(final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listAtTenantScopeAsync(deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> getAtManagementGroupScopeAsync(String groupId, String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAtManagementGroupScopeAsync(groupId, deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listAtManagementGroupScopeAsync(final String groupId, final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listAtManagementGroupScopeAsync(groupId, deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> getAtSubscriptionScopeAsync(String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAtSubscriptionScopeAsync(deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listAtSubscriptionScopeAsync(final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listAtSubscriptionScopeAsync(deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> getAsync(String resourceGroupName, String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAsync(resourceGroupName, deploymentName, operationId)
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listByResourceGroupAsync(final String resourceGroupName, final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName, deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return new DeploymentOperationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> listAtScopeAsync(final String scope, final String deploymentName) {
        DeploymentOperationsInner client = this.inner();
        return client.listAtScopeAsync(scope, deploymentName)
        .flatMapIterable(new Func1<Page<DeploymentOperationInner>, Iterable<DeploymentOperationInner>>() {
            @Override
            public Iterable<DeploymentOperationInner> call(Page<DeploymentOperationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<DeploymentOperationInner, DeploymentOperation>() {
            @Override
            public DeploymentOperation call(DeploymentOperationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<DeploymentOperation> getAtScopeAsync(String scope, String deploymentName, String operationId) {
        DeploymentOperationsInner client = this.inner();
        return client.getAtScopeAsync(scope, deploymentName, operationId)
        .flatMap(new Func1<DeploymentOperationInner, Observable<DeploymentOperation>>() {
            @Override
            public Observable<DeploymentOperation> call(DeploymentOperationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((DeploymentOperation)wrapModel(inner));
                }
            }
       });
    }

}

/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.AppServicePlanInner;

/**
 * Type representing AppServicePlan.
 */
public interface AppServicePlan extends HasInner<AppServicePlanInner>, Resource, GroupableResourceCore<CertificateRegistrationManager, AppServicePlanInner>, HasResourceGroup, Refreshable<AppServicePlan>, Updatable<AppServicePlan.Update>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the adminSiteName value.
     */
    String adminSiteName();

    /**
     * @return the geoRegion value.
     */
    String geoRegion();

    /**
     * @return the hostingEnvironmentProfile value.
     */
    HostingEnvironmentProfile hostingEnvironmentProfile();

    /**
     * @return the isSpot value.
     */
    Boolean isSpot();

    /**
     * @return the isXenon value.
     */
    Boolean isXenon();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the maximumNumberOfWorkers value.
     */
    Integer maximumNumberOfWorkers();

    /**
     * @return the numberOfSites value.
     */
    Integer numberOfSites();

    /**
     * @return the perSiteScaling value.
     */
    Boolean perSiteScaling();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the reserved value.
     */
    Boolean reserved();

    /**
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * @return the sku value.
     */
    SkuDescription sku();

    /**
     * @return the spotExpirationTime value.
     */
    DateTime spotExpirationTime();

    /**
     * @return the status value.
     */
    StatusOptions status();

    /**
     * @return the subscription value.
     */
    String subscription();

    /**
     * @return the targetWorkerCount value.
     */
    Integer targetWorkerCount();

    /**
     * @return the targetWorkerSizeId value.
     */
    Integer targetWorkerSizeId();

    /**
     * @return the workerTierName value.
     */
    String workerTierName();

    /**
     * The entirety of the AppServicePlan definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of AppServicePlan definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a AppServicePlan definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the AppServicePlan definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the appserviceplan update allowing to specify AdminSiteName.
         */
        interface WithAdminSiteName {
            /**
             * Specifies adminSiteName.
             */
            WithCreate withAdminSiteName(String adminSiteName);
        }

        /**
         * The stage of the appserviceplan update allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             */
            WithCreate withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the appserviceplan update allowing to specify IsSpot.
         */
        interface WithIsSpot {
            /**
             * Specifies isSpot.
             */
            WithCreate withIsSpot(Boolean isSpot);
        }

        /**
         * The stage of the appserviceplan update allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             */
            WithCreate withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the appserviceplan update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the appserviceplan update allowing to specify PerSiteScaling.
         */
        interface WithPerSiteScaling {
            /**
             * Specifies perSiteScaling.
             */
            WithCreate withPerSiteScaling(Boolean perSiteScaling);
        }

        /**
         * The stage of the appserviceplan update allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             */
            WithCreate withReserved(Boolean reserved);
        }

        /**
         * The stage of the appserviceplan update allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            WithCreate withSku(SkuDescription sku);
        }

        /**
         * The stage of the appserviceplan update allowing to specify SpotExpirationTime.
         */
        interface WithSpotExpirationTime {
            /**
             * Specifies spotExpirationTime.
             */
            WithCreate withSpotExpirationTime(DateTime spotExpirationTime);
        }

        /**
         * The stage of the appserviceplan update allowing to specify TargetWorkerCount.
         */
        interface WithTargetWorkerCount {
            /**
             * Specifies targetWorkerCount.
             */
            WithCreate withTargetWorkerCount(Integer targetWorkerCount);
        }

        /**
         * The stage of the appserviceplan update allowing to specify TargetWorkerSizeId.
         */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies targetWorkerSizeId.
             */
            WithCreate withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }

        /**
         * The stage of the appserviceplan update allowing to specify WorkerTierName.
         */
        interface WithWorkerTierName {
            /**
             * Specifies workerTierName.
             */
            WithCreate withWorkerTierName(String workerTierName);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<AppServicePlan>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAdminSiteName, DefinitionStages.WithHostingEnvironmentProfile, DefinitionStages.WithIsSpot, DefinitionStages.WithIsXenon, DefinitionStages.WithKind, DefinitionStages.WithPerSiteScaling, DefinitionStages.WithReserved, DefinitionStages.WithSku, DefinitionStages.WithSpotExpirationTime, DefinitionStages.WithTargetWorkerCount, DefinitionStages.WithTargetWorkerSizeId, DefinitionStages.WithWorkerTierName {
        }
    }
    /**
     * The template for a AppServicePlan update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<AppServicePlan>, Resource.UpdateWithTags<Update>, UpdateStages.WithAdminSiteName, UpdateStages.WithHostingEnvironmentProfile, UpdateStages.WithIsSpot, UpdateStages.WithIsXenon, UpdateStages.WithKind, UpdateStages.WithPerSiteScaling, UpdateStages.WithReserved, UpdateStages.WithSpotExpirationTime, UpdateStages.WithTargetWorkerCount, UpdateStages.WithTargetWorkerSizeId, UpdateStages.WithWorkerTierName {
    }

    /**
     * Grouping of AppServicePlan update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the appserviceplan {0} allowing to specify AdminSiteName.
         */
        interface WithAdminSiteName {
            /**
             * Specifies adminSiteName.
             */
            Update withAdminSiteName(String adminSiteName);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify HostingEnvironmentProfile.
         */
        interface WithHostingEnvironmentProfile {
            /**
             * Specifies hostingEnvironmentProfile.
             */
            Update withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify IsSpot.
         */
        interface WithIsSpot {
            /**
             * Specifies isSpot.
             */
            Update withIsSpot(Boolean isSpot);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify IsXenon.
         */
        interface WithIsXenon {
            /**
             * Specifies isXenon.
             */
            Update withIsXenon(Boolean isXenon);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify PerSiteScaling.
         */
        interface WithPerSiteScaling {
            /**
             * Specifies perSiteScaling.
             */
            Update withPerSiteScaling(Boolean perSiteScaling);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify Reserved.
         */
        interface WithReserved {
            /**
             * Specifies reserved.
             */
            Update withReserved(Boolean reserved);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify SpotExpirationTime.
         */
        interface WithSpotExpirationTime {
            /**
             * Specifies spotExpirationTime.
             */
            Update withSpotExpirationTime(DateTime spotExpirationTime);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify TargetWorkerCount.
         */
        interface WithTargetWorkerCount {
            /**
             * Specifies targetWorkerCount.
             */
            Update withTargetWorkerCount(Integer targetWorkerCount);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify TargetWorkerSizeId.
         */
        interface WithTargetWorkerSizeId {
            /**
             * Specifies targetWorkerSizeId.
             */
            Update withTargetWorkerSizeId(Integer targetWorkerSizeId);
        }

        /**
         * The stage of the appserviceplan {0} allowing to specify WorkerTierName.
         */
        interface WithWorkerTierName {
            /**
             * Specifies workerTierName.
             */
            Update withWorkerTierName(String workerTierName);
        }

    }
}

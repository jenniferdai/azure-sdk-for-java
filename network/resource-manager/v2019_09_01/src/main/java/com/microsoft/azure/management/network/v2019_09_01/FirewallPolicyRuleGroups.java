/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_09_01.implementation.FirewallPolicyRuleGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing FirewallPolicyRuleGroups.
 */
public interface FirewallPolicyRuleGroups extends SupportsCreating<FirewallPolicyRuleGroup.DefinitionStages.Blank>, HasInner<FirewallPolicyRuleGroupsInner> {
    /**
     * Gets the specified FirewallPolicyRuleGroup.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleGroupName The name of the FirewallPolicyRuleGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallPolicyRuleGroup> getAsync(String resourceGroupName, String firewallPolicyName, String ruleGroupName);

    /**
     * Lists all FirewallPolicyRuleGroups in a FirewallPolicy resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<FirewallPolicyRuleGroup> listAsync(final String resourceGroupName, final String firewallPolicyName);

    /**
     * Deletes the specified FirewallPolicyRuleGroup.
     *
     * @param resourceGroupName The name of the resource group.
     * @param firewallPolicyName The name of the Firewall Policy.
     * @param ruleGroupName The name of the FirewallPolicyRuleGroup.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String firewallPolicyName, String ruleGroupName);

}

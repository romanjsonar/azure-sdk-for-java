/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.implementation;

import java.util.List;
import com.microsoft.azure.management.notificationhubs.AccessRights;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Description of a Namespace AuthorizationRules.
 */
@JsonFlatten
public class SharedAccessAuthorizationRuleResourceInner extends Resource {
    /**
     * The rights associated with the rule.
     */
    @JsonProperty(value = "properties.rights")
    private List<AccessRights> rights;

    /**
     * Get the rights value.
     *
     * @return the rights value
     */
    public List<AccessRights> rights() {
        return this.rights;
    }

    /**
     * Set the rights value.
     *
     * @param rights the rights value to set
     * @return the SharedAccessAuthorizationRuleResourceInner object itself.
     */
    public SharedAccessAuthorizationRuleResourceInner withRights(List<AccessRights> rights) {
        this.rights = rights;
        return this;
    }

}

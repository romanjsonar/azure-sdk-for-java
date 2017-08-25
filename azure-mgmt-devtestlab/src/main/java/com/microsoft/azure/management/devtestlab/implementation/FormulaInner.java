/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.implementation;

import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.FormulaPropertiesFromVm;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * A formula for creating a VM, specifying an image base and other parameters.
 */
@JsonFlatten
public class FormulaInner extends Resource {
    /**
     * The description of the formula.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The author of the formula.
     */
    @JsonProperty(value = "properties.author")
    private String author;

    /**
     * The OS type of the formula.
     */
    @JsonProperty(value = "properties.osType")
    private String osType;

    /**
     * The creation date of the formula.
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime creationDate;

    /**
     * The content of the formula.
     */
    @JsonProperty(value = "properties.formulaContent")
    private LabVirtualMachineCreationParameterInner formulaContent;

    /**
     * Information about a VM from which a formula is to be created.
     */
    @JsonProperty(value = "properties.vm")
    private FormulaPropertiesFromVm vm;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the author value.
     *
     * @return the author value
     */
    public String author() {
        return this.author;
    }

    /**
     * Set the author value.
     *
     * @param author the author value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * Get the osType value.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Set the osType value.
     *
     * @param osType the osType value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the creationDate value.
     *
     * @return the creationDate value
     */
    public DateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the formulaContent value.
     *
     * @return the formulaContent value
     */
    public LabVirtualMachineCreationParameterInner formulaContent() {
        return this.formulaContent;
    }

    /**
     * Set the formulaContent value.
     *
     * @param formulaContent the formulaContent value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withFormulaContent(LabVirtualMachineCreationParameterInner formulaContent) {
        this.formulaContent = formulaContent;
        return this;
    }

    /**
     * Get the vm value.
     *
     * @return the vm value
     */
    public FormulaPropertiesFromVm vm() {
        return this.vm;
    }

    /**
     * Set the vm value.
     *
     * @param vm the vm value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withVm(FormulaPropertiesFromVm vm) {
        this.vm = vm;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier value.
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier value.
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the FormulaInner object itself.
     */
    public FormulaInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}

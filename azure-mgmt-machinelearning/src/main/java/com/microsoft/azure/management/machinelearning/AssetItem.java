/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearning;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about an asset associated with the web service.
 */
public class AssetItem {
    /**
     * Asset's friendly name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Asset's Id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Asset's type. Possible values include: 'Module', 'Resource'.
     */
    @JsonProperty(value = "type", required = true)
    private AssetType type;

    /**
     * Access information for the asset.
     */
    @JsonProperty(value = "locationInfo", required = true)
    private BlobLocation locationInfo;

    /**
     * Information about the asset's input ports.
     */
    @JsonProperty(value = "inputPorts")
    private Map<String, InputPort> inputPorts;

    /**
     * Information about the asset's output ports.
     */
    @JsonProperty(value = "outputPorts")
    private Map<String, OutputPort> outputPorts;

    /**
     * If the asset is a custom module, this holds the module's metadata.
     */
    @JsonProperty(value = "metadata")
    private Map<String, String> metadata;

    /**
     * If the asset is a custom module, this holds the module's parameters.
     */
    @JsonProperty(value = "parameters")
    private List<ModuleAssetParameter> parameters;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public AssetType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withType(AssetType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the locationInfo value.
     *
     * @return the locationInfo value
     */
    public BlobLocation locationInfo() {
        return this.locationInfo;
    }

    /**
     * Set the locationInfo value.
     *
     * @param locationInfo the locationInfo value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withLocationInfo(BlobLocation locationInfo) {
        this.locationInfo = locationInfo;
        return this;
    }

    /**
     * Get the inputPorts value.
     *
     * @return the inputPorts value
     */
    public Map<String, InputPort> inputPorts() {
        return this.inputPorts;
    }

    /**
     * Set the inputPorts value.
     *
     * @param inputPorts the inputPorts value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withInputPorts(Map<String, InputPort> inputPorts) {
        this.inputPorts = inputPorts;
        return this;
    }

    /**
     * Get the outputPorts value.
     *
     * @return the outputPorts value
     */
    public Map<String, OutputPort> outputPorts() {
        return this.outputPorts;
    }

    /**
     * Set the outputPorts value.
     *
     * @param outputPorts the outputPorts value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withOutputPorts(Map<String, OutputPort> outputPorts) {
        this.outputPorts = outputPorts;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Map<String, String> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the parameters value.
     *
     * @return the parameters value
     */
    public List<ModuleAssetParameter> parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters value.
     *
     * @param parameters the parameters value to set
     * @return the AssetItem object itself.
     */
    public AssetItem withParameters(List<ModuleAssetParameter> parameters) {
        this.parameters = parameters;
        return this;
    }

}

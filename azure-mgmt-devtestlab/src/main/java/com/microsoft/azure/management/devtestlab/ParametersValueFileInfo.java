/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A file containing a set of parameter values for an ARM template.
 */
public class ParametersValueFileInfo {
    /**
     * File name.
     */
    @JsonProperty(value = "fileName")
    private String fileName;

    /**
     * Contents of the file.
     */
    @JsonProperty(value = "parametersValueInfo")
    private Object parametersValueInfo;

    /**
     * Get the fileName value.
     *
     * @return the fileName value
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName value.
     *
     * @param fileName the fileName value to set
     * @return the ParametersValueFileInfo object itself.
     */
    public ParametersValueFileInfo withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the parametersValueInfo value.
     *
     * @return the parametersValueInfo value
     */
    public Object parametersValueInfo() {
        return this.parametersValueInfo;
    }

    /**
     * Set the parametersValueInfo value.
     *
     * @param parametersValueInfo the parametersValueInfo value to set
     * @return the ParametersValueFileInfo object itself.
     */
    public ParametersValueFileInfo withParametersValueInfo(Object parametersValueInfo) {
        this.parametersValueInfo = parametersValueInfo;
        return this;
    }

}

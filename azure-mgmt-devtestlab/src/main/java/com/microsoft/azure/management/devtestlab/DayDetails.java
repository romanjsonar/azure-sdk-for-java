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
 * Properties of a daily schedule.
 */
public class DayDetails {
    /**
     * The time of day the schedule will occur.
     */
    @JsonProperty(value = "time")
    private String time;

    /**
     * Get the time value.
     *
     * @return the time value
     */
    public String time() {
        return this.time;
    }

    /**
     * Set the time value.
     *
     * @param time the time value to set
     * @return the DayDetails object itself.
     */
    public DayDetails withTime(String time) {
        this.time = time;
        return this;
    }

}

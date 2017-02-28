/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql;

import java.util.List;
import java.util.UUID;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasId;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasName;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.model.Refreshable;
import com.microsoft.azure.management.resources.fluentcore.model.Wrapper;
import com.microsoft.azure.management.sql.implementation.AuditingPolicyInner;


/**
 * An immutable client-side representation of an Azure SQL Service tier advisor.
 */
@Fluent
public interface AuditingPolicy extends
        Refreshable<AuditingPolicy>,
        Wrapper<AuditingPolicyInner>,
        HasResourceGroup,
        HasName,
        HasId {

    /**
     * @return if this Auditing Policy is set
     */
    boolean isValid();
	
    /**
     * @return if this Auditing Policy is active
     */
    boolean isActive();

    /**
     * @return if this Auditing Policy is active
     */
    boolean isUseServerDefault();

    /**
     * @return type of the Auditing Policy
     */
    String policyType();

    /**
     * @return location of the server with this Auditing Policy
     */
    String serverLocation();

    /**
     * @return name of the SQL Server to which this replication belongs
     */
    String sqlServerName();

    /**
     * @return name of the SQL Database to which this replication belongs
     */
    String databaseName();

	/**
	 * @return the auditingState of the auditing policy
	 */
	public String auditingState();

	/**
	 * @return the eventTypesToAudit of the auditing policy
	 */
	public List<String> eventTypesToAudit();

	/**
	 * @return the auditLogsTableName of the auditing policy
	 */
	public String auditLogsTableName();

	/**
	 * @return the retentionDays of the auditing policy
	 */
	public String retentionDays();

	/**
	 * @return the storageAccountName of the auditing policy
	 */
	public String storageAccountName();

	/**
	 * @return the storageAccountKey of the auditing policy
	 */
	public String storageAccountKey();

	/**
	 * @return the secondaryStorageAccountKey of the auditing policy
	 */
	public String secondaryStorageAccountKey();

	/**
	 * @return the storageTableEndpoint of the auditing policy
	 */
	public String storageTableEndpoint();

	/**
	 * @return the storageAccountResourceGroupName of the auditing policy
	 */
	public String storageAccountResourceGroupName();

	/**
	 * @return the storageAccountSubscriptionId of the auditing policy
	 */
	public UUID storageAccountSubscriptionId();

	/**
	 * 
	 * @return the storageAccountType of the auditing policy
	 */
	public String storageAccountType();

	/**
	 * @return the useServerDefault of the auditing policy
	 */
	public String useServerDefault();

	
	
}


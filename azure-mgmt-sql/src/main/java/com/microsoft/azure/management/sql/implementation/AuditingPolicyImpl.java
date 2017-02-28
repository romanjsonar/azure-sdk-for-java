/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.sql.implementation;

import java.util.List;
import java.util.UUID;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceId;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.AuditingPolicy;

/**
 * Implementation for Azure SQL Database's service tier advisor.
 */
@LangDefinition
class AuditingPolicyImpl
        extends WrapperImpl<AuditingPolicyInner>
        implements AuditingPolicy {
	
    private final ResourceId resourceId;
    private final DatabasesInner databasesInner;
    private final ServersInner serversInner;

    protected AuditingPolicyImpl(AuditingPolicyInner innerObject, DatabasesInner databasesInner) {
        super(innerObject);
        this.resourceId = ResourceId.fromString(this.inner().id());
        this.databasesInner = databasesInner;
        this.serversInner = null;
    }

    protected AuditingPolicyImpl(AuditingPolicyInner innerObject, ServersInner serversInner) {
        super(innerObject);
        this.resourceId = ResourceId.fromString(this.inner().id());
        this.databasesInner = null;
        this.serversInner = serversInner;
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public boolean isValid()
    {
    	return this.id()!=null;
    }
	
    @Override
    public boolean isActive()
    {
    	return this.auditingState()!=null && "Enabled".equals(this.auditingState());
    }

    @Override
    public boolean isUseServerDefault()
    {
    	return this.useServerDefault()!=null && "Enabled".equals(this.useServerDefault());
    }
    
    @Override
    public String policyType() {
        return this.inner().type();
    }

    @Override
    public String serverLocation() {
        return this.inner().location();
    }

    @Override
    public String resourceGroupName() {
        return this.resourceId.resourceGroupName();
    }

    @Override
    public String sqlServerName() {
        return this.resourceId.parent().parent().name();
    }

    @Override
    public String databaseName() {
        return this.resourceId.parent().name();
    }

	@Override
	public String auditingState()
	{
		return this.inner().auditingState();
	}

	@Override
	public List<String> eventTypesToAudit()
	{
		return this.inner().eventTypesToAudit();
	}

	@Override
	public String auditLogsTableName()
	{
		return this.inner().auditLogsTableName();
	}

	@Override
	public String retentionDays()
	{
		return this.inner().retentionDays();
	}

	@Override
	public String storageAccountName()
	{
		return this.inner().storageAccountName();
	}

	@Override
	public String storageAccountKey()
	{
		return this.inner().storageAccountKey();
	}

	@Override
	public String secondaryStorageAccountKey()
	{
		return this.inner().secondaryStorageAccountKey();
	}

	@Override
	public String storageTableEndpoint()
	{
		return this.inner().storageTableEndpoint();
	}

	@Override
	public String storageAccountResourceGroupName()
	{
		return this.inner().storageAccountResourceGroupName();
	}

	@Override
	public UUID storageAccountSubscriptionId()
	{
		return this.inner().storageAccountSubscriptionId();
	}

	@Override
	public String storageAccountType()
	{
		return this.inner().storageAccountType();
	}

	@Override
	public String useServerDefault()
	{
		return this.inner().useServerDefault();
	}

	@Override
    public AuditingPolicy refresh() {
        //sloUsageMetrics = null;
		if (serversInner!=null)
			this.setInner(this.serversInner.getAuditingPolicy(this.resourceGroupName(), this.sqlServerName()));
		else
			this.setInner(this.databasesInner.getAuditingPolicy(this.resourceGroupName(), this.sqlServerName(), this.databaseName()));
        return this;
    }
}

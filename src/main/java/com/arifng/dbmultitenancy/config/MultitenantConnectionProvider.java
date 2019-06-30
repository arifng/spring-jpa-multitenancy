package com.arifng.dbmultitenancy.config;

import com.arifng.dbmultitenancy.model.Tenant;
import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;

/**
 * Created by rana on 30/6/19.
 */
public class MultitenantConnectionProvider extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {
    @Autowired
    private RoutingDataSource routingDataSource;

    @Override
    protected DataSource selectAnyDataSource() {
        return routingDataSource.getDefaultDataSource();
    }

    @Override
    protected DataSource selectDataSource(String tenantName) {
        return routingDataSource.getDataSourceByTenant(Tenant.findByName(tenantName));
    }
}

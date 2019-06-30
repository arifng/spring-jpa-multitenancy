package com.arifng.dbmultitenancy.config;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;

/**
 * Created by rana on 30/6/19.
 */
public class TenantIdentifierResolver implements CurrentTenantIdentifierResolver {
    @Override
    public String resolveCurrentTenantIdentifier() {
        return TenantContext.getTenant().getName();
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}

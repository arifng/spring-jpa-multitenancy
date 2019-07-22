package com.arifng.dbmultitenancy.repoconfig;

import com.arifng.dbmultitenancy.model.Tenant;

import java.util.Objects;

/**
 * Created by rana on 30/6/19.
 */
public class TenantContext {
    private static final ThreadLocal<Tenant> tenantHolder = new ThreadLocal<>();

    public static Tenant getTenant() {
        Tenant tenant = tenantHolder.get();
        return Objects.isNull(tenant) ? Tenant.DEFAULT : tenant;
    }

    public static void setTenant(Tenant tenant) {
        tenantHolder.set(tenant);
    }

    public static void clearTenant() {
        tenantHolder.remove();
    }
}

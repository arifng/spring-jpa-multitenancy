package com.arifng.dbmultitenancy.support;

import com.arifng.dbmultitenancy.repoconfig.TenantContext;
import com.arifng.dbmultitenancy.model.Tenant;

/**
 * Created by rana on 30/6/19.
 */
public class TenantAwareThread extends Thread {
    private Tenant tenant = null;

    public TenantAwareThread(Runnable target) {
        super(target);
        this.tenant = TenantContext.getTenant();
    }

    @Override
    public void run() {
        TenantContext.setTenant(this.tenant);
        super.run();
        TenantContext.clearTenant();
    }
}

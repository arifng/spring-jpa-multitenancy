package com.arifng.dbmultitenancy.webconfig;

import com.arifng.dbmultitenancy.model.Tenant;
import com.arifng.dbmultitenancy.repoconfig.TenantContext;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rana on 22/7/19.
 */
public class TenantIdentifierInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hadler){
        String tenant = request.getParameter("tenant");
        TenantContext.setTenant(Tenant.findByName(tenant));
        return true;
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, @Nullable Exception ex) throws Exception {
        TenantContext.clearTenant();
    }
}

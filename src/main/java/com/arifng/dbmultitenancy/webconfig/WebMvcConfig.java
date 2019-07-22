package com.arifng.dbmultitenancy.webconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by rana on 22/7/19.
 */
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tenantIdentifierInterceptor());
    }

    @Bean
    public TenantIdentifierInterceptor tenantIdentifierInterceptor() {
        return new TenantIdentifierInterceptor();
    }
}

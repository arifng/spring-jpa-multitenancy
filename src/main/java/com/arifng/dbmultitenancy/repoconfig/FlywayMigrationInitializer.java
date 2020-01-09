package com.arifng.dbmultitenancy.repoconfig;

import com.arifng.dbmultitenancy.model.Tenant;
import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Rana on 2020-01-08.
 */
public class FlywayMigrationInitializer {
    @Autowired
    private RoutingDataSource routingDataSource;

    public void migrate() {
        String scriptLocation = "db/migration";
        String dbPrefix = "db_";

        for (Tenant tenant : Tenant.values()) {
            String dbName = dbPrefix + tenant.getName();

            Flyway flyway = Flyway.configure()
                    .locations(scriptLocation)
                    .baselineOnMigrate(Boolean.TRUE)
                    .dataSource(routingDataSource.getDataSourceByTenant(tenant))
                    .schemas(dbName)
                    .load();

            flyway.migrate();
        }
    }
}

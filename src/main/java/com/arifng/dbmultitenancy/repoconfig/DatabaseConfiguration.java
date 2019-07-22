package com.arifng.dbmultitenancy.repoconfig;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by rana on 30/6/19.
 */
@Getter
public class DatabaseConfiguration {
    @Value("${application.database.url}")
    private String url;

    @Value("${application.database.user}")
    private String user;

    @Value("${application.database.password}")
    private String password;
}

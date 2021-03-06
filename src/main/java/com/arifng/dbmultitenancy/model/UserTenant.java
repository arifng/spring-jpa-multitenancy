package com.arifng.dbmultitenancy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * Created by rana on 30/6/19.
 * This table only available in default database
 */
@Data
@Entity
@Table(name = "user_tenants")
@EqualsAndHashCode(callSuper = false)
public class UserTenant extends BaseEntity {
    private static final long serialVersionUID = 1287583108972033641L;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "tenant")
    @Convert(converter = Tenant.TypeConverter.class)
    private Tenant tenant;
}

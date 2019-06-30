package com.arifng.dbmultitenancy.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by rana on 30/6/19.
 */
@Data
@Entity
@Table(name = "organizations")
public class Organization extends BaseEntity {
    private static final long serialVersionUID = -6144389355317857388L;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;
}

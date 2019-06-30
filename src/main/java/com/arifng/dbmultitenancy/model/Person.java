package com.arifng.dbmultitenancy.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rana on 27/6/19.
 */
@Data
@Entity
@Table(name = "persons")
public class Person extends BaseEntity {
    private static final long serialVersionUID = -4277100454311602070L;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "social_security_number")
    private String socialSecurityNumber;

    @Column(name = "home_phone")
    private String homePhone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;

    @Column(name = "email")
    private String email;
}

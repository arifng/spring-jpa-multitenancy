package com.arifng.dbmultitenancy.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by rana on 22/7/19.
 */
@Data
@Entity
@Table(name = "users")
@EqualsAndHashCode(callSuper = false)
public class User extends BaseEntity {
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "person_id")
    private Person person;
}

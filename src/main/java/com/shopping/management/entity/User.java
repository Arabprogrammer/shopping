package com.shopping.management.entity;


import com.shopping.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User extends BaseEntity<Long> {

    private String firstName;

    private String lastName;

}

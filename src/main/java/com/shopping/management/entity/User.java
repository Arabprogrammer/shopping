package com.shopping.management.entity;


import com.shopping.base.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
public class User extends BaseEntity<Long> {

    private String firstName;

    private String lastName;

}

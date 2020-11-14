package com.robin.springboot06jpa.entity;

import javax.persistence.*;

// User JPA annotation to config mapping relation
@Entity // inform JPA this is an entity class
@Table(name = "tbl_user") // @Table to specify which table to map
public class User {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "last_name", length = 50)
    private String lastName;

    // @Column Default is email
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

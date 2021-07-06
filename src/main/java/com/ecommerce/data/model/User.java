package com.ecommerce.data.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String userEmail;
    @Column(nullable = false)
    private String usertype;
    @Column(nullable = false)
    private String usertypes;
    
}

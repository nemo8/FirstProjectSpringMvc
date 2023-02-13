package com.example.spring_postgre.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cust_id")
    private long id;
    private String name;
    private String connection;
    private String data;
    @Column(name = "product_id")
    private String product;
}

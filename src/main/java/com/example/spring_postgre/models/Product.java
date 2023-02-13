package com.example.spring_postgre.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "product_name")
    private String name;
    private String weight;
    private String price;
    private String volume;
    @Column(name = "description")
    private String desc;

}

package com.example.spring_postgre.repositories;

import com.example.spring_postgre.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertAction extends CrudRepository<Product,Long> {
}

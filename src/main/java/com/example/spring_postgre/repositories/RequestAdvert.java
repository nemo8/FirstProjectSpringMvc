package com.example.spring_postgre.repositories;

import com.example.spring_postgre.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface RequestAdvert extends CrudRepository<Customer,Long> {
}

package com.santander.bootcamp.productcatalog.repository;

import com.santander.bootcamp.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {



}

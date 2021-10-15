package com.classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.table.Products;

public interface ProductRepository extends JpaRepository<Products, Long>{

}

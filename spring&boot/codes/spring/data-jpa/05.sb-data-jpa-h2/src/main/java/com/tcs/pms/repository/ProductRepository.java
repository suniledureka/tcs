package com.tcs.pms.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.pms.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Serializable> {

}

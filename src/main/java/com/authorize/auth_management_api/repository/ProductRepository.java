package com.authorize.auth_management_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.authorize.auth_management_api.entity.ProductSchema;

@Repository
public interface ProductRepository extends JpaRepository<ProductSchema, Integer> {
    
}

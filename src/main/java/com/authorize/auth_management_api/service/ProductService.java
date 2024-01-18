package com.authorize.auth_management_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authorize.auth_management_api.entity.ProductSchema;
import com.authorize.auth_management_api.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<ProductSchema> findAll() {
        return productRepository.findAll();
    }
}

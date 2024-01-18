package com.authorize.auth_management_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.authorize.auth_management_api.entity.ProductSchema;
import com.authorize.auth_management_api.service.ProductService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    @PreAuthorize("hasAuthority('USER')")
    public List<ProductSchema> getAllProduct() {
        return productService.findAll();
    }

    @PostMapping(path = "/add")
    public String postMethodName(@RequestBody ProductSchema product) {
        return "None";
    }

}

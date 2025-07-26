package com.instamart.shopping_delivery.service;

import com.instamart.shopping_delivery.models.Product;
import com.instamart.shopping_delivery.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    ProductRepository productRepository;

    public AdminService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void saveProduct(Product product) {
        this.productRepository.save(product);
    }
}

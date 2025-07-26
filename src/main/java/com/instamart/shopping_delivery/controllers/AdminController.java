package com.instamart.shopping_delivery.controllers;

import com.instamart.shopping_delivery.models.Product;
import com.instamart.shopping_delivery.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/admin")
@CrossOrigin(origins = "*")
public class AdminController {
    AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/product/registration")
    public void save(@RequestBody Product product) {
        System.out.println(product);
        this.adminService.saveProduct(product);
    }
}

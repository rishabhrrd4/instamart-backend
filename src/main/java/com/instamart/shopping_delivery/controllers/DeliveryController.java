package com.instamart.shopping_delivery.controllers;

import com.instamart.shopping_delivery.models.DeliveryPartnerRegistrationRequest;
import com.instamart.shopping_delivery.service.DeliveryService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/delivery")
@CrossOrigin(origins = "*")
public class DeliveryController {
    DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @PostMapping("dp/signup")
    public void signupDp(@RequestBody DeliveryPartnerRegistrationRequest deliveryPartnerRegistrationRequest) {
        this.deliveryService.registerDp(deliveryPartnerRegistrationRequest);
    }
}

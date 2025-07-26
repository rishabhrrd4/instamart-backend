package com.instamart.shopping_delivery.service;

import com.instamart.shopping_delivery.models.DeliveryPartnerRegistrationRequest;
import com.instamart.shopping_delivery.repositories.DeliveryRepository;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    DeliveryRepository deliveryRepository;

    public DeliveryService(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    public void registerDp(DeliveryPartnerRegistrationRequest deliveryPartnerRegistrationRequest) {
        this.deliveryRepository.save(deliveryPartnerRegistrationRequest);
    }
}

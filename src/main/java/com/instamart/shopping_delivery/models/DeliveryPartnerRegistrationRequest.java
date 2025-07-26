package com.instamart.shopping_delivery.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "delivery-partner")
public class DeliveryPartnerRegistrationRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String pincode;
    private String address;
}

package com.eadp.orderserviceapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Order{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    private double amount;
    private Date date;
    private long userId;
    private long productId;
}

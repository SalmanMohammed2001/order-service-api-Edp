package com.eadp.orderserviceapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long payId;
    private Date date;
    private double amount;
    private String paymentType;
    private boolean status;

    @OneToOne
    @JoinColumn(name = "order_id",unique = true)
    private Orders order;

}

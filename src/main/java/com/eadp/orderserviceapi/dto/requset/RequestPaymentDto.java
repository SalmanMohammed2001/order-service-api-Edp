package com.eadp.orderserviceapi.dto.requset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestPaymentDto {
    private Date date;
    private double amount;
    private String paymentType;
    private boolean status;

}

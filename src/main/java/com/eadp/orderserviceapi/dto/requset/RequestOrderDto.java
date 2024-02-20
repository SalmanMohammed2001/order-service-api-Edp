package com.eadp.orderserviceapi.dto.requset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestOrderDto {
    private double amount;
    private Date date;
    private long userId;
    private long productId;
}

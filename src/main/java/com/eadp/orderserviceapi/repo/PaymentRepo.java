package com.eadp.orderserviceapi.repo;


import com.eadp.orderserviceapi.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepo extends JpaRepository<Payment,Long> {


}

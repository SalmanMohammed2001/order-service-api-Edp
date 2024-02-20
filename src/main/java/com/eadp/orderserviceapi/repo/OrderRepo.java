package com.eadp.orderserviceapi.repo;


import com.eadp.orderserviceapi.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders,Long> {


}

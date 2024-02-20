package com.eadp.orderserviceapi.repo;


import com.eadp.orderserviceapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {


}

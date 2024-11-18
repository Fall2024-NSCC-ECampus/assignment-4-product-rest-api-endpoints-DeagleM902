package com.example.couriersystem.repository;

import com.example.couriersystem.model.DeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<DeliveryDetails, Long> {
    //Queries as needed
}

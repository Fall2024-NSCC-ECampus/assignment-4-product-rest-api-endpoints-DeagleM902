package com.example.couriersystem.repository;

import com.example.couriersystem.model.NonDeliveryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonDeliveryRepository extends JpaRepository<NonDeliveryDetails, Long> {
    //Queries as needed
}

package com.example.couriersystem.repository;

import com.example.couriersystem.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    //Queries as needed
}

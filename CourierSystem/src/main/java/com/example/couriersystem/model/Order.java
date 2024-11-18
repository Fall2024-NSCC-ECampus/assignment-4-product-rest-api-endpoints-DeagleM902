package com.example.couriersystem.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "orders") //Order is a SQL keyword, @Table is a necessary annotation
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime orderDate;

    @ManyToOne
    Product product;

    @OneToOne
    private Payment payment;

    //Constructor, getter + setter, etc.
}

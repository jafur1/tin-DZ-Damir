package ru.shop.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Table(name = "order")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    @Id
    UUID id;
    UUID customerId;
    UUID productId;
    long count;
    long amount;
}

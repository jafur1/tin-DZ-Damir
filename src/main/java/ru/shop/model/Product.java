package ru.shop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Entity
@Table(name = "product")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    UUID id;
    String name;
    long cost;
    @Enumerated(EnumType.STRING)
    ProductType productType;
}

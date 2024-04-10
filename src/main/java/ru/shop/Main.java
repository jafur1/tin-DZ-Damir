package ru.shop;

import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.repository.ProductRepository;

import java.util.UUID;

public class Main {
    private static final ProductRepository productRepository = new ProductRepository();
    public static void main(String[] args) {
        var product = new Product();
        product.setId(UUID.randomUUID());
        product.setName("damir");
        product.setCost(99);
        product.setProductType(ProductType.GOOD);

        System.out.println("product = " + product);

        var productRepository = new ProductRepository();
        productRepository.save(product);
        System.out.println("nan = " + productRepository.findAll());
    }

}
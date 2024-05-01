
package ru.shop.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.shop.exception.BadOrderCountException;
import ru.shop.exception.EntityNotFoundException;
import ru.shop.model.Product;
import ru.shop.model.ProductType;
import ru.shop.service.ProductService;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public List<Product> getAllProduct() {
        return productService.findAll();
    }
    @GetMapping("/{id}")
    public Product getById(@PathVariable UUID id) {
        return  productService.getById(id);
    }
    @PostMapping
    public void save(@RequestBody Product product) {
        productService.save(product);
    }
    @GetMapping("/type/{productType}")
    public List<Product> getByProductType(@PathVariable ProductType productType) {
        return productService.findByProductType(productType);
    }

}


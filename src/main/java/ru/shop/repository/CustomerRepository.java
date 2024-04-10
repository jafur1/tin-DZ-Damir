package ru.shop.repository;

import ru.shop.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();
    public void save(Customer product){
        customers.add(product);
    }

    public List<Customer> findAll() {
        return customers;
    }
}

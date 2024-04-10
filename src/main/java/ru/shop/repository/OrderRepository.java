package ru.shop.repository;

import ru.shop.model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public void save(Order product) {
        orders.add(product);
    }

    public List<Order> findAll() {
        return orders;
    }

    public List<Order> findCustomerOrder(UUID customerId) {
        var list = new ArrayList<Order>();
        for (Order order : orders) {
            if (Objects.equals(order.getCustomerId(), customerId)) {
                list.add(order);
            }
        }
        return list;
    }
}
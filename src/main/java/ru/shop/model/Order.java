package ru.shop.model;

import java.util.UUID;

public class Order {
    private UUID id;
    private long count;
    private UUID customerId;
    private UUID productId;
    private long amount;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", count=" + count +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}

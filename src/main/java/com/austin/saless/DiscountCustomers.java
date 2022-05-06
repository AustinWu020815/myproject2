package com.austin.saless;

public class DiscountCustomers extends Customers{
    public DiscountCustomers(String id, int amount) {
        super(id, amount);
    }

    @Override
    public float backMoney() {
        return amount*off;
    }
}

package com.austin.saless;

public class GoldenCustomer extends Customers{
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
        off = 0.2f;
    }
}

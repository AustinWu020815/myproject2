package com.austin.saless;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customers> customers = new ArrayList<>();
        customers.add(new Customers("0001", 1200));
        customers.add(new Customers("0002", 800));
        customers.add(new SilverCustomer("0003", 2000));
        customers.add(new GoldenCustomer("0004", 5000));
        customers.add(new DiscountCustomers("0006", 900));
        for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }
        for (Customers c: customers) {
            c.print();
        }
    }
}

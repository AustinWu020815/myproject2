package com.austin.saless;

public class SilverCustomer extends Customers{
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print() {
        System.out.println(id + "\t" + amount + "\t" +
                (amount-backMoney()) +
                "(" + backMoney() + ")");
    }
}

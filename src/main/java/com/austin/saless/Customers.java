package com.austin.saless;

public class Customers {
    String id;
    int amount;
    float off = 0.1f;
    public Customers(String id, int amount) {
        this.id = id;
        this.amount = amount;
    }
    public float backMoney() {
        return (amount/1000)*off*1000;
    }

    public void print(){
        System.out.println(id + "\t" + amount + "\t" +
                (amount-backMoney()));
    }
}

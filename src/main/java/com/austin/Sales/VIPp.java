package com.austin.Sales;

public class VIPp {
    String stage;
    int price;
    float off = 0.7f;
    float pay;
    float p = 0.2f;
    float point;
    public VIPp(String stage){this.stage = stage;}
    public VIPp(String stage, int price, float pay, float point){
        this(stage);
        this.price = 4000;
        this.pay = price * off;
        this.point = pay * p;
    }
    public VIPp(){this("Platinum",4000,2800,800);}
    public void print(){
        System.out.println(stage + "\t" + price + "\t" + pay + "\t" + "(" + point + ")");
    }
}

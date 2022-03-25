package com.austin.Sales;

public class VIPs {
    String stage;
    int pay;
    int welfare;
    int coopon;
    public VIPs(String stage){this.stage = stage;}
    public VIPs(String stage, int pay, int welfare, int coopon){
        this(stage);
        this.pay = pay;
        this.welfare = (pay/1000)*100;
        this.coopon = (pay/1000)*100;
    }
    public VIPs(){
        this("Silver",1000,100,100);
    }
    public void print(){
        System.out.print(stage + "\t" + pay + "\t" + welfare + "\t\t" + coopon);
    }
}

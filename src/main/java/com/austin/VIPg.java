package com.austin;

public class VIPg {
    String stage;
    int pay;
    int welfare;
    int coopon;
    public VIPg(String stage){this.stage = stage;}
    public VIPg(String stage, int pay, int welfare, int coopon){
        this(stage);
        this.pay = pay;
        this.welfare = (pay/1000)*200;
        this.coopon = (pay/1000)*200;
    }
    public VIPg(){
        this("Golden",1000,200,200);
    }
    public void print(){
        System.out.print(stage + "\t" + pay + "\t" + welfare + "\t\t" + coopon);
    }
}

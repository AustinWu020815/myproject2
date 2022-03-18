package com.austin;

public class VIPc {
    String stage;
    int pay;
    int welfare;
    int coopon;
    public VIPc(String stage){this.stage = stage;}
    public VIPc(String stage, int pay, int welfare, int coopon){
        this(stage);
        this.pay = pay;
        this.welfare = (pay/1000)*100;
        this.coopon = (pay/1000)*0;
    }
    public VIPc(){
        this("Common",1000,100,0);
    }
    public void print(){
        System.out.print(stage + "\t" + pay + "\t" + welfare + "\t\t" + "--");
    }
}

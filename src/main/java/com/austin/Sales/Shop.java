package com.austin.Sales;

public class Shop {
    public static void main(String[] args) {
        VIPc comm = new VIPc();
        VIPs silv = new VIPs();
        VIPg gold = new VIPg();
        System.out.println("Stage" + "\t" + "Pay" + "\t\t" + "Welfare" + "\t" + "Coopon");
        comm.print();
        System.out.println();
        silv.print();
        System.out.println();
        gold.print();
    }
}

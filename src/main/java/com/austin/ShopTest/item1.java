package com.austin.ShopTest;

public class item1 {
        String ID;
        String NAME;
        int PRICE;
        int QTY = 1;
        int PAY;
        String MEMO;
        public item1(String ID){ this.ID =ID;}
        public item1(String ID, String NAME, int PRICE){
            this(ID);
            this.NAME = NAME;
            this.PRICE = PRICE;
            this.PAY = PRICE;
        }
        public void print(){
            System.out.println(ID + "\t" + NAME + "\t" + PRICE + "\t\t" + QTY + "\t" + PAY);
        }
    }

package com.austin.ShopTest;

public class BuyOneGetOneShopItem {
        String ID;
        String NAME;
        int PRICE;
        int QTY = 2;
        int PAY = PRICE;
        String MEMO = "Buy 1 Get 1";

        public BuyOneGetOneShopItem(String ID) {
            this.ID = ID;
        }

        public BuyOneGetOneShopItem(String ID, String NAME, int PRICE) {
            this(ID);
            this.NAME = NAME;
            this.PRICE = PRICE;
            this.PAY = (PRICE*QTY)/2;
        }

        public void print() {
            System.out.println(ID + "\t" + NAME + "\t" + PRICE + "\t\t" + QTY + "\t" + PAY + "\t" + MEMO);
        }
    }

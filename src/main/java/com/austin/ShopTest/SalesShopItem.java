package com.austin.ShopTest;

public class SalesShopItem {
        String ID;
        String NAME;
        int PRICE;
        int QTY = 1;
        int PAY = PRICE;
        int MEMO = 20;

        public SalesShopItem(String ID) {
            this.ID = ID;
        }

        public SalesShopItem(String ID, String NAME, int PRICE, int MEMO) {
            this(ID);
            this.NAME = NAME;
            this.PRICE = PRICE;
            this.PAY = (PRICE*8)/10;
            this.MEMO = MEMO;
        }

        public void print() {
            System.out.println(ID + "\t" + NAME + "\t" + PRICE + "\t\t" + QTY + "\t" + PAY + "\t" + MEMO + "% off");
        }
    }

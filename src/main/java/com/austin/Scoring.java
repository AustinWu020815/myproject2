package com.austin;

public class Scoring {
    public static void main(String[] args) {
        String[] names = {"Andy", "Lisa", "Emily", "Scott"};
        int[] mend = {85, 47, 98, 64};
        int[] eng = {23, 99, 84, 55};
        int[] math = {96, 72, 51, 77};
        for (int i = 0; i < 4; i++) {
            if (i == 2){
                System.out.println(names[i]);
            }else {
                System.out.println(names[i] + "\t" + mend[i] + "\t" + eng[i] + "\t" + math[i]);
            }
        }
    }
}
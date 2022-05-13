package com.austin.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "NAU-0859";
        String enter = "09:00";
        String exit = "18:16";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date t1 = null;
        try {
            t1 = sdf.parse(enter);
            System.out.println(t1);
            System.out.println(t1.getTime());
        } catch (Exception e) {
            System.out.println("wrong format");
        }

        long ms = 3*60*60*1000;

        try {
            Date t2 = sdf.parse(exit);
            System.out.println(t2);
            System.out.println(t2.getTime());
            int mins = (int)((t2.getTime()-t1.getTime())/1000/60);
            System.out.println("You have stay: " + mins + " mins");
//          30 NTD per hour
            int fee = 30*(mins/60);
//          9:14 => 270 dollars ; 9:15 => 300 dollars
            if ((mins % 60) > 14){
                fee = 30*((mins/60) + 1);
            }
            System.out.println("Yuor fee is: " + fee + " dollars");
        } catch (Exception e) {
            System.out.println("wrong format");
        }

    }
}

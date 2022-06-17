package com.austin.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHISIUNG_STATION = 300;

    Station start;
    Station destination;
    int price;
    public Ticket(Station start, Station destination){
        this.start = start;
        this.destination = destination;
        if (start == Station.TAIPEI_STATION){
            if (destination == Station.TAICHUNG_STATION){
                price = 600;
            }else if(destination == Station.KAOHSIUNG_STATION){
                price = 1500;
            }
        }else if(start == Station.TAICHUNG_STATION){
            if (destination ==Station.TAIPEI_STATION){
                price = 600;
            }else if (destination == Station.KAOHSIUNG_STATION){
                price = 900;
            }
        }else if(start == Station.KAOHSIUNG_STATION){
            if (destination == Station.TAIPEI_STATION){
                price = 1500;
            }else if(destination == Station.TAICHUNG_STATION){
                price = 900;
            }
        }
    }
    public void print(){
        System.out.println(start.station + "\t" + destination.station + "\t" + price);
    }
}

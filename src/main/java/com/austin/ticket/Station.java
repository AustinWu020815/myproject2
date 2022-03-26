package com.austin.ticket;

public class Station {
    int ID;
    String station;
    public Station(int ID, String station){
        this.ID =ID;
        this.station =station;
    }
    public static final Station TAIPEI_STATION = new Station(100,"TAIPEI");
    public static final Station TAICHUNG_STATION =new Station(200, "TAICHUNG");
    public static final Station KAOHSIUNG_STATION = new Station(300, "KAOHSIUNG");
}

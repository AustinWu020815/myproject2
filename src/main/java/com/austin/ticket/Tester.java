package com.austin.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION, Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Start Station? (1.Taipei, 2.Taichung, 3.Kaohsiung");
        Station startStation = null;
        int choice = Integer.parseInt(scanner.next());
        switch(choice){
            case 1:
                startStation = Station.TAIPEI_STATION;
                break;
            case 2:
                startStation = Station.TAICHUNG_STATION;
                break;
            case 3:
                startStation = Station.KAOHSIUNG_STATION;
                break;
        }
    }
}

package com.austin.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(Station.TAIPEI_STATION, Station.KAOHSIUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Start Station? (1.Taipei, 2.Taichung, 3.Kaohsiung)");
        Station startStation = null;
        int choice1 = Integer.parseInt(scanner.next());
            switch (choice1) {
                case 1:
                    startStation = Station.TAIPEI_STATION;
                    System.out.println("Your Start Station is TAIPEI");
                    break;
                case 2:
                    startStation = Station.TAICHUNG_STATION;
                    System.out.println("Your Start Station is TAICHUNG");
                    break;
                case 3:
                    startStation = Station.KAOHSIUNG_STATION;
                    System.out.println("Your Start Station is KAOHSIUNG");
                    break;
                default:
                    break;
            }
        System.out.println("What is your Destination? (1.Taipei, 2.Taichung, 3.Kaohsiung)");
        Station destination = null;
        int choice2 = Integer.parseInt(scanner.next());
        switch (choice2) {
            case 1:
                destination = Station.TAIPEI_STATION;
                System.out.println("Your destination is TAIPEI");
                break;
            case 2:
                destination = Station.TAICHUNG_STATION;
                System.out.println("Your destination is TAICHUNG");
                break;
            case 3:
                destination = Station.KAOHSIUNG_STATION;
                System.out.println("Your destination is KAOHSIUNG");
                break;
            default:
                break;
        }
    }
}

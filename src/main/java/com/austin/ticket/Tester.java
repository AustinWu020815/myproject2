package com.austin.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your Start Station? (1.Taipei, 2.Taichung, 3.Kaohsiung)");
        Station startStation = null;
        int choice = Integer.parseInt(scanner.next());
            switch (choice) {
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
            }
        System.out.println("What is your Destination? (1.Taipei, 2.Taichung, 3.Kaohsiung)");
        Station destination = null;
        choice = Integer.parseInt(scanner.next());
        switch (choice) {
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
        }
        System.out.println("Which Ticket does you prefer? (1.Normal 2.Students 3.Elders)");
        choice = Integer.parseInt(scanner.next());
        Ticket ticket = null;
        switch (choice){
            case 1:
                ticket = new Ticket(startStation, destination);
                System.out.println("You pick the Normal ticket.");
                break;
            case 2:
                ticket = new Ticket(startStation,destination);
                System.out.println("You pick the Students ticket.");
                break;
            case 3:
                ticket = new Ticket(startStation,destination);
                System.out.println("You pick the Elders ticket.");
                break;
        }
        ticket.print();
    }
}

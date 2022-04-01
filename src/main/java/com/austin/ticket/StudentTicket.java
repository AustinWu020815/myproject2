package com.austin.ticket;

public class StudentTicket extends Ticket{
    float off = 0.8f;
    public StudentTicket(Station startStation,Station destination) {
        super(startStation, destination);
    }
    
}

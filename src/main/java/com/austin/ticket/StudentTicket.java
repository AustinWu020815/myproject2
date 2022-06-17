package com.austin.ticket;

public class StudentTicket extends Ticket{
    float off = 0.8f;
    public StudentTicket(Station start, Station destination) {
        super(start, destination);
        price = price - (int) (price * off);
    }
}

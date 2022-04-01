package com.austin.ticket;

public class EldersTicket extends Ticket{
    float off = 0.5f;
    public EldersTicket(Station startStation, Station destination) {
        super(startStation, destination);
    }
}

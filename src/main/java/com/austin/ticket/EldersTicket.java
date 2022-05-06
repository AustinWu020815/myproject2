package com.austin.ticket;

public class EldersTicket extends Ticket{
    float off = 0.5f;
    public EldersTicket(Station start, Station destination) {
        super(start, destination);
        price = price - (int) (price * off);
    }
}

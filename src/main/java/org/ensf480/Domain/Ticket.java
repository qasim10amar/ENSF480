package org.ensf480.Domain;

public class Ticket {
    User user;
    Seat seat;
    String ticketID;
    Boolean isPurchased;

    public Ticket(User user, Seat seat, String ticketID, Boolean isPurchased) {
        this.user = user;
        this.seat = seat;
        this.ticketID = ticketID;
        this.isPurchased = isPurchased;
    }

}

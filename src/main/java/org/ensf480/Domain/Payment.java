package org.ensf480.Domain;

public class Payment {
    Ticket ticket;
    String paymentID;
    Boolean isPaid;
    String cardNumber;

    public Payment(Ticket ticket, String paymentID, Boolean isPaid, String cardNumber) {
        this.ticket = ticket;
        this.paymentID = paymentID;
        this.isPaid = isPaid;
        this.cardNumber = cardNumber;
    }

}

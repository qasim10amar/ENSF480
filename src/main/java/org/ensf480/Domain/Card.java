package org.ensf480.Domain;

public class Card {
    String cardNumber;
    String cardHolder;
    String expiryDate;
    String cvv;

    public Card(String cardNumber, String cardHolder, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
}

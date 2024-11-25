package org.ensf480.Domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class PaymentInfo {
    private final ArrayList<Card> cards;
    private final int MAX_CARDS = 3;

    String paymentInfoID;

    public PaymentInfo(String paymentInfoID) {
        this.paymentInfoID = paymentInfoID;
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (cards.size() < MAX_CARDS) {
            cards.add(card);
        }
    }

    public void removeCard(Card card) {
        cards.remove(card);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

}

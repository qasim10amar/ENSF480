package org.ensf480.Domain;

public class Seat {
    Integer row;
    Integer column;
    Boolean isReserved;

    public Seat(Integer row, Integer column, Boolean isReserved) {
        this.row = row;
        this.column = column;
        this.isReserved = isReserved;
    }
}

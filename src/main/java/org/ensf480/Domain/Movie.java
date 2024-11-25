package org.ensf480.Domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Movie {

    String title;
    ArrayList<LocalDateTime> showTimes;
    Integer theaterNumber;
    String movieID;
    String genre;
    ArrayList<Seat> seats;

    public Movie(String title, ArrayList<LocalDateTime> showTimes, Integer theaterNumber, String movieID, String genre, ArrayList<Seat> seats) {
        this.title = title;
        this.showTimes = showTimes;
        this.theaterNumber = theaterNumber;
        this.movieID = movieID;
        this.genre = genre;
        this.seats = seats;
    }
}

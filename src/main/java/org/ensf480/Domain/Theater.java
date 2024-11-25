package org.ensf480.Domain;

public class Theater {
    Movie[] movies;
    Address address;
    String Name;
    String theaterID;

    public Theater(Movie[] movies, Address address, String Name, String theaterID) {
        this.movies = movies;
        this.address = address;
        this.Name = Name;
        this.theaterID = theaterID;
    }
}

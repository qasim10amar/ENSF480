DROP DATABASE IF EXISTS THEATER480;
CREATE DATABASE THEATER480;
USE THEATER480;

CREATE TABLE IF NOT EXISTS ADDRESS (
                                       addressID INT AUTO_INCREMENT,
                                       street VARCHAR(45) NOT NULL,
                                       city VARCHAR(45) NOT NULL,
                                       province VARCHAR(45) NOT NULL,
                                       postalCode VARCHAR(6) NOT NULL,
                                       country VARCHAR(45) NOT NULL,
                                       PRIMARY KEY (addressID),
                                       UNIQUE (street, city, province, postalCode, country)
);

CREATE TABLE IF NOT EXISTS USER_TABLE (
                                          userID INT AUTO_INCREMENT,
                                          PRIMARY KEY (userID)
);

CREATE TABLE IF NOT EXISTS PAYMENT_INFO (
                                            cardNumber VARCHAR(16) NOT NULL,
                                            cvv VARCHAR(3) NOT NULL,
                                            expiryDate DATE NOT NULL,
                                            firstName VARCHAR(45) NOT NULL,
                                            lastName VARCHAR(45) NOT NULL,
                                            userID INT NOT NULL,
                                            PRIMARY KEY (cardNumber),
                                            FOREIGN KEY (userID) REFERENCES USER_TABLE(userID)
);

CREATE TABLE IF NOT EXISTS THEATER (
                                       addressID INT NOT NULL,
                                       theaterName VARCHAR(45) NOT NULL,
                                       theaterID INT AUTO_INCREMENT,
                                       PRIMARY KEY (theaterID),
                                       FOREIGN KEY (addressID) REFERENCES ADDRESS(addressID)
);

CREATE TABLE IF NOT EXISTS MOVIE (
                                     movieName VARCHAR(45) NOT NULL,
                                     showTime TIME NOT NULL,
                                     theaterNumber INT NOT NULL,
                                     movieID INT AUTO_INCREMENT,
                                     theaterID INT NOT NULL,
                                     PRIMARY KEY (movieID),
                                     FOREIGN KEY (theaterID) REFERENCES THEATER(theaterID)
);

CREATE TABLE IF NOT EXISTS SEAT (
                                    seatRow INT NOT NULL,
                                    seatNumber INT NOT NULL,
                                    seatOccupied BOOLEAN DEFAULT FALSE,
                                    seatID INT AUTO_INCREMENT,
                                    PRIMARY KEY (seatID)
);

CREATE TABLE IF NOT EXISTS TICKET (
                                      userID INT NOT NULL,
                                      seatID INT NOT NULL,
                                      ticketID INT AUTO_INCREMENT,
                                      paymentConfirmation VARCHAR(45) NOT NULL,
                                      PRIMARY KEY (ticketID),
                                      FOREIGN KEY (userID) REFERENCES USER_TABLE(userID),
                                      FOREIGN KEY (seatID) REFERENCES SEAT(seatID)
);

CREATE TABLE IF NOT EXISTS REGISTERED_USER (
                                               userID INT NOT NULL,
                                               firstName VARCHAR(45) NOT NULL,
                                               lastName VARCHAR(45) NOT NULL,
                                               email VARCHAR(45) NOT NULL,
                                               PRIMARY KEY (email)
);

CREATE TABLE IF NOT EXISTS PAYMENT (
                                       ticketID INT NOT NULL,
                                       cardNumber VARCHAR(16) NOT NULL,
                                       paymentID INT AUTO_INCREMENT,
                                       successfulPayment BOOLEAN NOT NULL,
                                       PRIMARY KEY (paymentID),
                                       FOREIGN KEY (ticketID) REFERENCES TICKET(ticketID),
                                       FOREIGN KEY (cardNumber) REFERENCES PAYMENT_INFO(cardNumber)
);
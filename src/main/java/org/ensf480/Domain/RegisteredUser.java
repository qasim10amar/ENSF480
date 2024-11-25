package org.ensf480.Domain;

import java.util.ArrayList;

public class RegisteredUser extends User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private PaymentInfo paymentInfo;

    private Address address;

    public RegisteredUser(String userID, String firstName, String lastName, String email, String password, Address address) {
        super(userID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

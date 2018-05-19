package com.javainuse.model;



public class Address {
    private String city;
    private String street;
    private String zip;
    private String state;

    public Address(){}

    public Address(String city, String street, String zip, String state) {
        this.city = city;
        this.street = street;
        this.zip = zip;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String format="street=%s,  city = %s zip=%s state=%s";

    public String toString(){
        return String.format(format,street,city,zip,state);
    }
}

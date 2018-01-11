package istic.miage.pallamu;

import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;

@Entity(value = "address")
public class Address {
    /**
     *
     */
    @Embedded
    private Customer customer;

    /**
     *
     */
    private String street;

    /**
     *
     */
    private String city;

    /**
     *
     */
    private String postCode;

    /**
     *
     */
    private String country;


    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

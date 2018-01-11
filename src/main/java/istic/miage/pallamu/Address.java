package istic.miage.pallamu;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity(value = "address")
public class Address {
    /**
     *
     */
    @Id
    public ObjectId addressId;

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

    public ObjectId getAddressId() {
        return addressId;
    }

    public void setAddressId(ObjectId addressId) {
        this.addressId = addressId;
    }

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

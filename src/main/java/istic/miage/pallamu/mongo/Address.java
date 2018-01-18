package istic.miage.pallamu.mongo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * {@link Entity} is the same as in JPA
 * Value is the name that will be given to collection
 * By default, the collection name in the mongodb database is the class name
 * {@literal noClassnameStored} is used to tell the database whether not to store the class name
 */
@Entity(value = "address", noClassnameStored = true)
public class Address {
    /**
     * We use {@link ObjectId} Mongodb type that auto generates an document id
     */
    @Id
    public ObjectId addressId;

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

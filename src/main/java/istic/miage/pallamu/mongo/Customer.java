package istic.miage.pallamu.mongo;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.util.List;

/**
 * {@link Entity} is the same as in JPA
 * Value is the name that will be given to collection
 * By default, the collection name in the mongodb database is the class name
 * {@literal noClassnameStored} is used to tell the database whether or not to store the class name
 */
@Entity(value = "customer", noClassnameStored = true)
public class Customer {
    /**
     * We use {@link ObjectId} Mongodb type that auto generates an document id
     */
    @Id
    private ObjectId customerId;
    /**
     * Annotation {@link Embedded} will store customerAddress(es) objects inside the customer document
     */
    @Embedded
    private List<Address> customerAddress;
    /**
     *
     */
    @Embedded
    private List<Article> articles;

    /**
     *
     */
    private String name;

    public List<Address> getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(List<Address> customerAddress) {
        this.customerAddress = customerAddress;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public ObjectId getCustomerId() {
        return customerId;
    }

    public void setCustomerId(ObjectId customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

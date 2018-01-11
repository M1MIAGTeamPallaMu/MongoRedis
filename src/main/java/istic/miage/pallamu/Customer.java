package istic.miage.pallamu;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

@Entity(value = "customer")
public class Customer {
    /**
     *
     */
    @Reference
    private List<Address> customerAddress;
    /**
     *
     */
    private List<Article> articles;
    /**
     *
     */
    @Id
    private ObjectId customerId;
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

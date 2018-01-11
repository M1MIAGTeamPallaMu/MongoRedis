package istic.miage.pallamu;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

@Entity(value = "items")
public class Article {
    /**
     *
     */
    @Reference
    private List<Customer> customers;
    /**
     *
     */
    @Id
    private ObjectId itemId;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private int stars;

    public ObjectId getItemId() {
        return itemId;
    }

    public void setItemId(ObjectId itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}

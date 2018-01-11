package istic.miage.pallamu;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.List;

/**
 * {@link Entity} is the same as in JPA
 * Value is the name that will be given to collection
 * By default, the collection name in the mongodb database is the class name
 * {@literal noClassnameStored} is used to tell the database whether not to store the class name
 */
@Entity(value = "items", noClassnameStored = true)
public class Article {
    /**
     * Annotation {@link Reference} will create an DBRef of each customer when an {@link Article} is stored
     * The customer is the person who bought the article
     */
    @Reference
    private List<Customer> customers;
    /**
     * We use {@link ObjectId} Mongodb type that auto generates an document id
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

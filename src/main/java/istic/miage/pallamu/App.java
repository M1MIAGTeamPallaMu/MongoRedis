package istic.miage.pallamu;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * Mongo App
 *
 */
public class App 
{
    public static void main( String[] args ) throws UnknownHostException
    {
        Morphia morphiaObject = new Morphia();
        MongoClient mongoClient = new MongoClient();
        morphiaObject.map(Customer.class).map(Address.class);
        Datastore datastore = morphiaObject.createDatastore(mongoClient,"mongoLab");
        Customer joshua = new Customer();
        joshua.setName("Joshua");

        Address address = new Address();
        address.setStreet( "592 Evans Street" );
        address.setCity( "Madrid, Puerto Rico" );
        address.setPostCode( "9094" );
        address.setCountry( "Spain" );
        joshua.setCustomerAddress(Arrays.asList(address));
        datastore.delete(joshua);
        for (Customer e : datastore.find(Customer. class ))
            System.out.println(e);
    }
}

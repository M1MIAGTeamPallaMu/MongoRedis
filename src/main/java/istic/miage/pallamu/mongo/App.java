package istic.miage.pallamu.mongo;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import java.net.UnknownHostException;

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
        morphiaObject.map(Customer.class).map(Address.class).map(Article.class);
        Datastore datastore = morphiaObject.createDatastore(mongoClient,"mongoLab");

        /*
         * Creating our Customers objects
         */
        Customer joshua = new Customer();
        Customer helen = new Customer();
        Customer marc = new Customer();
        joshua.setName("Joshua Marshall");
        helen.setName("Helen Fernandez");
        marc.setName("Marc Bose");

        /*
         * Creating Customer's Addresses
         */
        Address address = new Address();
        address.setStreet( "592 Evans Street" );
        address.setCity( "Madrid, Puerto Rico" );
        address.setPostCode( "9094" );
        address.setCountry( "Spain" );

        Address address1 = new Address();
        address1.setStreet( "728 Perry Place" );
        address1.setCity( "Draper,Delaware " );
        address1.setPostCode( "2895" );
        address1.setCountry( "USA" );

        Address address0 = new Address();
        address0.setStreet( "244 Church Lane" );
        address0.setCity( "Madaket" );
        address0.setPostCode( "2088" );
        address0.setCountry( "Palau" );

        Address address2 = new Address();
        address2.setStreet( "981 McKibbin Street" );
        address2.setCity( "Russellville, Louisiana" );
        address2.setPostCode( "9782" );
        address2.setCountry( "USA" );

        Address address3 = new Address();
        address3.setStreet( "893 Ryder Street" );
        address3.setCity( "Kohatk, New Jersey" );
        address3.setPostCode( "3291" );
        address3.setCountry( "USA" );

        Address address4 = new Address();
        address4.setStreet( "491 Crawford Avenue" );
        address4.setCity( "Newry" );
        address4.setPostCode( "5777" );
        address4.setCountry( "Puerto Rico" );
        address.setCustomer(joshua);
        address0.setCustomer(joshua);
        address1.setCustomer(helen);
        address2.setCustomer(helen);
        address3.setCustomer(marc);
        address4.setCustomer(marc);

        datastore.save(address);
        datastore.save(address0);
        datastore.save(address1);
        datastore.save(address2);
        datastore.save(address3);
        datastore.save(address4);

        /*
         * Creating articles
         */
        Article article = new Article();
        Article article1 = new Article();
        Article article2 = new Article();
        Article article3 = new Article();

        /*
         * Assigning them customers who bought these articles
        */
        System.out.println(article.getCustomers());
        //article1.setCustomers(Arrays.asList(helen, joshua));
        //article3.setCustomers(Arrays.asList(marc, helen));

        /*
         * Assigning addresses to customers
        */
        //TODO find a way to add adresses
        /*List<Address> l = new ArrayList<Address>();
        l.add(address0);
        helen.setCustomerAddress(l);*/
       //helen.setCustomerAddress(Arrays.asList(address2, address0));
       //marc.setCustomerAddress(Arrays.asList(address3, address1));

        /*datastore.save(joshua);
        datastore.save(helen);
        datastore.save(marc);
        datastore.save(article);
        datastore.save(article1);
        datastore.save(article2);
        datastore.save(article3);*/

        for (Article e : datastore.find(Article.class))
            System.err.println(e.getCustomers().toString());

    }


}

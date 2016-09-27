package sample.data.jpa.concrete;

import sample.data.jpa.domain.City;
import sample.data.jpa.domain.Hotel;

import javax.persistence.EntityManager;

/**
 * Created by admin on 27.09.2016.
 */
public class CityHotelService {

    public void initialize(EntityManager em) {

        em.getTransaction().begin();
        City c1 = new City(1 ,"city1", "defaultCountry", "map1" , "main", 123456l);
        City c2 = new City(2, "city2", "defaultCountry", "map2" , "main", 123456l);
        City c3 = new City(3, "city3", "defaultCountry", "map3" , "main", 123456l);

        Hotel h1 = new Hotel(1, "hotel1", "address1", c1);
        Hotel h2 = new Hotel(2, "hotel2", "address1", c1);
        Hotel h3 = new Hotel(3, "hotel3", "address1", c2);

        c1.addHotel(h1);
        c1.addHotel(h2);
        c2.addHotel(h3);

        em.persist(h1);
        em.persist(h2);
        em.persist(h3);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);

        em.getTransaction().commit();
    }
}

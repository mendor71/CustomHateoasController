package sample.data.jpa.persistence.mysql;

import javax.persistence.EntityManager;

/**
 * Created by admin on 27.09.2016.
 */
public class ActorService {

    public EntityManager em;

    public ActorService(EntityManager em) {
        this.em = em;
    }

    public Actor createActor(int i, String firstName, String lastName, String lastUpdate) {
        Actor a = new Actor();
        a.setActorId(i);
        a.setFirstName(firstName);
        a.setLastName(lastName);
        a.setLastUpdate(lastUpdate);
        em.persist(a);
        return a;
    }

}

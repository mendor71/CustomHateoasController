package sample.data.jpa.service.attrsecure;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by admin on 28.09.2016.
 */

@RepositoryRestResource(collectionResourceRel = "custom", path = "customs")
public class AttractionsRepositoryImpl implements AttractionsRepositoryCustom, InitializingBean {
    @PersistenceContext
    EntityManager em;

    @Override
    public String customMethod(String descr) {
        return "CUSTOM";
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}

package sample.data.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.data.rest.webmvc.RepositorySearchesResource;
import org.springframework.hateoas.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sample.data.jpa.domain.Attractions;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@BasePathAwareController
@RequestMapping(value = "/attractions/search")
public class AttractionsController implements ResourceProcessor<RepositorySearchesResource>, ResourceAssembler<Object, Resource<Object>> {

//    @Autowired
//    private AttractionsRepository repository;

    @PersistenceContext
    private EntityManager em;

    @Autowired
    private EntityLinks entityLinks;

    /*@RequestMapping(value = "/find", method = RequestMethod.GET)
    public ResponseEntity<Resource<Attractions>> find(@RequestParam("id") long id) {
        Resource<Attractions> resource = toResource(em.find(Attractions.class, id));
        return new ResponseEntity<Resource<Attractions>>(resource, HttpStatus.OK);
    }*/

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public ResponseEntity<Resource<Object>> query(@RequestParam("queryString") String queryString) {
        if (queryString.toLowerCase().startsWith("select")) {
            try {
                Resource<Object> tList = toResource(em.createQuery(queryString).getResultList());
                return new ResponseEntity<Resource<Object>>(tList, HttpStatus.OK);
            /*} catch (QuerySyntaxException e) {
                return new ResponseEntity<Resource<Object>>(toResource("QUERY SYNTAX ERROR DETECTED IN STRING: " + queryString), HttpStatus.OK);*/
            } catch (IllegalArgumentException e) {
                return new ResponseEntity<Resource<Object>>(toResource("QUERY SYNTAX ERROR DETECTED IN STRING: " + queryString), HttpStatus.NOT_FOUND);
            }
        } else {
            return new ResponseEntity<Resource<Object>>(toResource("SQL STRING IS NOT VALID"), HttpStatus.OK);
        }
    }

    @Override
    public RepositorySearchesResource process(RepositorySearchesResource resource) {

        LinkBuilder lb = entityLinks.linkFor(Attractions.class, "id");
        resource.add(new Link(lb.toString() + "/search/query{?queryString}", "query"));
        return resource;
    }

    @Override
    public Resource<Object> toResource(Object o) {
        Resource<Object> resource = new Resource<Object>(o.toString());
        return resource;
    }

    /*@Override
    public Resource<Attractions> toResource(Attractions attractions) {
        Resource<Attractions> resource = new Resource<Attractions>(attractions);

        return resource;
    }*/
}

package sample.data.jpa.service.attrsecure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sample.data.jpa.service.AttractionsRepository;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


/**
 * Created by admin on 28.09.2016.
 */

@RepositoryRestController
public class AttractionsController {

        private final AttractionsRepository repository;
        @Autowired
        public AttractionsController(AttractionsRepository repo) { // <1>
            repository = repo;
        }

        @RequestMapping(method = GET, value = "/attractions/custom/testMethod") // <2>

        public @ResponseBody
        String getAttraction() {
            return "WORKED";

            /*Attractions attr = repository.findByDescription(""); // <3>
            return attr; // or some filtered/altered/mapped version*/
        }
}

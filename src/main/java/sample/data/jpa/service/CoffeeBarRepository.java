package sample.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sample.data.jpa.domain.CoffeeBar;

/**
 * Created by admin on 26.09.2016.
 */

@RepositoryRestResource(collectionResourceRel = "coffeebar", path = "coffeebars")
public interface CoffeeBarRepository extends PagingAndSortingRepository<CoffeeBar, Long> {
    public CoffeeBar findByName(@Param("name") String name);
}

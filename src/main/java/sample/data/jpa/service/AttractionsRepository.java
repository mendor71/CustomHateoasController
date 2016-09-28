package sample.data.jpa.service;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sample.data.jpa.domain.Attractions;

@RepositoryRestResource(collectionResourceRel = "attraction", path = "attractions")
public interface AttractionsRepository extends PagingAndSortingRepository<Attractions, Long> {

	// find attraction by its description
	public Attractions findByDescription(@Param("description") String description);



}
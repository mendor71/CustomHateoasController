package sample.data.jpa.service;

//import org.springframework.data.repository.Repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sample.data.jpa.domain.Cats;

@RepositoryRestResource(collectionResourceRel = "cats", path = "cats")

public interface CatsRepository extends PagingAndSortingRepository<Cats, Long> {

    // find cat by its name
    public Cats findByName(@Param("catName") String catName);
}

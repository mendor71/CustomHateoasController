package sample.data.jpa.service;

//import org.springframework.data.repository.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import sample.data.jpa.domain.Dogs;


public interface DogsRepository extends MongoRepository<Dogs, String> {

    // find dogs by its breed
    public Dogs findByBreed(@Param("breed") String breed);

    // find dogs by its name
    @Query("{ 'name' : ?0 }")
    public Dogs findByName(@Param("name") String name);
}

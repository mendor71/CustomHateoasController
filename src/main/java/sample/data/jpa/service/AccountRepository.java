package sample.data.jpa.service;

//import org.springframework.data.repository.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import sample.data.jpa.domain.Account;

public interface AccountRepository extends MongoRepository<Account, Long> {

    // find account by his username
    public Account findByUsername(@Param("userName") String userName);

}

package sample.data.jpa.service;

import org.springframework.data.repository.CrudRepository;
import sample.data.jpa.domain.Role;

/**
 * Created by admin on 27.09.2016.
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

    Role findByName(String name);
}

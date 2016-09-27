package sample.data.jpa.concrete;

import sample.data.jpa.domain.User;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by admin on 27.09.2016.
 */
public class UserService {
    EntityManager em;

    public UserService(EntityManager em) {
        this.em = em;
    }

    public void printUsersListByRole(String roleName) {
        List<User> userList = em.createNamedQuery("User.findByRole", User.class).setParameter("role", roleName).getResultList();

        for (User u: userList) {
            System.out.println(u.toString());
        }
    }

    public void printUsersListByLogin(String userLogin) {
        List<User> userList = em.createNamedQuery("User.findByLogin", User.class).setParameter("login", userLogin).getResultList();

        for (User u: userList) {
            System.out.println(u.toString());
        }
    }

    public void baseInitializer() {
        if (isEmpty()) {
            em.getTransaction().begin();
            em.createNativeQuery("insert into user (id, name, login, password) values (1, 'Roy', 'roy', 'spring')").executeUpdate();
            em.createNativeQuery("insert into user (id, name, login, password) values (2, 'Craig', 'craig', 'spring')").executeUpdate();
            em.createNativeQuery("insert into user (id, name, login, password) values (3, 'Gregoy', 'gregoy', 'spring')").executeUpdate();
            em.createNativeQuery("insert into role (id, name) values (1, 'ROLE_USER')").executeUpdate();
            em.createNativeQuery("insert into role (id, name) values (2, 'ROLE_ADMIN')").executeUpdate();
            em.createNativeQuery("insert into role (id, name) values (3, 'ROLE_GUEST')").executeUpdate();
            em.createNativeQuery("insert into user_role (user_id, role_id) values (1, 1)").executeUpdate();
            em.createNativeQuery("insert into user_role (user_id, role_id) values (1, 2)").executeUpdate();
            em.createNativeQuery("insert into user_role (user_id, role_id) values (2, 1)").executeUpdate();
            em.createNativeQuery("insert into user_role (user_id, role_id) values (3, 1)").executeUpdate();
            em.getTransaction().commit();
        }
    }

    private boolean isEmpty() {
        List<User> uList = em.createQuery("Select u from User u", User.class).getResultList();
        return uList.size() == 0;
    }
}

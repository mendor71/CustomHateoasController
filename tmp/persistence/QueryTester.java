package sample.data.jpa.persistence;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import sample.data.jpa.concrete.CityHotelService;
import sample.data.jpa.domain.City;
import sample.data.jpa.domain.Hotel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;


public class QueryTester {

    public static void main(String[] args) throws Exception {
        String unitName = args[0];

        EntityManagerFactory emf = Persistence.createEntityManagerFactory(unitName);
        EntityManager em = emf.createEntityManager();

        CityHotelService init = new CityHotelService();
        init.initialize(em);

        List<City> list = em.createQuery("Select c from City c", City.class).getResultList();

        for (City c: list) {
            System.out.println(c.getName() + ": ");
            int i = 0;
            for (Hotel h: c.getHotels()) {
                System.out.println(++i + " " + h.getName());
            }
        }

        em.close();
        emf.close();


        /*UserService uSrv = new UserService(em);

        uSrv.baseInitializer();

        uSrv.printUsersListByRole("ROLE_USER");
        uSrv.printUsersListByLogin("craig");*/

        /*List<User> userListByRole = em.createNamedQuery("User.findByRole", User.class).setParameter("role", "ROLE_USER").getResultList();

        System.out.println("BY ROLE:");
        for (User u: userListByRole) {
            System.out.println(u.toString());
        }

        List userListByLogin = em.createNamedQuery("User.findByLogin").setParameter("login", "craig").getResultList();

        System.out.println("BY LOGIN:");
        for (Object o: userListByLogin) {
            System.out.println(o.toString());
        }*/

        /*BufferedReader reader =
          new BufferedReader(new InputStreamReader(System.in));*/
        /*em.getTransaction().begin();
        Attractions attractions = new Attractions(2, "2_test_attraction", "2 the best attraction");
        em.persist(attractions);
        em.getTransaction().commit();

        TypedQuery<Attractions> tQ = em.createQuery("Select a from Attractions a" , Attractions.class);
        List<Attractions> attList = tQ.getResultList();

        for (Attractions a: attList) {
            System.out.println(a);
        }
        em.close();
        emf.close();*/

        /*
        EmployeeService eService = new EmployeeService(em);

        em.getTransaction().begin();
        Employee empl = eService.createEmployee(1, "name1", 1000);
        em.getTransaction().commit();
        int id = empl.getId();
        System.out.println("created " + id);

        em.getTransaction().begin();
        eService.raiseSalary(id, 2000);
        em.getTransaction().commit();

        long salary = empl.getSalary();
        System.out.println("raised for " + salary);*/

        /*for (; ; ) {
            System.out.print("JP QL> ");
            String query = reader.readLine();
            if (query.equals("quit")) {
                break;
            }
            if (query.length() == 0) {
                continue;
            }

            try {
                List result = em.createQuery(query).getResultList();
                if (result.size() > 0) {
                    int count = 0;
                    for (Object o : result) {
                        System.out.print(++count + " ");
                        printResult(o);
                    }
                } else {
                    System.out.println("0 results returned");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }

    private static void printResult(Object result) throws Exception {
        if (result == null) {
            System.out.print("NULL");
        } else if (result instanceof Object[]) {
            Object[] row = (Object[]) result;
            System.out.print("[");
            for (int i = 0; i < row.length; i++) {
                printResult(row[i]);
            }
            System.out.print("]");
        } else if (result instanceof Long ||
                result instanceof Double ||
                result instanceof String) {
            System.out.print(result.getClass().getName() + ": " + result);
        } else {
            System.out.print(ReflectionToStringBuilder.toString(result,
                    ToStringStyle.SHORT_PREFIX_STYLE));
        }
        System.out.println();
    }
}

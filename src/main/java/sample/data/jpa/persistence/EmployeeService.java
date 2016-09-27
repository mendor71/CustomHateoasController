package sample.data.jpa.persistence;

import org.dom4j.dom.DOMNodeHelper;
import sample.data.jpa.persistence.Employee;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by admin on 26.09.2016.
 */
public class EmployeeService {

    protected EntityManager em;

    public EmployeeService(EntityManager em) {
        this.em = em;
    }

    public Employee createEmployee(int id, String name, long salary) {
        Employee e = new Employee(id, name, salary);
        em.persist(e);
        return e;
    }

    public Employee findEmployee(int id) {
        Employee e = em.find(Employee.class, id);
        if (e!= null) {
            return e;
        } else {
            throw new NullPointerException("not found by id: " + id);
        }

    }

    public void removeEmployee(int id) {
        Employee e = findEmployee(id);
        em.remove(e);
    }

    public Employee raiseSalary(int id, long bonus) {
        Employee e = findEmployee(id);
        e.setSalary(e.getSalary() + bonus);
        return e;
    }

    public List<Employee> findAllEmployees() {
        TypedQuery<Employee> empList = em.createQuery("select e from Employee e", Employee.class);
        return empList.getResultList();
    }
}

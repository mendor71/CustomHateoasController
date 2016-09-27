package sample.data.jpa.persistence;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by admin on 26.09.2016.
 */

@Entity
public class Employee {
    @Id
    private int id;

    public String name;

    public long salary;

    protected Employee() {}

    public Employee(int id, String name, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public long getSalary() { return salary; }

    public void setSalary (long salary) { this.salary = salary; }
}

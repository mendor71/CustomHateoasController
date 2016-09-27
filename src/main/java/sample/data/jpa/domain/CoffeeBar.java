package sample.data.jpa.domain;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.io.Serializable;

/**
 * Created by admin on 26.09.2016.
 */

@Entity
public class CoffeeBar implements Serializable{

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String address;

    @Column
    public String description;

    protected CoffeeBar() { }

    public CoffeeBar(String name, String address, String descr)  {
        super();
        this.name = name;
        this.address = address;
        this.description = descr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "sample.data.jpa.domain.CoffeeBar(name=" + this.name + ", address=" + this.getAddress() + ", description=" + this.getDescription() + ")";
    }
}

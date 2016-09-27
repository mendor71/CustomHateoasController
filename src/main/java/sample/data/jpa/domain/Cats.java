package sample.data.jpa.domain;

/**
 * Created by Student on 25.04.2016.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

//construct cats @Entity
@Entity
public class Cats implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    public Long id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String breed;

    protected Cats() {
    }

    private Cats(String name, String breed) {
        super();
        this.name  = name;
        this.breed = breed;
    }

    public String toString() {
        return "sample.data.jpa.domain.Cats(name=" + this.name + ", breed=" + this.breed  + ")";
    }

    //setters cats's fields
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //getters caTS's fields
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }
}

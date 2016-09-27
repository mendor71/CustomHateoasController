package sample.data.jpa.domain;

/**
 * Created by Student on 25.04.2016.
 */

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//construct dogs entity (not @Entity)
public class Dogs {

    @Id
    @GeneratedValue
    private String id;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String breed;

    public Dogs() {
    }

    public Dogs(String name, String breed) {
        this.name  = name;
        this.breed = breed;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "sample.data.jpa.domain.Dogs(name=" + this.name + ", breed=" + this.breed  + ")";
    }

    //setters dogs's fields
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //getters dogs's fields
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }
}

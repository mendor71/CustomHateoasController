package sample.data.jpa.persistence.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 27.09.2016.
 */

@Entity
public class Actor implements Serializable {

    @Id
    public int actorId;

    public String firstName;

    public String lastName;

    public String lastUpdate;

    public int getActorId() {
        return actorId;
    }

    public void setActorId(int actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String toString() {
        return "actor_id=" + this.getActorId() + ", first_name=" + this.getFirstName() + ", last_name=" + this.getLastName() + ", last_update=" + this.getLastUpdate();
    }
}

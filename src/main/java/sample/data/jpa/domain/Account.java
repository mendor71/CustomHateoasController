package sample.data.jpa.domain;
//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Entity;


//construct account entity (not @Entity)
public class Account {

    @Id
    @GeneratedValue
    private String id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private Boolean enabled;
    @Column(nullable = false)
    private Boolean accountNonExpired;
    @Column(nullable = false)
    private Boolean credentialsNonExpired;
    @Column(nullable = false)
    private Boolean accountNonLocked;

    public Account(){}

    public Account(String  username,
                   String  password,
                   String  role,
                   Boolean enabled,
                   Boolean accountNonExpired,
                   Boolean credentialsNonExpired,
                   Boolean accountNonLocked) {
        this.username = username;
        this.password = password;
        this.role     = role;
        this.enabled  = enabled;
        this.accountNonExpired     = accountNonExpired;
        this.credentialsNonExpired = credentialsNonExpired;
        this.accountNonLocked      = accountNonLocked;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "sample.data.jpa.domain.Account(username=" + this.username + ", password=" + this.password + ", role=" + this.role + ")";
    }

    //getters account's fields
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRole() {
        return this.role;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getAccountNonExpired() {
        return this.accountNonExpired;
    }

    public Boolean getCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    public Boolean getAccountNonLocked() {
        return this.accountNonLocked;
    }

    //setters account's fields
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setAccountNonExpired(Boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public void setCredentialsNonExpired(Boolean credentialsNonExpired) {this.credentialsNonExpired = credentialsNonExpired;}

    public void setAccountNonLocked(Boolean accountNonLocked) {
        this.accountNonLocked = accountNonLocked;
    }
}
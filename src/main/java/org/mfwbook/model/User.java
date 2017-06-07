package org.mfwbook.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {
    
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String password;

    @JsonIgnore
    @OneToMany/*(mappedBy="user")*//*(mappedBy="users")*/
    private Set<Book> listBooks = new HashSet<Book>();

    public User() {
        super();
    }

    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

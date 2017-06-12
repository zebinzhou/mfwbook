package org.mfwbook.n;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="nuser")
public class NUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    

    @ManyToOne
    @JoinColumn(name = "did")
    @JsonBackReference
    private NDepartment nDepartment;

    @ManyToMany
    @JoinTable(name = "nuser_nrole", joinColumns = { @JoinColumn(name = "nuser_id") }, inverseJoinColumns = {
            @JoinColumn(name = "nroles_id") })
    private List<NRole> nRoles;

    public NUser() {
        super();
    }

    public NUser(String name, String password) {
        super();
        this.name = name;
        this.password = password;
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

    public List<NRole> getRoles() {
        return nRoles;
    }

    public void setRoles(List<NRole> nRoles) {
        this.nRoles = nRoles;
    }

    public NDepartment getDepartment() {
        return nDepartment;
    }

    public void setDepartment(NDepartment nDepartment) {
        this.nDepartment = nDepartment;
    }

}

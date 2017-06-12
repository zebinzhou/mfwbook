package org.mfwbook.n;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="nuser")
public class NUser {
    private String name;
    private String password;
    private List<NRole> nRoles;
    private NDepartment nDepartment;

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

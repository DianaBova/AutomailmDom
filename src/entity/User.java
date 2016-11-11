/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Diana
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String telefon;

    public User() {
    }

    public User(String firstname, String lastname, String email, String password, String telefon) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.telefon = telefon;
    }
    
    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "User{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password=" + password + ", telefon=" + telefon + '}';
    }
    
    
}

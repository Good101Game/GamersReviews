package com.example.GameReviews.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String  email;
    private String password;

    public users() {

    }

    public users(Long id, String Name, String email, String password) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setFirstName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

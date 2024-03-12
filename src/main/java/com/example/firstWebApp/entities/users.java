package com.example.firstWebApp.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class users implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String  email;

    public users() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public users(Long id, String firstName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;

    }
}

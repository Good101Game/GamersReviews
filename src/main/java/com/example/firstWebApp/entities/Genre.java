package com.example.firstWebApp.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Genre")
public class Genre implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    @Transient
    private Games[] games;

    public Genre() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Games[] getGames() {
        return games;
    }

    public void setGames(Games[] games) {
        this.games = games;
    }

    public Genre(String name, Games[] games) {
        this.name = name;
        this.games = games;
    }
}

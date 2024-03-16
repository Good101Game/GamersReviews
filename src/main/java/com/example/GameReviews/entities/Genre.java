package com.example.GameReviews.entities;

import jakarta.persistence.*;

import java.io.Serializable;
@Entity
@Table(name = "Genre")
public class Genre implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String name;
    @Transient
    private Games[] games;

    public Genre() {

    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
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

    public Genre(long id, String name, Games[] games) {
        Id = id;
        this.name = name;
        this.games = games;
    }
}

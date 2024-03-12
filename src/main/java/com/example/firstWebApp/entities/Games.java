package com.example.firstWebApp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Games")
public class Games implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Gid;
    private String Gname;
    private String realese_date;
    private String imageUrl;
    @Transient
    private Review[] reviews;
    @Transient
    private Genre[] genres;

    public Games() {

    }

    public Long getGid() {
        return Gid;
    }

    public String getGname() {
        return Gname;
    }

    public String getRealese_date() {
        return realese_date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Review[] getReviews() {
        return reviews;
    }

    public Genre[] getGenres() {
        return genres;
    }

    public void setGid(Long gid) {
        Gid = gid;
    }

    public void setGname(String gname) {
        Gname = gname;
    }

    public void setRealese_date(String realese_date) {
        this.realese_date = realese_date;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setReviews(Review[] reviews) {
        this.reviews = reviews;
    }

    public void setGenres(Genre[] genres) {
        this.genres = genres;
    }

    public Games(Long gid, String gname, String realese_date, String imageUrl, Review[] reviews, Genre[] genres) {
        Gid = gid;
        Gname = gname;
        this.realese_date = realese_date;
        this.imageUrl = imageUrl;
        this.reviews = reviews;
        this.genres = genres;
    }
}

package com.example.GameReviews.entities;

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
    private double stars;

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

    public double getStars() {
        return stars;
    }

    public Games(Long gid, String gname, String realese_date, String imageUrl, Review[] reviews, Genre[] genres, double stars) {
        Gid = gid;
        Gname = gname;
        this.realese_date = realese_date;
        this.imageUrl = imageUrl;
        this.reviews = reviews;
        this.genres = genres;
        this.stars = stars;
    }
    private void setStars()
    {
        double stars = 0;
        for(int i = 0; i < reviews.length; i++)
        {
            stars += reviews[i].getStars();
        }
        this.stars = (stars/ reviews.length);
    }
}

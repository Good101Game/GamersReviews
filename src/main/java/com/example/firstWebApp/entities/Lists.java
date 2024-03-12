package com.example.firstWebApp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Lists")
public class Lists implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Transient
    private Games[] playing;
    @Transient
    private Games[] completed;
    @Transient
    private Games[] on_hold;
    @Transient
    private Games[] dropped;
    @Transient
    private Games[] want_to_play;

    public Lists(){

    }

    public Games[] getPlaying() {
        return playing;
    }

    public void setPlaying(Games[] playing) {
        this.playing = playing;
    }

    public Games[] getCompleted() {
        return completed;
    }

    public void setCompleted(Games[] completed) {
        this.completed = completed;
    }

    public Games[] getOn_hold() {
        return on_hold;
    }

    public void setOn_hold(Games[] on_hold) {
        this.on_hold = on_hold;
    }

    public Games[] getDropped() {
        return dropped;
    }

    public void setDropped(Games[] dropped) {
        this.dropped = dropped;
    }

    public Games[] getWant_to_play() {
        return want_to_play;
    }

    public void setWant_to_play(Games[] want_to_play) {
        this.want_to_play = want_to_play;
    }

    public Lists(Games[] playing, Games[] completed, Games[] on_hold, Games[] dropped, Games[] want_to_play) {
        this.playing = playing;
        this.completed = completed;
        this.on_hold = on_hold;
        this.dropped = dropped;
        this.want_to_play = want_to_play;
    }
}

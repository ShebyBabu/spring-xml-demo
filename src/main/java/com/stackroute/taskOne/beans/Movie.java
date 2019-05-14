package com.stackroute.taskOne.beans;

public class Movie {
    String movieName;
    String genreName;
    Actor actor;

    public Movie() {
    }

    public Movie(String movieName, String genreName, Actor actor) {
        this.movieName = movieName;
        this.genreName = genreName;
        this.actor = actor;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", genreName='" + genreName + '\'' +
                ", actor=" + actor +
                '}';
    }
}

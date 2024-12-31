package com.comparable;

// Comparable: It is used to define the natural ordering of the objects within the class.

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie> {

    private String movieName;
    private double rating;
    private int year;

    public Movie() {
    }

    public Movie(String movieName, double rating, int year) {
        this.movieName = movieName;
        this.rating = rating;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Movie o) {
        // Sort movies in ascending order of year
        return this.year - o.year;

        // Sort movies in descending order of year
        // return m.y - this.y;
    }
}

public class ComparableDemo {

    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies sorting by years : ");
        for (Movie m: list){
            System.out.println(m);
        }
    }
}

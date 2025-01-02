package com.comparable;

import java.util.ArrayList;
import java.util.Comparator;

// Comparator: It is used to define custom sorting logic externally.
class Films {

    private String filmName;
    private double rating;
    private int year;

    public Films() {
    }

    public Films(String movieName, double rating, int year) {
        this.filmName = movieName;
        this.rating = rating;
        this.year = year;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String movieName) {
        this.filmName = movieName;
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
                "filmName='" + filmName + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';
    }
}

class Rating implements Comparator<Films> {

    @Override
    public int compare(Films o1, Films o2) {
//        // Sort by rating in descending order
//        return Double.compare(o2.getRating(), o1.getRating());

        // Sort by rating in ascending order
        return Double.compare(o1.getRating(), o2.getRating());
    }
}

class FilmName implements Comparator<Films> {

    @Override
    public int compare(Films o1, Films o2) {
        // Sort by name in alphabetical order
        return o1.getFilmName().compareTo(o2.getFilmName());
    }
}

public class ComparatorDemo {

    public static void main(String[] args) {

        ArrayList<Films> films = new ArrayList<>();
        films.add(new Films("Force Awakens", 8.3, 2015));
        films.add(new Films("Star Wars", 8.7, 1977));
        films.add(new Films("Empire Strikes Back", 8.8, 1980));

        films.sort(new Rating());
        System.out.println("Films sorted by rating:");
        for (Films f1 : films) {
            System.out.println(f1);
        }

        System.out.println();

        films.sort(new FilmName());
        System.out.println("Films sorted by filmname:");
        for (Films f2 : films) {
            System.out.println(f2);
        }
    }
}

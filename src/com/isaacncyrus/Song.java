package com.isaacncyrus;

/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private Double price;
    private Boolean favorite;
    private double totalCost;
    private int numSongs;
    private int totalRatings;
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
        
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        numSongs = numSongs + 1;
    }
    public int getNumSongs() {
        return numSongs;
    }
    // title
    public void setTitle(String title2) {
        title = title2;
    }
    public String getTitle() {
        return title;
    }
    // rating
    public void setRating(int rating2) {
        rating = rating2;
    }
    public int getRating() {
        return rating;
    }
    public void setPrice(Double price2)
    {
        price = price2;
    }
    public Double getPrice()
    {
        return price;
    }
    public void addToFavorites() {
        favorite = true;
    }
    
}
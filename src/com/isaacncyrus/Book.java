package com.isaacncyrus;

/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int Stars;
    private String Title;
    public Book()
    {
        // initialise instance variables
        Stars = 0;
        Title = "";
    }
    //title
    public void setTitle(String title2) {
        Title = title2;
    }
    public String getTitle() {
        return Title;
    }
    //stars
    public void setStars(int Stars2) {
        Stars = Stars2;
    }
    public int getStars() {
        return Stars;
    }
}

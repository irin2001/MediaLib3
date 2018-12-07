package com.isaacncyrus;

public class MediaLib {

    public static void main(String[] args) {




        //media
        System.out.println("Welcome to your media library ajh");
        System.out.println("");
        System.out.println("SONGS");
        System.out.println("");

        //song 1
        Song song1 = new Song("Darude sandstorm",2.0,10);
        System.out.println(song1.getTitle());
        System.out.println(song1.getPrice());
        System.out.println(song1.getRating());
        System.out.println("");

        //song 2
        Song song2 = new Song("GAng baeep",2.1,1);
        System.out.println(song2.getTitle());
        System.out.println(song2.getPrice());
        System.out.println(song2.getRating());
        System.out.println("");

        //song 3
        Song song3 = new Song("i was born in the 90s so im better",0.99,23);
        System.out.println(song3.getTitle());
        System.out.println(song3.getPrice());
        System.out.println(song3.getRating());
        System.out.println("");

        //song avgs
        System.out.println("# of songs");
        System.out.println(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs());
        System.out.println("total cost of songs");
        System.out.println(song3.getPrice() + song2.getPrice() + song1.getPrice());
        System.out.println("price avg");
        System.out.println((song3.getPrice() + song2.getPrice() + song1.getPrice())/(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs()));
        System.out.println("avg rating");
        System.out.println((song3.getRating() + song2.getRating() + song1.getRating())/(song3.getNumSongs() + song1.getNumSongs() + song2.getNumSongs()));
        System.out.println("");

        //movie original
        System.out.println("MOVIES");
        System.out.println("");

        Movie movie1 = new Movie();
        movie1.setName("the");
        System.out.println(movie1.getName());
        movie1.setRottenTomatos(17);
        System.out.println(movie1.getRottenTomatos());
        movie1.setDuration(250);
        System.out.println(movie1.getDuration());
        System.out.println("");

        //book original
        Book book1 = new Book();
        book1.setTitle("the book");
        System.out.println(book1.getTitle());
        book1.setStars(34);
        System.out.println(book1.getStars());

        //Retrieving Song String
        MediaFile.writeString(song1.getTitle() + " | " + song1.getRating());
        MediaFile.writeString(song2.getTitle() + " | " + song2.getRating());
        MediaFile.writeString(song3.getTitle() + " | " + song3.getRating());
        MediaFile.saveAndClose();
    }
}

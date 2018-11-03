package com.compareblecomparatorExm;

import java.util.ArrayList;
import java.util.Collections;

//A class 'Movie1' that implements Comparable
class Movie1 implements Comparable<Movie1>
{
 
 private String name;
 private int year;

 // Used to sort Movie1s by year
 public int compareTo(Movie1 m)
 {
     return this.year - m.year;
 }

 // Constructor
 public Movie1(String nm, int yr)
 {
     this.name = nm;
     this.year = yr;
 }

 // Getter methods for accessing private data
 
 public String getName()   {  return name; }
 public int getYear()      {  return year;  }
}

//Driver class
class ComparableTest
{
 public static void main(String[] args)
 {
     ArrayList<Movie1> list = new ArrayList<Movie1>();
     list.add(new Movie1("Force", 2015));
     list.add(new Movie1("Star", 1977));
     list.add(new Movie1("Empire", 1980));
     list.add(new Movie1("Return", 1983));

     Collections.sort(list);

     System.out.println("Movie1s after sorting : ");
     for (Movie1 Movie2: list)
     {
         System.out.println(Movie2.getName() + " " +
                            Movie2.getYear());
     }
 }
}
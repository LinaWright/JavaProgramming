package day15_switch;

import java.util.Scanner;

public class Homework4WriteABook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what kind of book that you are interested in writing to find out more information: ");
        String genre = input.nextLine();
        int pageLength=0; int profit=0; int sequels=0; int countries=0;
        switch(genre){
            case "Fantasy":
            pageLength = 500;
            profit = 1_000_000;
            sequels = 5;
            countries = 50;
            break;
            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;
            case "Science Fiction":
                pageLength = 720;
                profit = 900_000;
                sequels = 4;
                countries = 30;
                break;
            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Sorry, we don't have information about it. Please try something else.");
        }
        System.out.println("If you like to write " + genre + " books, The average length is " + pageLength + " pages, the average profits is " + profit
        + " average number of sequels is " + sequels + ", \nand average number of countries published in is " + countries);
    }
}
/*
[Author] - Look at Starbucks from class for an idea

You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing.

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.
Find and print the information based on the genre.

Make variables for all of that information. Given empty defaults for all the variables

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
 */

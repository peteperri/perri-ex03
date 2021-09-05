/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Peter Perri
 */

/*
Exercise:
Create a program that prompts for a quote and an author.
Display the quotation and author as shown in the example output.

Pseudocode:
create a new scanner called 'input'
create two new empty string variables called 'quote' and 'author'
prompt the user for a quote, then assign it to 'quote'
prompt the user for an author, then assign it to 'author'
use a formatted print statement to display the quote

 */

import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String quote;
        String author;

        System.out.println("What is the quote?");
        quote = input.nextLine();
        System.out.println("Who said it?");
        author = input.nextLine();
        System.out.println(author + " says, \"" + quote + "\"");
    }
}

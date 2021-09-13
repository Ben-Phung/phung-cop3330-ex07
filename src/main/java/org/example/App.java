/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Ben Phung
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        // Prompt for input as strings
        System.out.println( "What is the length of the room in feet? " );
        String Length = scan.nextLine();

        System.out.println( "What is the width of the room in feet? " );
        String Width = scan.nextLine();

        // Turn strings into double in order to get decimal values
        double dLength = Double.parseDouble(Length);
        double dWidth = Double.parseDouble(Width);

        // Using constants for conversion
        double f2 = dLength * dWidth;
        double conversion = 0.09290304;
        double m2 = f2 * conversion;



        // Output
        System.out.println("You entered dimensions of "+Length+" feet by "+Width+" feet.");
        System.out.println("The area is");
        System.out.println(f2+" square feet");
        System.out.println(m2+" square meters");
    }
}

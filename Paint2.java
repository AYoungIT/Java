// Ashley Young
// 12/3/22
// This program takes wall height and width and calculates the cans of paint needed

import java.util.Scanner;

public class Paint2 {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        double cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompting user to input wall's height
        System.out.println("Enter wall height (feet): ");
        wallHeight = scnr.nextDouble();


        // Prompting user to input wall's width
        System.out.println("Enter wall width (feet): ");
        wallWidth = scnr.nextDouble();

        // Calculating and outputting wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area:  " + wallArea + " square feet");

        // Calculating and outputting the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = wallArea / squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

        // Calculating and outputting the number of paint cans needed to paint the wall,
        // rounded up to cans of paint needed to nearest integer
        cansNeeded = gallonsPaintNeeded * gallonsPerCan; // initialize and calculate initial value of cansNeeded
        cansNeeded = Math.ceil(cansNeeded); //Return the smallest double value that is greater than or equal to the argument.
        System.out.println("Cans needed: " + cansNeeded + " can(s)");
    }
}
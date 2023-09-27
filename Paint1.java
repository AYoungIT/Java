// Ashley Young
// 11/27/22
// This program takes wall width and height and then calculates paint needed

import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
        	try {
        		System.out.println("Enter wall height (feet): ");
        		wallHeight = scnr.nextDouble();
        		if (wallHeight <= 0) {
                    System.out.println("Invalid height");
        		}
        	}
        	catch (Exception excpt) {
        		System.out.println("Invalid input.");
        		scnr.nextLine();
        	}
        }
        while (wallHeight <= 0);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
        	try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
                if (wallWidth <= 0) {
                	System.out.println("Invalid width");
                }
        	}
            catch (Exception excpt) {
            	 System.out.println("Invalid input");
            	 scnr.nextLine();
        	}
        }
        while (wallWidth <= 0);


        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
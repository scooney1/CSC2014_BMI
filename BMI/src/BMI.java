/**
 * Author:	Sam Cooney
 * Project:	BMI
 * Date:	Sept. 20, 2017
 * I assert that the program I am submitting is the result of my own efforts. 
 */

import java.text.DecimalFormat;	// Allows use of class DecimalFormat.
import java.util.Scanner;		// Allows use of class Scanner.

public class BMI {
	// This class is used to test concepts in chapter 3
	// such as Formatting and the Wrapper classes. 
	
	public static void main(String[] args) {
		
		//
		//---------------------------------Part A---------------------------------
		//
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.00");
		
		System.out.println("Please input the statement: \"My weight is XXX pounds.\"");
		System.out.println("Replace the XXX with your three digit weight in pounds.");
		String Str = scan.nextLine();				// Reads in string.
		String weightStr = Str.substring(13,16);	// Takes a substring with the weight.
		//System.out.println(weightStr); //Debugging: Check for correct value.
		int weight = Integer.parseInt(weightStr);	// Turns the string into an int.
		//System.out.println(weight);	 //Debugging: Check for correct value.
		System.out.println("Please input the statement: \"My height is XX inches.\"");
		System.out.println("Replace the XX with your two digit height in inches.");
		Str = scan.nextLine();						// Read in string.
		String heightStr = Str.substring(13,15);	// Take a substring with the height.
		//System.out.println(heightStr); //Debugging: Check for correct value.
		int height = Integer.parseInt(heightStr);	// Turns the string into an int.
		//System.out.println(height);	 //Debugging: Check for correct value.
		
		//
		//---------------------------------Part B---------------------------------
		//
		
		double height2 = Math.pow(height, 2);
		//System.out.println(height2);	 //Debugging: Check for correct value.
		double BMI = (weight/height2)*703;
		//System.out.println(BMI);	 	 //Debugging: Check for correct value.
		System.out.println("Height: " + fmt.format(height) + " in.");
		System.out.println("Height Squared: " + fmt.format(height2) + " in^2.");
		System.out.println("Weight: " + fmt.format(weight) + " lbs.");
		System.out.println("BMI: " + fmt.format(BMI) + " lbs/in^2.");
		
		//
		//---------------------------------Part C---------------------------------
		//
		
		System.out.println("Type a positive integer:");	// Asks for positive integer.
		int iA = scan.nextInt();			// Reads an integer.
		System.out.println("You have entered: " + iA);
		System.out.println("Type a negative integer:");	// Asks for negative integer.
		int iB = scan.nextInt();			// Reads an integer.
		System.out.println("You have entered: " + iB);
		System.out.println("Type a positive decimal:");	// Asks for a positive double.
		double dC = scan.nextDouble();		// Reads a double.
		System.out.println("You have entered: " + fmt.format(dC));		
		System.out.println("The absolute value of iB is: " + Math.abs(iB));	// Prints the absolute value of iB.
		System.out.println("iA to the fifth power is: " + fmt.format(Math.pow(iA,5)));	// Prints iA^5.
		System.out.println("The floor of dC is: " + fmt.format(Math.floor(dC)));		// Prints the floor of dC.
		
		System.out.println("***************************************************************");		// This
		System.out.println("*                         Sam Cooney                          *");		// is
		System.out.println("*                          CSC 2014                           *");		// my
		System.out.println("*                         Project #6                          *");		// own
		System.out.println("***************************************************************\n\n");	// box.
		
		scan.close();
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner jv = new Scanner(System.in); 	// Create new Scanner object
		final double KILOGRAMS_PER_POUND = 0.454;	// Create constant value

		// Prompt user to enter the number of pounds
		System.out.print("Enter a number in pounds: ");
		double pounds = jv.nextDouble();

		// Convert pounds into kilograms
		double kilograms = pounds * KILOGRAMS_PER_POUND;

		// Display the results
		System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
    
}

import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
import java.lang.Math;
import java.util.*;



public class Sphere
{
  public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    int diameter = 0;
    double volume = 0.0;
    double gallons = 0.0;
    char choice = ' ';


    do 
    {
        System.out.print("Please enter diameter in inches: ");
        while (!sc.hasNextInt())
        {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please try again, Enter diameter in inches: ");
        }
        diameter = sc.nextInt();

        System.out.println();

        volume = ((4.0/3.0) * Math.PI * Math.pow(diameter/2.0, 3));
        gallons = volume/231;
        System.out.println("Sphere volume: " + String.format("%,.2f", gallons) + " liquid US gallons");

        System.out.print("\nDo you want to cvalculate another sphere volume (y or n)?" );
        choice = sc.next().charAt(0);
        choice = Character.toLowerCase(choice);

    }while (choice == 'y');

    System.out.println("Thank you for using the Sphere Volume Calculator!");
       
    }
}
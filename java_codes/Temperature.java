import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.*;



public class Temperature
{
  public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    double temp = 0.0;
    char choice = ' ';
    char type = ' ';

    do 
    {
        System.out.print("\nFahrenheit to Celsius? Type \"f\", or Celsius to Fahrenheit? Type \"c\": ");
        type = sc.next().charAt(0);
        type = Character.toLowerCase(type);
            if (type == 'f')
            {
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = sc.nextDouble();
                temp = ((temp-32)*5)/9;
                System.out.println("Temperature in Celsius = " + temp);
            }
            else if (type == 'c')
            {
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();
                temp = (temp*9/5) + 32;
                System.out.println("Temperature in Fahrenheit = " + temp);
            }
            else
                System.out.println("Incorrect entry. Please try again.");

        System.out.print("\nDo you want to convert another temperature? (y or n): ");
        choice = sc.next().charAt(0);
        choice = Character.toLowerCase(choice);
    }while (choice == 'y');

    System.out.println("Thank you for using the Temperature COmnversion Program!");
       
    }
}
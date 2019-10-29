import java.util.Scanner;



public class ThreeNumbers

{
  public static void main(String[] args)
    {

      System.out.println("Program evalutates largest of three numbers.");
      System.out.println("Note: program checks for integers and non-numeric values.");
      System.out.println();
  //declare variables and create Scanner object

  int num1 = 0, num2 = 0, num3 = 0;

  Scanner input = new Scanner(System.in);
  System.out.print("Please enter first number: ");
  while (!input.hasNextInt())
  {
  System.out.println("Not valid integer!\n");
  input.next();
  System.out.print("Please try again. Enter first number: ");
  }

  num1 = input.nextInt();


  System.out.print("Please enter second number: ");

  while (!input.hasNextInt())
  {
  System.out.println("Not valid integer!\n");
  input.next();
  System.out.print("Please try again. Enter second number: ");
  }

  num2 = input.nextInt();


  System.out.print("Please enter third number: ");
  while (!input.hasNextInt())

  {
  System.out.println("Not valid integer!\n");
  input.next();
  System.out.print("Please try again. Enter third number: ");
  }

  num3 = input.nextInt();


  System.out.println();
  if ( num1 > num2 && num1 > num3)

  System.out.println("First number is largest.");

  else 
    if ( num2 > num1 && num2 > num3)

  System.out.println("Second number is largest.");

  else 
    if ( num3 > num1 && num3 > num2)

    System.out.println("Third number is largest.");

    else 

    System.out.println("Integers are equal.");


  }


}
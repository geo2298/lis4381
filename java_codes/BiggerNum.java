import java.util.Scanner;

public class BiggerNum
{
   public static void main(String[] args)
   {
      System.out.println("Program will evaluate which integer is largest between 2 integers");
      System.out.println(" ");
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter first integer: ");
   int number1 = sc.nextInt();
      System.out.print("Enter second integer: ");
   int number2 = sc.nextInt();

   if (number1 > number2)
      System.out.println(number1 + " is larger than " + number2);
   else if (number2 > number1)
      System.out.println(number2 + " is larger than " + number1);
   else if (number1 == number2)
      System.out.println("Integers are equal");
	
   }
}

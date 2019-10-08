import java.util.Scanner;
import java.util.Random;

public class RandomArray
{
   public static void main(String[] args)
   {
      System.out.println("Program tells user to enter desired number of pseudogenerted integers");
      Scanner sc = new Scanner(System.in);
      Random r = new Random();
      int arraySize = 0;

      System.out.print("Enter desired number of pseudorandom-generated integers (min 1): ");
      arraySize = sc.nextInt();

      int arr[] = new int[arraySize];
   
    

    System.out.println("for loop: ");
    for (int i=0; i < arr.length; i++)
    {
        System.out.println(r.nextInt());
    }
      System.out.println("");
      System.out.println("Enhanced for loop: ");
      for (int n: arr)
      {
        System.out.println(r.nextInt());
      }

    System.out.println("");
    System.out.println("while loop: ");

      int i=0;
      while (i < arr.length)
      {
        System.out.println(r.nextInt());
        i++;  
      }
System.out.println("");
System.out.println("do while loop: ");
      i = 0;
      do {
        System.out.println(r.nextInt());
        i++;
      }while(i < arr.length);
	
   }
}

import java.util.Scanner;

public class ArraysAndLoops
{
   public static void main(String[] args)
   {
      System.out.println("Program loops through array of strings");

    String[] arr = {"dog" , "cat" , "bird" , "fish" , "insect"};
    

    System.out.println("for loop: ");
    for (int i=0; i < arr.length; i++)
    {
        System.out.println(arr[i]);
    }
      System.out.println("");
      System.out.println("Enhanced for loop: ");
      for (String animal: arr)
      {
          System.out.println(animal);
      }

    System.out.println("");
    System.out.println("while loop: ");

      int i=0;
      while (i < arr.length)
      {
          System.out.println(arr[i]);
          i++;
      }
System.out.println("");
System.out.println("do while loop: ");
      i = 0;
      do {
        System.out.println(arr[i]);
        i++;
      }while(i < arr.length);
	
   }
}

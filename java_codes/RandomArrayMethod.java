import java.util.Scanner;
import java.util.Random;


public class RandomArrayMethod
{
    
    public static void displayProgram()
    {
        System.out.println("Program prompts user to enter desired number of pseudorandom-generated integers (min 1).");
    }

    public static int getArraySize()
    {
        int arraySize;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter desired number of pseudo-random integers: ");
        while (!sc.hasNextInt())
        {
            System.out.println("Not valid integer!\n");
            sc.next();
            System.out.print("Please try again. Enter the desired number of pseudo-random integers: ");
        }
        arraySize=sc.nextInt();
        return arraySize;
    }

    public static void displayArrays(int num)
    {
        Random r = new Random();
        int i = 0;

        int array[] = new int[num];

        System.out.println("for loop: ");
        for (int n=0; n < array.length; n++)
        {
            System.out.println(r.nextInt());
        }

        System.out.println("\nenhanced for loop: ");
        for(int n: array)
        {
            System.out.println(r.nextInt());
        }

        System.out.println("\nwhile loop: ");
        i=0;
        while (i < array.length)
        {
            System.out.println(r.nextInt());
            i++;
        }

        
        System.out.println("\ndo while loop:");
        i=0;
        do
        {
            System.out.println(r.nextInt());
            i++;
        }while (i < array.length);

    }
   public static void main(String[] args)
   {
        displayProgram();
        int arrayNum = getArraySize();
        displayArrays(arrayNum);
	
   }
}

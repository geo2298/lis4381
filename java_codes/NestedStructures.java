import java.util.Scanner;
import java.util.*;



public class NestedStructures
{
  public static void main(String[] args)
    {
        int nums[]={3, 2, 4, 99, -1, -5, 3, 7};
        Scanner sc = new Scanner(System.in);
        int search;

        System.out.print("Array length: " + nums.length);

        System.out.print("\nEnter search value: ");
        search=sc.nextInt();

        System.out.println();
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == search)
                System.out.println(search + " found at index " + i);
            else
                System.out.println(search + " not found at index " + i);

        }

    }
}
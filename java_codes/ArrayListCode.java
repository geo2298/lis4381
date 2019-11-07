import java.util.Scanner;
import java.util.*;



public class ArrayListCode
{
  public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> obj = new ArrayList<String>();
    String myStr = "";
    String choice = "y";
    int num = 0;

        while (choice.equals("y"))
        {
            System.out.print("Enter animal type: ");
            myStr=sc.nextLine();
            obj.add(myStr);
            num=obj.size();
            System.out.println("ArrayList elements:" + obj + "\nArrayList Size: " + num);
            System.out.print("\nContinue? Enter y or n: ");
            choice = sc.next();
            sc.nextLine();
        }
    }
}
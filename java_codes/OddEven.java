import java.util.Scanner;

public class OddEven
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter integer: ");
	int number = sc.nextInt();
	if (number % 2 == 0)
		System.out.print(number + " is an even number");
	else
		System.out.print(number + " is an odd number");
   }
}

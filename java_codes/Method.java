import java.util.Scanner;

public class Method
{
  static void displayProgram(){
    System.out.println("Program prompts user for first name and age, then print results");
  }

  static void myVoidMethod(String fname, int age){
    System.out.println(fname + " is " + age);
  }

  static String myValueReturningMethod(String fname, int age){
    return fname + " is " + age;
  }

   public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    displayProgram();
    
    System.out.print("Enter first name: ");
    String first = sc.nextLine();
    System.out.print("Enter age: ");
    int second = sc.nextInt();

    System.out.print("Void calling method: ");
    myVoidMethod(first, second);
    System.out.print("Value-returning calling method: ");
    System.out.println(myValueReturningMethod(first, second));
   }
}

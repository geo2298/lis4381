import java.util.Scanner;

public class Decision
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
      System.out.println("Program evaluates user-entered characters");

  System.out.println("Phone types: W or w (work), C or c (cell), H or h (home), N or n (none).");
    System.out.print("Enter phone type: ");
    int phonetype = sc.next().charAt(0);

System.out.println("\n\nif...else:");
if (phonetype == 'W' || phonetype == 'w')
    System.out.println("Phone type : work");
else if (phonetype == 'C' || phonetype == 'c')
    System.out.println("Phone type : cell");
else if (phonetype == 'H' || phonetype == 'h')
    System.out.println("Phone type : home");
else if (phonetype == 'N' || phonetype == 'n')
    System.out.println("Phone type : none");
else
    System.out.println("Incorrect character entry");

System.out.println("\n\nswitch");

switch (phonetype) {
    case 'W':
        System.out.println("Phone type : work");
        break; 
    case 'w':
        System.out.println("Phone type : work");
        break;    
    case 'C':
        System.out.println("Phone type : cell");
        break;
    case 'c':
        System.out.println("Phone type : cell");
        break;
    case 'H':
        System.out.println("Phone type : home");
        break;
    case 'h':
        System.out.println("Phone type : home");
        break;
    case 'N':
        System.out.println("Phone type : none");
        break;
    case 'n':
        System.out.println("Phone type : none");
        break;
    default: 
        System.out.println("Incorrect character entry");
        break;
}   
  
   }
}

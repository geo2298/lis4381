import java.util.Scanner;

public class ArrayRunTime
{
  public static void main(String[] args)
    {
Scanner sc = new Scanner(System.in);
int arraySize=0;
float sum = 0.0f;
float average = 0.0F;

System.out.print("Enter array size: ");
arraySize = sc.nextInt();
System.out.println();

float numsArray[]=new float[arraySize];
for (int i = 0; i < arraySize; i++)
{
    System.out.print("Enter num " + (i + 1) + ": ");
    numsArray[i] = sc.nextFloat();
    sum = sum+numsArray[i];
}
    
System.out.println();

System.out.println("Sum: " + String.format("%.2f", sum));
average = sum/arraySize;
System.out.println("Average: " + String.format("%.2f", average));

}


}
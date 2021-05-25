import java.util.*;
class SumScannerClass
{
public static void main(String args[]) throws Exception
{
  Scanner sr=new Scanner(System.in);
  System.out.println("Enter the first No:");
  int a = sr.nextInt();
  System.out.println("Enter the Second No:");   
  int b = sr.nextInt();
      
  int sum = a+b;
  System.out.println("Sum of Numbers:" +sum);
}
}
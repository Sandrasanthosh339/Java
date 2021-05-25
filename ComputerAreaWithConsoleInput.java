import java.util.*;
public class ComputerAreaWithConsoleInput
{
 public static void main(String args[]) throws Exception
  {
Scanner input = new Scanner(System.in);
System.out.println("Enter the Radius:");
double radius = input.nextDouble();
double area = radius*radius*3.14159;
System.out.println("The area for the circle with radius" +radius+ "is" +area);
}
}
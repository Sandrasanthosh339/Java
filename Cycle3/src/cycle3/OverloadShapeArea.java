import java.util.Scanner;
public class OverloadShapeArea
{
 
void Area(float x)
 {
    System.out.println("Area of Square:"+x*x+" sq units");
 }

void Area(float x,float y)
 {
   float tr = x*y;
   System.out.println("Area of Rectangle :" +tr);
 }

void Area(double r)
{
   double ar = 3.14*r*r;
   System.out.println("Area Of Circle:"+ar+ "sq units");
   
}


public static void main(String args[])
{
   OverloadShapeArea ob = new OverloadShapeArea();
   System.out.println("Enter the side of square:");
   Scanner sc =new Scanner(System.in);
   float a = sc.nextFloat();
   ob.Area(a);
   
   System.out.println("Enter the Length And breadth Of Rectangle:");
   Scanner s = new Scanner(System.in);
   float l = sc.nextFloat();
   float b = sc.nextFloat();
   ob.Area(l,b);
   
   System.out.println("Enter the Radius");
   Scanner s1 = new Scanner(System.in);
   double rs = s1.nextDouble();
   ob.Area(rs);

}

}






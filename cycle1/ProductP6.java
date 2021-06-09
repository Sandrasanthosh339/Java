
import java.util.Scanner;
class ProductP6
{
int pcode;
String pname;
float price;
void Record(int cod,String nam,float prc)
{
pcode=cod;
pname=nam;
price=prc;
}
void PriceLow(float pr1,float pr2,float pr3,String nm1,String nm2,String nm3)
{

if(pr1<pr2 && pr1<pr3)
{
System.out.println("The Product With Lowest Price Is:"+nm1);
System.out.println("The Lowest Price Of the Product is: "+pr1);
}
else if(pr2<pr1 && pr2<pr3) 
{
System.out.println("The Product With Lowest Price Is:"+nm2);
System.out.println("The Lowest Price Of the Product is: "+pr2);
}
else if(pr3<pr2 && pr3<pr1)
{
System.out.println("The Product With Lowest Price Is:"+nm3);
System.out.println("The Lowest Price Of the Product is: "+pr3);
}
else
{
System.out.println("all products have same price");
}
}
public static void main(String args[])
{
Scanner s = new Scanner(System.in);


System.out.print("Enter the Product 1 Code : ");
int cod1 =s.nextInt();
System.out.print("Enter the Product 1 Name : ");
String name1 = s.next();
System.out.print("Enter the Product 1 Price : ");
float price1=s.nextFloat();

System.out.print("Enter the product 2 Code : ");
int cod2 =s.nextInt();
System.out.print("Enter the Product 2 Name : ");
String name2 = s.next();
System.out.print("Enter the Product 2 Price : ");
float price2 = s.nextFloat();

System.out.print("Enter the Product 3 Code : ");
int cod3 =s.nextInt();
System.out.print("Enter the Product 3 Name : ");
String name3 = s.next();
System.out.print("Enter the Product 3 Price : ");
float price3 = s.nextFloat();

ProductP6 p1= new ProductP6();
ProductP6 p2= new ProductP6();
ProductP6 p3= new ProductP6();
p1.Record(cod1,name1,price1);
p2.Record(cod2,name2,price2);
p3.Record(cod3,name3,price3);

p1.PriceLow(price1,price2,price3,name1,name2,name3);
}
}

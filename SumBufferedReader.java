import java.io.*;
class SumBufferedReader
 {
   public static void main(String args[]) throws Exception
    {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

      System.out.println("Enter the first No:");
      int a = Integer.parseInt(br.readLine());
      System.out.println("Enter the Second No:");   
      int b = Integer.parseInt(br.readLine());
      
      int sum = a+b;

      System.out.println("Sum of Numbers:" +sum);
    }
}
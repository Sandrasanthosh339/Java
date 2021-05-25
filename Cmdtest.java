class Cmdtest
{
  public static void main(String args[])
   {
     System.out.println(args[0]);
     System.out.println(args[1]);
     System.out.println(args[2]);
     System.out.println(args[0]+args[1]+args[2]);
     System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]));

     int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);

     int count=args.length;

     System.out.println("Sum Of Values:" +sum);
     System.out.println("Sum Of Values:" +sum+"----");
   
     System.out.println("No. of values:"+count+   "Sum Of Values:" +sum);

     
   }
}
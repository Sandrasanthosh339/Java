import java.util.Scanner;
class Person
{
String name,gender,address;
int age;
public Person()
 {}
public Person( String n, String g , String addr , int a )
{
this.name = n ;
this.gender = g ;
this.address =addr ;
this.age = a ;
}
public void displayPerson( ) 
{
System.out.println("Name:"+name ) ;
System.out.println("Gender : " + gender );
System.out.println("address : " + address ) ;
System.out.println("age : " + age ) ;
}
}
 
class Employee extends Person
{
    int empid,salary;
    String company_name,qualification;
    public Employee()
    {}
    public Employee(String n,String g,String addr,int a,int eid,String cname,String qual,int sal)
    {
        super(n,g,addr,a);
        empid = eid;
        company_name = cname;
        qualification = qual;
        salary = sal;
    }
    public void displayEmployee()
    {
        super.displayPerson();
        System.out.println("Empid :"+empid);
        System.out.println("Company Name :"+company_name);
        System.out.println("Qualification:"+qualification);
        System.out.println("Salary:"+salary);
    }
} 
class Teacher1 extends Employee
{
  String subject,department;  
  int teacher_id;
  public Teacher1(String n,String g,String addr,int a,
          int eid,String cname,String qual,int sal,
          String sub,String dept,int tid)
  {
      super(n,g,addr,a,eid,cname,qual,sal);
      subject =sub;
      department = dept;
      teacher_id = tid;
     
  }
  public void displayTeacher()
  {
      super.displayEmployee();
      System.out.println("Teacher id :"+teacher_id);
      System.out.println("Subject:"+subject);
      System.out.println("Department:"+department);
  }
}

public class MultilevelInheritancePerson
{
    public static void main(String args[])
    {
        System.out.println("Enter the Number of Teachers:");
        Scanner sc = new Scanner(System.in ) ;
        int N = sc.nextInt();
        Teacher1 [] teachers = new Teacher1[N];
        Scanner scs = new Scanner(System.in ) ;
        
        for(int i=0;i<N;i++)
        {
            System.out.println("Enter the name of Teacher :");
            String name = scs.next();
            System.out.println("Enter Gender:");
            String gen = scs.next();
            System.out.println("Enter the Address of Teacher :");
            String addr = scs.next();
            System.out.println("Enter the Age of Teacher :");
            int ag = sc.nextInt();
            
            System.out.println("Enter the Empid of Teacher :");
            int eid = sc.nextInt();
            System.out.println("Enter the Company Name :");
            String cn = scs.next();
            System.out.println("Enter the Qualification :");
            String quali = scs.next();
            System.out.println("Enter salary of the teacher: " );
            int sal = sc.nextInt();
            
            System.out.println( "Enter Teacher id " ) ;
            int tid = sc.nextInt();
            System.out.println("Enter the Subject of the Teacher:");
            String sub = scs.next();
            System.out.println("Enter the Department of the Teacher:");
            String dept = scs.next();
            Teacher1 t = new Teacher1(name,gen,addr,ag,eid,cn,quali,sal,sub,dept,tid);
            teachers[i] = t;
           
        }
        for(Teacher1 t : teachers)
        {
            t.displayTeacher();
        }
        
    }
}



































class ParameterizedConstructor 
{  
  
private int id; 
 
  private String name;
  
  ParameterizedConstructor(int i,String n )
 {
    id=i;
    name = n;  
}
   
void display( ) 
{
	
System.out.println(id+" "+name);
   
 }  
      
    
public static void main(String args[ ])
 {  
    
ParameterizedConstructor s1=new ParameterizedConstructor(111,"Ammu");  
ParameterizedConstructor s2=new ParameterizedConstructor(222,"Aryan");  
  s1.display();
  s2.display();  
  
  }  

 }
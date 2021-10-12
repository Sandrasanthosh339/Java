interface Student 
{
int score = 10 ;
void displayScore() ;
}
interface Sports
{
int score =25;
void displaySportScore() ;
}

class Result implements Student , Sports 
{
public void displayScore () 
 {
System.out.println("Academic scoreis : " + Student.score) ;
 }
public void displaySportScore()
 {
System.out.println( "Sportscoreis : " + Sports.score) ;
 }
}
public class MultipleInheritanceP5 
{
public static void main ( String [] args)
{
Result r = new Result();
r.displayScore();
r.displaySportScore();
}
}
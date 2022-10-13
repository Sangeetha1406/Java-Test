1) what is platform independence?
   platform is nothoing but combination of os and processor. the program written in one platform can be executed in other platform. such that the program written using windows platform.
can be executed in other platform like unix/linux,mac etc. java is a platform independent language where we write the program once it can be executed in others platforms directly. 
so java known as WRITE ONCE RUN ANYWHERE.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

2) what is the difference between primitive and non-primitive data type?
   primitive:
	*primitive is a fixed size.
	*in the primitive contain 8 types of data.
	byte,int,short,long,float,double,char,boolean.
	
   non-primitive:
	*non-primitive start with upper case.
	*in the non-primitive contain className,String n number non-primitive datatype.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

3) explain class and its members with an example?
   class:
	class is an design or blueprint of an object which contain states and behaviour. states represent a variable and behaviour represent a method.
   variables:
	variable is a container it stores data or value.
            or
	variable is registered area it is allocated in memory.
   Constructor:
	constructor is a special type of method as which the class and constructor name will be same.no return type. 

   Blocks: blocks is either a static and non-static. it contain code snippets.

   Method:
	Method is a block of code. it will be used for reusability purpose.
Example:
	
	class Sangeetha
	{
		String location;
		String Stream;
		String College;
		public static void Sang()
		{
			System.out.println(";;;;;):");
		}
	}
	public static void main(String[] args)
	{
		Sangeetha sa=new Sangeetha();
		sa.location="Shimoga";
		sa.Stream="shimoga";
		sa.College="jnnce";
		sa.Sang();
	}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

4) write a program to accept two inputs total and received marks, calculate percentage and return?

class Percentage{
	public static void main(String[] args)
	{
		int java=60;
		int python=80;
		int totalMarks=100;
		
		float total=sub1+sub2;
		float result=total/2;
		static void marks(){
		{
			System.out.println("marks is" +result);
		}
		return;
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

6) explain main method with the memory its executes in?

   *The main()is the starting point for JVM to start execution of a Java program. Without the main() method, JVM will not execute the program.
   *JVM executes the static block, then it executes static methods, and then it creates the object needed by the program. then it executes the instance methods.
   *JVM executes a static block on the highest priority basis. 
   *JVM first goes to static block even before it looks for the main method in the program.

public static void main(String[] a)

public is a access specifier where eveyone can acess.
static is non-access specifier it is predefined keyword which allocates the memory first.
void is a return type which will not return any value.
main is a method name .
String a[] is a its string type array which will store the value passed in the command line.s

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


7) program for reverse of a given number?
public class ReverseNumber1   
{  
	public static void main(String[] args)   
{  
	int number = 12345, reverse = 0;  
	while(number != 0)   
{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
}  
System.out.println("The reverse of the given number is: " + reverse);  
}  
}  

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

8) program to find hours into seconds?
class Hours
{
	public static void main(String[] args)
	{
		int hours=1, seconds;
		seconds=hours*60*60;
		System.out.println("seconds "+seconds);
	}
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

9) program to find armstrong number?
class Armstrong
{
	public static void main(String[] args)
	{
		int n=121,m,remainder,result=0;
		m=n;
		while(m!=0) 
		{
			remainder=m %10;
			result+=Math.pow(remainder, 3);
			m/=10;
		}
		if(result==n)
		{
			System.out.println(n +"is a armstrong");
		}
		else
		{
			System.out.println(n +"is a not armstrong");
		}
	}
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

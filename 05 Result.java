import java.util.Scanner;
class Result
{
public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);			
		System.out.println("Enter marks=");
		int marks=sc.nextInt();

	if(marks>=75)
	System.out.println("Distinction");
	else if(marks>=60)
	System.out.println("1st Class");
	else if(marks>=50)
	System.out.println("2nd Class");
	else if(marks>=35)
	System.out.println("Pass");
	else
	System.out.println("Fail");		
	}
}
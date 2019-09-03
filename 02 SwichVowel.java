import java.util.Scanner;
class Swich 
{
public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character=");
		char ch = sc.next().charAt(0);
		int a;
		a=ch;
		if(a<=90&&a>=65)
		{
		a=a+32;
		ch='a';
		}
		switch(ch)
		{
			case 'a':			
			case 'e':		
			case 'i':
			case 'o':
			case 'u':
			System.out.println("Is vowel");	
			break;	
			default:
			System.out.println("Not vowel");
		}		
	}


	
}
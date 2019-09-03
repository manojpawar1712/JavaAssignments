import java.util.Scanner;
class Table
{

	public static void main(String args[]	)
	{
	Scanner sc=new Scanner(System.in);
	int a,i;
	System.out.println("ENter any number to print table=");
	a=sc.nextInt();
	for(i=1;i<=10;i++)
		{
		System.out.println(""+a+"*"+i+"=\t"+a*i+"");
		}	
	}
}
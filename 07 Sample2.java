class Sample2
{
	private int var2;
	public void setval(int var2)
	{
	this.var2=var2;
	}
	public int getval()
	{
	return this.var2;
	}
public static void main(String args[])
	{	
        	Sample2 ob=new Sample2();
		ob.setval(4);
		System.out.println(ob.getval());
				
	}


}
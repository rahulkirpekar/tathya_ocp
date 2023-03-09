package tathya_ocp;

public class TestApp1 
{
	// Dm's  / Instance Variable
	final int no;
	public TestApp1() 
	{
		no=100;
	}
	public TestApp1(int no) 
	{
		this.no=no;
	}
	public static void main(String[] args) 
	{
		TestApp1  obj = new TestApp1(200);
	
		System.out.println("No : " + obj.no);
	}
}

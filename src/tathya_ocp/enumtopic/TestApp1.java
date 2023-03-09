package tathya_ocp.enumtopic;

public class TestApp1 
{
	public enum Color             
	{                             
		RED,                        
		GREEN,                      
		YELLOW                      
	}                             
	                              
	public static void main(String[] args) 
	{
		Color color = Color.GREEN;
		
		System.out.println(color);
		
	}
}

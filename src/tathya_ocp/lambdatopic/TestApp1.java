package tathya_ocp.lambdatopic;

import java.util.Scanner;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Customer c = new Customer();
//		c.addFun();

		Calc c  = (no1,no2) ->(no1+ no2);
					
		int ans = c.addFun(20,10);
		
		System.out.println("Addition : " + ans);
	
	}
}

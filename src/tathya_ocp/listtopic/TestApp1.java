package tathya_ocp.listtopic;

import java.util.Arrays;
import java.util.List;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		String names[] = {"rahul","tathya","ankur"}; 

		System.out.println("names --- "+names.hashCode());
		
		List<String>list = Arrays.asList(names);
		System.out.println("list --- "+list.hashCode());
		
		names[0] = "Patel";

		System.out.println(list);

	}
}

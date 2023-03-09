package tathya_ocp;

public class TestApp5 
{
	public static void main(String[] args) 
	{
		String str
        = "\u2000      Royal   !    \u2000";

    // removing leading and
    // trailing white spaces
    System.out.println(str.strip() + " "+str.strip().length());
    System.out.println(str.trim() + " "+str.trim().length());

    // removing leading white spaces
//    System.out.println(str.stripLeading().length());

    // removing trailing white spaces
//    System.out.println(str.stripTrailing().length());
		
	}
}

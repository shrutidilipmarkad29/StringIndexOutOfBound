package Practice;
import java.util.Scanner;
public class Sh 
{

	public static void main(String[] args) 
	{

		String str= "shruti";
		System.out.println("Name :"+str);
		try
		{	
				System.out.println(str.charAt(6));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Outside the main");
	}

}

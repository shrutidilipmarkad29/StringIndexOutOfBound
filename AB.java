package Practice;

public class AB 
{

	public static void main(String[] args) 
	{
		String str=null;
		System.out.println(str);
		
		try
		{
			System.out.println("Length :"+str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Outside the catch");
	}
}

//Scanner sc=new Scanner(System.in);
//System.out.println("Enter the String");
//String n=sc.nextLine();
////System.out.println(n);
//
//try
//{
//	String str;
//	System.out.println(n);
//}
//catch(NullPointerException e)
//{
//	System.out.println(e);
//}
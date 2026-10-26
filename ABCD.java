package Practice;

public class ABCD {

	public static void main(String[] args) {
		
		String arr[]= {"Shruti","ram","gita","Tina"};
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(arr[i]+"\t");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
	}

}

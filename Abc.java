package Practice;

public class Abc {

	String username;
	String email;
	int contact;
	String address;
	String profile;
	
	public Abc(String username,String email,int contact,String address,String Profile)
	{
		this.username=username;
		this.email=email;
		this.contact=contact;
		this.address=address;
		this.profile=Profile;
	}
	
	public Abc(String username,String email)
	{
		this.username=username;
		this.email=email;
	}
	
	public void display()
	{
		System.out.println("Username :"+username);
		System.out.println("Email :"+email);
		System.out.println("Contact"+contact);
		System.out.println("Address :"+address);
		System.out.println("Profile :"+profile);	
	}
	
	public void show()
	{
		System.out.println("Username :"+username);
		System.out.println("Email :"+email);
	}
	public static void main(String[] args) {

		Abc obj=new Abc("shruti","shruti@gmail.com",82653146,"pune","private");
//		Abc obj2 =new Abc("Rena", "abc@gmail.com", 34566778, "pune1", "Java");
		Abc obj1=new Abc("Saloni","saloni@gmail.com");
		
		obj.display();
		obj1.show();
		
	}

}

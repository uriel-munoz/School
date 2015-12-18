

/*
 * 4
100,Y. Byun,ybyun@csumb.edu,111-111-1111
200,S. Narayanan,sathya@csumb.edu,222-222-2222
300,M. Lara,lara@csumb.edu,333-333-3333
250,S. Bude,bude@csumb.edu,444-123-4567
 */
public class Instructor {
	int employeeID;
	String name;
	String email;
	String phone;
	
	public Instructor()
	{
		employeeID=0;
		name=" ";
		email= " ";
		phone= " ";
	}
	public Instructor(int employeeID, String name, String email, String phone)
	{
		this.employeeID=employeeID;
		this.name=name;
		this.email=email;
		this.phone=phone;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		//change 
		return name;
	}

}

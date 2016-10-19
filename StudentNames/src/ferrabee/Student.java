package ferrabee;

public class Student implements Comparable {
	private static long idGenerator=300000000;
	private long studentNumber;
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String provName;
	private String postalName;
	private long numName;
	private String dateName;
	public Student()
	{
		setFirstName("");
		setLastName("");
		setStreetAddress("");
		setCity("");
		setProvName("");
		try {
			setPostalName("a1b1c1");
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
		try {
			setNumName(1234567890);
		} catch (InvalidInputException e) {
			e.printStackTrace();
		}
		setDateName("");


		this.studentNumber= idGenerator;
		idGenerator++;
	}
	
	// the first name of student	

public void setFirstName(String fname)
{
	this.firstName=fname;
}
public String getFirstName()
{
	return this.firstName;
}


//the last name of student

public void setLastName(String lname)
{
	this.lastName=lname;
}
public String getLastName()
{
	return this.lastName;
}
public int CompareTo()
{
	return 0;
	
}

//the address of student

public void setStreetAddress(String saddress)
{
	this.streetAddress=saddress;
}
public String getStreetAddress()
{
	return this.streetAddress;
}



//the city of student

public void setCity(String 
		Cname)
{
	this.city=Cname;
}
public String getCity()
{
	return this.city;
}



//the province name of student

public void setProvName(String pname)
{
	this.provName=pname;
}
public String getProvName()
{
	return this.provName;
}



//the postal code of student

public void setPostalName(String postname) throws InvalidInputException
{	
	
	
			
		if( postname.length()==6)
			// checks if the postal code if correct
		{	
			if(postname.charAt(0)!='0'&& postname.charAt(0)!='1'&&postname.charAt(0)!='2'&& postname.charAt(0)!='3'&&postname.charAt(0)!='4'&&postname.charAt(0)!='5'&& postname.charAt(0)!='6'&&postname.charAt(0)!='7'&&postname.charAt(0)!='8'&& postname.charAt(0)!='9')
			{
				if(postname.charAt(1)=='0'|| postname.charAt(1)=='1'||postname.charAt(1)=='2'|| postname.charAt(1)=='3'|| postname.charAt(1)=='4'||postname.charAt(1)=='5'|| postname.charAt(1)=='6'|| postname.charAt(1)=='7'||postname.charAt(1)=='8'|| postname.charAt(1)=='9')
				{
					if(postname.charAt(2)!='0'&& postname.charAt(2)!='1'&&postname.charAt(2)!='2'&& postname.charAt(2)!='3'&&postname.charAt(2)!='4'&&postname.charAt(2)!='5'&& postname.charAt(2)!='6'&&postname.charAt(2)!='7'&&postname.charAt(2)!='8'&& postname.charAt(2)!='9')
					{
						if(postname.charAt(3)=='0'|| postname.charAt(3)=='1'||postname.charAt(3)=='2'|| postname.charAt(3)=='3'|| postname.charAt(3)=='4'||postname.charAt(3)=='5'|| postname.charAt(3)=='6'|| postname.charAt(3)=='7'||postname.charAt(3)=='8'|| postname.charAt(3)=='9')
						{
							if(postname.charAt(4)!='0'&& postname.charAt(4)!='1'&&postname.charAt(4)!='2'&& postname.charAt(4)!='3'&&postname.charAt(4)!='4'&&postname.charAt(4)!='5'&& postname.charAt(4)!='6'&&postname.charAt(4)!='7'&&postname.charAt(4)!='8'&& postname.charAt(4)!='9')
							{
								if(postname.charAt(5)=='0'|| postname.charAt(5)=='1'||postname.charAt(5)=='2'|| postname.charAt(5)=='3'|| postname.charAt(5)=='4'||postname.charAt(5)=='5'|| postname.charAt(5)=='6'|| postname.charAt(5)=='7'||postname.charAt(5)=='8'|| postname.charAt(5)=='9')
								{
									this.postalName=postname;
									// sends the info back to class Student
									
								}
								else
								{
									
									//tells user to input a valid postal code
									throw new InvalidInputException(" Please Enter a valid postal code");
								}
								
							}
							else
							{
							
								throw new InvalidInputException(" Please Enter a valid postal code");
							}
							
						}
						else
						{
							
							throw new InvalidInputException(" Please Enter a valid postal code");
						}
						
					}
					else
					{
						throw new InvalidInputException(" Please Enter a valid postal code");
					}
				}
				else
				{
					throw new InvalidInputException("Please Enter a valid postal code");
				}
			}
			else
			{
				throw new InvalidInputException(" Please Enter a valid postal code");
			}
			
			
			// all of the if's above show if the postal code has a letter as the first character, then a number, then a letter, then a number, then a letter
		}
		else
		{
			throw new InvalidInputException(" Please Enter a valid postal code");
		}
	}
	
	

public String getPostalName()
{
	return this.postalName;
}



//the phone number of student

public void setNumName(long nname) throws InvalidInputException
{
	
		if( nname<9999999999.0&& nname>1000000000.0)
			// makes sure that it is a valid phone number
		{
			this.numName=nname;
			// sends the info back to class Student
			
		}
		else
		{
			throw new InvalidInputException("Please enter a valid phone number");
			
		}
		}
public long getNumName()
{
	return this.numName;
}



//the birthday of student

public void setDateName(String dname)
{
	this.dateName=dname;
}
public String getDateName()
{
	return this.dateName;
}

public Student(String firstName, String lastName,String streetAddress,String city, String provName,String postalName,long numName,String dateName) throws InvalidInputException

{
	setFirstName(firstName);
	setLastName(lastName);
	setStreetAddress(streetAddress);
	setCity(city);
	setProvName(provName);
	setPostalName(postalName);
	setNumName(numName);
	setDateName(dateName);
}


public String toString(){
	return firstName+","+lastName+","+streetAddress+","+studentNumber +","+ city + ","+ provName +","+ postalName+","+numName+","+ dateName ;
}

@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}
}





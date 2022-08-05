
public class Doctor
{
	private int regNo;
	public String dName,speciality;
	Doctor(){
		System.out.println(" Iam in default constructor of Parent");
	}
	Doctor(int r,String n,String s)
	{
		System.out.println(" Iam in Para constructor of Parent");
		regNo = r;
		dName = n;
		speciality = s;
	}
	protected void makedignosys(String symptopus)
	{
		System.out.println(" According to symptompus  "+ symptopus + "diagnosys is done  ");
	}
	public void setRegNo(int r)
	{
		regNo = r;
	}
	public void setDName(String r)
	{
		dName = r;
	}
	public void setSpeciality(String r)
	{
		speciality = r;
	}
	public String toString()
	{
		return regNo+ " , "+ "Dr." +dName+" is with Speciality -"+speciality;
	}
	
}

class Surgone extends Doctor
{
	int experience;
	String surgeryspeciality;
	public Surgone() {
		System.out.println(" Iam in default constructor of Child");
		// TODO AuHto-generated constructor stub
	}
	public void makedignosys(String y)
	{
		System.out.println("Taken sencond opinon taken for " + y);
		super.makedignosys("Right hand pain");

	}
	Surgone(int e,String s1)
	{
		System.out.println(" Iam in para constructor of Parent");
		experience = e;
		surgeryspeciality = s1;
	}
	public void doSurgery()
	{
		System.out.println("Operation done successfully");
	}
	public String toString()
	{
		return "Dr."+dName + " is specislist in "+speciality + " and with experience"
				+experience+"\n Dr. is expert in "+surgeryspeciality ;
		
	}
}




class Hospital
{
	private int noOfBeds;
	private String hName,location;
	private Doctor doc;
	public Hospital() {}
	public Hospital(int b,String hn,String l , Doctor d)
	{
		noOfBeds = b;   hName=hn;location=l;
		doc=d;
	}
	public void setDoc(Doctor d)
	{
		doc=d;
	}
	public void setNoOfBeds(int b)
	{
		noOfBeds=b;
	}
	public void setHName(String b)
	{
		hName=b;
	}
	public void setLocation(String b)
	{
		location=b;
	}
	
	public String toString()
	{
		return hName+ " contains "+ noOfBeds + " beds , located at "+location
				+"DOctor details : \n" + doc;
	}
	
}
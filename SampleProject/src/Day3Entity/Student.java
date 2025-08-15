package Day3Entity;

public class Student {
	private int sid;
	private String sname;
	
	//Default constructor
	public Student()
	{
		System.out.println("Constructor Called...");
	}
	//parameterized constructor
	public Student(int id,String sname)
	{
		//this();calling default constructor
		this.sid=sid;
		this.sname=sname;
		}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}

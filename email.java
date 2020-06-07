package emailapp;
import java.util.*;

public class email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxcapacity=500;
	private String email;
	//private int defaultpasswordlength=10;
	private String alternateemail;
	private String company="company.com";
	
	//constructor to firstname and last name
	public email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		//System.out.println("email created:"+this.firstname+" "+this.lastname);
		
		
		//call a method asking for department -return department
		this.department=setdepartment();
		//System.out.println("department:"+ this.department);
		
		
		//call a method to return random password
		this.password=randompassword(10);
		System.out.println("your password:"+this.password);
		
		//combine elements to generate email
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+company;
		//System.out.println("your email:"+email);
	}
	//ask for the department
	private String setdepartment() {
		System.out.println("New worker:"+firstname+"Enter Department code: \n1 for sales\n2 for development\n3 for accounting\n0 Enter the department code:");
		Scanner in=new Scanner(System.in);
		int deptchoice=in.nextInt();
		if(deptchoice==1) {
			return "sales";
		}
		else if(deptchoice==2) {return "dev";}
		else if(deptchoice==3) {return "acc";}
		else {return "";}
	}
	
	//random password
	private String randompassword(int length) {
		String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789#$@";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setmailbox(int capacity) {
		this.mailboxcapacity=capacity;
		
	}
	
	//set the alternate mail
	public void setalternateemail(String altemail) {
		this.alternateemail=altemail;
		
	}
	
	//change the password
	public void changepassword(String password) {
		this.password=password;
		
	}
	public int getcapacity() {return mailboxcapacity; }
	public String getalternate() {return alternateemail;}
	public String getpassword() {return password;}
	
	public String showinfo() {
		return "NAME:"+firstname+" "+lastname+
				"\nEMAIL:" +email +
				"\nMAILBOX CAPACITY:"+mailboxcapacity;
				
	}
}

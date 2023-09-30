package tnsc25;

public class main extends Employee{
	
	public main(int Empid,String Empname) {
		super(Empid,Empname);
	}
	
	public static void main(String[]args) {
		manager m1=new manager(111,"KAVIYA","IT");
		
		m1.display();
		
		Technician t1=new Technician (112,"CHARU","JAVA");
		t1.display();
	}

}


package Inheritance;
//Multi high rarical
public class Mainone {

	public static void main(String[] args) {
		Faculty b =new Faculty();
		Student c = new Student();
               b.ravi();		  
               b.RaviTwo();
		        c.ravi();
	            c.Ravione();
               
	}
}
class Regristion{
	 void ravi() {
		 System.out.println("First Name");
		 System.out.println("Last Name");
		 System.out.println("Email");
		 System.out.println("Date of Birth");
		 System.out.println("Gender");
		 System.out.println("contect number");
		 System.out.println("Adhar number");
	 }
}
	 class Student extends Regristion {
		 void Ravione() {
			 System.out.println("Regrition Number");
			 System.out.println("Department name");
			 System.out.println("course");
			 System.out.println("Date of join");
			 System.out.println("Date of leaving");
		 }
	 }
	 
	 
		 class Faculty extends Regristion{
			 void RaviTwo() {
				 System.out.println("Faculty Number");
				 System.out.println("Department");
				 System.out.println("Subject");
				 System.out.println("Experience");
				 }
			 }
	

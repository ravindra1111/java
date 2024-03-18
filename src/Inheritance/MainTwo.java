package Inheritance;

public class MainTwo {
	//multilevel 

	public static void main(String[] args) {
		Facultys c = new Facultys();
                c.ravi();
	            c.Ravione();
	            c.RaviTwo();
               
	}
}
class Regristions{
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
	 class Students extends Regristions {
		 void Ravione() {
			 System.out.println("Regrition Number");
			 System.out.println("Department name");
			 System.out.println("course");
			 System.out.println("Date of join");
			 System.out.println("Date of leaving");
		 }
	 }
	 
	 
		 class Facultys extends Students{
			 void RaviTwo() {
				 System.out.println("Faculty Number");
				 System.out.println("Department");
				 System.out.println("Subject");
				 System.out.println("Experience");

	}

}

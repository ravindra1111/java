package Method;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading ravi = new Methodoverloading();
		ravi.display();
		ravi.display();
		ravi.display("HELLO", 70);

	}
	static void display() {
		System.out.println("Ravi");
	}
	
 static int display(int a) {
		System.out.println(a);
		return a;
	}

 static void display(String d ,int a) {
	 System.out.println(d);
	 System.out.println(a);
	
 }
		
		
	}
	


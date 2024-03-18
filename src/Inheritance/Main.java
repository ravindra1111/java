package Inheritance;
//single level
public class Main {

	public static void main(String[] args) {
		child f=new child();
		f.ravi();
		f.ram();

	
	}
	}
	class parent{
		void ravi() {
		System.out.println("MY IS M.RAVEENDRANATH");
		
	}}
	class child extends parent{
		void ram() {
		System.out.println("MY MAJJI");
	}

}


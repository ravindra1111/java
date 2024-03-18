package ExceptionHandling;

public class ExceptionHandling {
	public static void main(String[] args) {
		 ravi() ;
		 ravione();
	}
	 static	void ravi() {
		 int a= 10,b=20,c=0;
		 try {
			 System.out.println(a+b+c);
			 System.out.println(a/c);
		}
		 catch(Exception e) {
			 System.out.println(e);
			 System.out.println(a+c);
			 System.out.println( b/a);
		 }
		  
		  finally {
			  System.out.println("End of the program");
			  System.out.println("IT'S over");
		  }}
		 static void ravione(){
			 int a=80,b=50,f=0;
			 try {
				 System.out.println(a+b+f);
				 System.out.println(a/f);
			 }
			 catch(Exception e) {
				 System.out.println(e);
				 System.out.println(a+b+f);
				 System.out.println(b);
			 }
			 finally {
				 System.out.println("This task is completed");
			 }
		 }}
			 
			 
		 
	 
			 
		 






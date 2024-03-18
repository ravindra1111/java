package Abstract;
//method overriding-2
public class Superclass {

	public static void main(String[] args) {
		Child h=new Child();
		System.out.println(h.ravione());
		System.out.println(h.ravi());
		System.out.println(Child.ravi());
	    System.out.println(new Child().ravione());

	}

}

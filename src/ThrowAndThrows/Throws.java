package ThrowAndThrows;

public class Throws {
	static void  checkage(int age) throws {
		if(age<18) {
		throw new System.out.println("you are eligible to vote");
		}
		else {
		System.out.println("you have not rigth to vote");
		}
	}


	public static void main(String[] args) {
		checkage(15);


	}

}

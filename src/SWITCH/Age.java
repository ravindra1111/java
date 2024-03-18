package SWITCH;
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {

	    int age;
	    Scanner ravi = new Scanner(System.in);
	    System.out.println("enter your age:");
	    age = ravi.nextInt();
	    switch (age) {
	        case 1:
	            System.out.println("you are  18");
	            break;
	        case 2:
	            System.out.println("you are 27");
	            break;
	        case 3:
	            System.out.println("you are 30");
	            break;
	        default:
	            System.out.println("you are 40");
	            break;
	    }
	}

	}


package SWITCH;
import java.util.Scanner;
public class Months {
public static void main(String[] args) {
	int m;
	Scanner ravi=new Scanner(System.in);
	System.out.println("Enter the Month:");
	m=ravi.nextInt();
	switch (m){
	case 1:{
	System.out.println("The 1st month is january");
	}
	break;
	case 2:{
		System.out.println("The 2nd month is febuary");
	}
	break;
	case 3:{
		System.out.println("The 3rd month is march");
	}
		break;
	case 4:{
		System.out.println("The 4th month is Aprial");
	}
		break;
	case 5:{
		System.out.println("The 5th month is May");
	}
		break;
	case 6:{
		System.out.println("The 6th month is june");
	}
		break;
	case 7:{
		System.out.println("The 7th month is july");
	}
		break;
	case 8:{
		System.out.println("The 8th month is Augest");
	}
		break;
	case 9:{
		System.out.println("The 9th month is septemeb");
	}
		break;
	case 10:{
		System.out.println("The 10th month is october");
	}
		break;
	case 11:{
		System.out.println("The 11th month is November");
	}
		break;
	case 12:{
		System.out.println("The 12th month is Becember");
	}
		break;
	
	default :{
	System.out.println(" Give the values below -12 only");
	}
	break;
}
}
}
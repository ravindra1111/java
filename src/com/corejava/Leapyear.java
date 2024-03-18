package com.corejava;

public class Leapyear {

	public static void main(String[] y) {
			int year=Integer.parseInt(y[0]);
		if((year%4==0 & year%100!=0)||(year%400==0))
			System.out.println("This is a leap year:");
		else
			System.out.println("This is not  a leap year:");
		}
	// TODO Auto-generated method stub

}



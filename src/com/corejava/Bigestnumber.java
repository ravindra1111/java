package com.corejava;

public class Bigestnumber {
	public static void main(String[] y){
		int a=Integer.parseInt(y[0]);
		int b=Integer.parseInt(y[1]);
		int c=Integer.parseInt(y[2]);
		if(a>b&&a>c)
		System.out.println("It is the largest number="+a);
		else if(b>c)
		System.out.println("It is the largest number="+b);
		else
		System.out.println("It is the largest number="+c);
		}

}

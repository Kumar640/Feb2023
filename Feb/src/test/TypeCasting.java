package test;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***Implicit Type Casting***");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Char for Implicit Conversion ");
		char ch=sc.next().charAt(0);
		int i=ch;
		System.out.println("Value of Integer Type Casting "+i);
		float f=ch;
		System.out.println("Value of Float Type Casting "+f);
		long l=ch;
		System.out.println("Value of Long Type Casting "+l);
		double d=ch;
		System.out.println("Value of Double type Casting "+d);
		System.out.println("\n");
		System.out.println("***Explicit Type Casting***");
		System.out.println("Enter the Value for Explicit Type Casting");
		Scanner sc1=new Scanner(System.in);
		double d1=sc1.nextDouble();
		int x=(int)d1;
		System.out.println("Value of Int is "+x);
		float y=(float)d1;
		System.out.println("Value of Float is "+y);
		long l2=(long)d1;
		System.out.println("Value of Long is "+l2);
		char c=(char)d1;
		System.out.println("Value in Char is "+c);
	}

}

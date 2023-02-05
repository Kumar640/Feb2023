package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int fact=1,i=1,no;
		System.out.println("Enter the Valur for Factorial");
		no=input.nextInt();
		while(i<=no)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial no of "+no+ " is "+fact);
		input.close();
	}

}

package test;

import java.util.Scanner;

public class MathsTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int table,stop;
		int i=1;
		System.out.println("Enter the Number for Table");
		table=input.nextInt();
		System.out.println("Enter the Number till where you want the table count");
		stop=input.nextInt();
		System.out.println("Table of Given Number is "+table);
		while(i<=stop) 
		{
			System.out.println(table+ " * "+i+" = "+(i*table));
			i++;
		}
		input.close();
	}

}

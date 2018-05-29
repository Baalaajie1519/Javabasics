package com.basics;

public class OperatorsExample {

	public static void main(String args[])
	{
		int count=40;
		count++;
		
		
		count--; 
		int negcount=-30;
		boolean isFalse = true;
		//Unary Operator
		System.out.println(!isFalse);
		
		//Relational operators
		System.out.println(count>15);
		System.out.println(count<20);
		
		System.out.println(count>=35);
		System.out.println(count<=25);
		
		//Equality
		System.out.println( count==40);
		System.out.println( count!=30);
	}
	
}

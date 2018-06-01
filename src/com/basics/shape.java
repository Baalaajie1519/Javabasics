package com.basics;

public class shape {
 double side;
 double length;
 double breadth;
 public shape(double side)
 {
	 this.side=side;
 }
  public shape(double length,double breadth)
 {
	 if(length>0.0 && length<20.0 && breadth>0.0 && breadth<20.0) {
		 this .length= length;
		 this . breadth= breadth;
	 } else {
		 System.out.println("Sorry the number should be in limit of 0.0 to 20.0");
	 }
	 }
 public double findAreaofrectangle()
 {
	 return  length*breadth;
 }
	public static void main(String[] args)
	{
		shape square=new shape(5.1);
		shape rectangle=new shape(9.2,3.5);
		System.out.println(rectangle.findAreaofrectangle());
	}
 }

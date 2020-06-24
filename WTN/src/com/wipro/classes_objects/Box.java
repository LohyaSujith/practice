 /*Create aclass Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box.
		 Create an object of the Box class and test the functionalities. */
package com.wipro.classes_objects;
public class Box {
	double length,breadth,height;
	Box(double length,double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
	}
	void display()
	{
		System.out.println(length*breadth*height);
	}
	public static void main(String [] args)
	{
		Box obj=new Box(2.3,3.5,4.5);
		obj.display();
	}
}

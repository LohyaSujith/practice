/*Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints �Drawing Shape� and �Erasing Shape� respectively.

For this class, create three sub classes, Circle, Triangle and Square and each class should override the parent class functions - draw () and erase (). 

The draw() method should print �Drawing Circle�, �Drawing Triangle� and �Drawing Square� respectively.
The erase() method should print �Erasing Circle�, �Erasing Triangle� and �Erasing Square� respectively.

Create objects of Circle, Triangle and Square in the following way and observe the polymorphic nature of the class by calling draw() and erase() method using each object.

Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square(); */

package com.wipro.ploymorphism;
	class shape{
		void draw()
		{
			System.out.println("Drawing Shape");
		}
		void erase()
		{
			System.out.println("Erasing Shape");
		}
	}
	class Triangle extends shape{
		void draw()
		{
			System.out.println("Drawing Triangle");
		}
		void erase()
		{
			System.out.println("Erasing Traingle");
		}
	}
	class Circle extends shape{
		void draw()
		{
			System.out.println("Drawing Circle");
		}
		void erase()
		{
			System.out.println("Erasing Circle");
		}
	}
	class Square extends shape{
		void draw()
		{
			System.out.println("Drawing Square");
		}
		void erase()
		{
			System.out.println("Erasing Square");
		}
	}
	public class Polymorphism2 {
		public static void main(String [] args)
		{
			shape c=new Circle();
			shape t=new Triangle();
			shape s=new Square();
			c.draw();
			c.erase();
			t.draw();
			t.erase();
			s.draw();
			s.erase();
		}
}

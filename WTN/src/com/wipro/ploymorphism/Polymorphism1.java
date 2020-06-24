/*Create  a base class Fruit with name ,taste and size as its attributes. 

Create a method called eat() which describes the name of the fruit and its taste. 

Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste. */





package com.wipro.ploymorphism;
class Fruit{
	String name,taste;
	int size;
	 void Fruit(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+""+taste);
	}
}
class Apple extends Fruit{
	Apple(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}
class Orange extends Fruit{
	Orange(String name,String taste,int size)
	{
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
	void eat()
	{
		System.out.println(name+" "+taste);
	}
}
public class Polymorphism1 {
	public static void main(String[] args)
	{
		Apple a=new Apple("apple","sweet",10);
		Orange o=new Orange("orange","sour",20);
		a.eat();
		o.eat();
	}
}

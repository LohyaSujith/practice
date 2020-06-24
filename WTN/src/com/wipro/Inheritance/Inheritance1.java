package com.wipro.Inheritance;
class Animal {
//public Animal() {
    //System.out.println("A new animal has been created!");
//}   
public void sleep() {
    System.out.println("An animal sleeps...");
}
public void eats() {
    System.out.println("An animal eats...");}
}
class Bird  extends Animal {

//public Bird() {
    //System.out.println("A new bird has been created!");
//}
public void sleep() {
    System.out.println("A bird sleeps...");
}
public void eats() {
    System.out.println("A bird eats...");
}
public void fly() {
    System.out.println("A bird flies...");
}
}
public class Inheritance1 {
	public static void main(String [] args)
	{
		Animal obj1=new Animal();
		Bird obj2=new Bird();
		obj1.sleep();
		obj1.eats();
		obj2.sleep();
		obj2.eats();
		obj2.fly();
	}
}




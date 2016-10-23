package com.test.practice;

public class B extends A{

	public void display(){
		super.display();
		System.out.println("modified display()");
	}
	public void king(){
		System.out.println("King()");
	}
}

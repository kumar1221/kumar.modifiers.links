package com.Interview.access_modifiers1;

//1> we can't create an object of a class in other package which is having default access modifier 
//2> the (private, protected, default) var or methods can't be accessed in other package classes 

//import com.Interview.access_modifiers.Base;
import com.Interview.access_modifiers.Parent;

public class OtherPackageClass {

	public static void main(String[] args) {

		Parent p = new Parent();

		System.out.println("Class Having Public Access modifier in other package \n");
		// System.out.println("The private var a is :"+ p.a);
		// System.out.println("The protected var c is :" + p.c);
		// System.out.println("The default var d is :" + p.d + "\n");
		System.out.println("The public var b is :" + p.b);

		// p.privateAdd();
		// p.protectedMul();
		// p.defaultDiv();
		p.publicSub();

		// System.out.println(p.a);
		p.setA(100);
		p.getA();

		// Base b = new Base();

		System.out.println("Class Having Default Access modifier in other package");

		// System.out.println("The private var a is :"+ b.a);
		// System.out.println("The public var b is :" + b.b);
		// System.out.println("The protected var c is :" + b.c);
		// System.out.println("The default var d is :" + b.d + "\n");

		// b.privateAdd();
		// b.publicSub();
		// b.protectedMul();
		// b.defaultDiv();

		// System.out.println(b.a);
		// b.setA(200);
		// b.getA();

	}
}
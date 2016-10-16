package com.Interview.access_modifiers;


/*
1> Classes can have only  public and default modifiers.
2> (var & methods) can have all access modifiers(Private, public, protected, default).
3> private access modifiers can be accessed only with in the class.
4> public access modifiers can be accessed every where.
5> protected access modifiers can be accessed within the package and child class of other packages.
6> Default access modifiers can be accessed only within the package.

7> If we use protected modifier before variable or method in parent class these can be accessed either by using child class or
   parent reference in the same package.
8> If we use protected modifier before variable or method in parent class these can be accessed by only using child class 
   Reference if the child class is in other package.   
   
9> We cannot inherit a class which is  having default access modifiers in other package 
10> We can't create an object of a class in other package which is having default access modifier 

*/

public class MainClass {

	public static void main(String[] args) {

		Parent p = new Parent();

		System.out.println("Class Having Public Access modifier");
		// System.out.println("The private var a is :"+ p.a);
		System.out.println("The public var b is :" + p.b);
		System.out.println("The protected var c is :" + p.c);
		System.out.println("The default var d is :" + p.d + "\n");

		// p.privateAdd();
		p.publicSub();
		p.protectedMul();
		p.defaultDiv();

		// System.out.println(p.a);
		p.setA(100);
		p.getA();

		Base b = new Base();

		System.out.println("Class Having Default Access modifier");

		// System.out.println("The private var a is :"+ b.a);
		System.out.println("The public var b is :" + b.b);
		System.out.println("The protected var c is :" + b.c);
		System.out.println("The default var d is :" + b.d + "\n");

		// b.privateAdd();
		b.publicSub();
		b.protectedMul();
		b.defaultDiv();

		// System.out.println(b.a);
		b.setA(200);
		b.getA();

	}
}

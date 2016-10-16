package com.Interview.access_modifiers;

//if we use protected modifier before variable or method  in parent class these can be accessed either by using child class or
//parent reference in the same package

import com.Interview.access_modifiers.Parent;

public class ParentChild extends Parent {

	public static void main(String[] args) {

		Parent p = new Parent();
		ParentChild c = new ParentChild();

		System.out.println(" Parent Class Having Public Access modifier in same package");
		// System.out.println("The private var a is :"+ p.a);

		System.out.println("The default var d is :" + c.d + "\n");
		
		
		System.out.println("The protected var c is :" + p.c);
		System.out.println("The protected var c is :" + c.c);
		
		System.out.println("The public var b is :" + p.b);
		System.out.println("The public var b is :" + c.b);

		// p.privateAdd();
		// p.defaultDiv();
		// p.protectedMul();
		c.protectedMul();
		p.publicSub();
		c.publicSub();

		// System.out.println(p.a);
		p.setA(100);
		c.getA();
		p.getA();

	}

}

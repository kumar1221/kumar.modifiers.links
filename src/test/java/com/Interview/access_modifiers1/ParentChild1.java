package com.Interview.access_modifiers1;

// if we use protected modifier before variable or method  in parent class these can be accessed by only using child class 
// reference in the other package

import com.Interview.access_modifiers.Parent;

public class ParentChild1 extends Parent {

	public static void main(String[] args) {

		Parent p = new Parent();
		ParentChild1 c = new ParentChild1();

		System.out.println("Class Having Public Access modifier in other package");
		// System.out.println("The private var a is :"+ p.a);
		// System.out.println("The default var d is :" + c.d + "\n");
		
		//System.out.println("The protected var c is :" +p.c);    
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

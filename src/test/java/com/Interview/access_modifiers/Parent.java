package com.Interview.access_modifiers;

// Class can have only  public and default modifiers

public class Parent {

	private int a = 10;
	public int b = 20;
	protected int c = 30;
	int d = 40;

	@SuppressWarnings("unused")
	private void privateAdd() {
		System.out.println(a);
	}

	public void publicSub() {
		System.out.println("publicSub() :"+2);
		System.out.println(c);
	}

	protected void protectedMul() {
		System.out.println("protectedMul :"+3);
	}

	void defaultDiv() {
		System.out.println("defaultDiv() :"+4);
	}

	public int getA() {
		System.out.println("getA() :"+a+"\n");
		return a;
	}

	public void setA(int a) {
		this.a = a;

	}

}

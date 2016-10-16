package com.Interview.access_modifiers;

// Class can have only  public and default modifiers

class Base
{

	private int a = 50;
	public int b = 60;
	protected int c = 70;
	int d = 80;

	@SuppressWarnings("unused")
	private void privateAdd(int a)
	{
		System.out.println(a);
	}


	public void publicSub()
	{
		System.out.println("publicSub() :"+2);
	}

	protected void protectedMul() 
	{
		System.out.println("protectedMul :"+3);
	}

	void defaultDiv() 
	{
		System.out.println("defaultDiv() :"+4);
	}

	public int getA() 
	{
		System.out.println("getA() :"+a);
		return a;
	}

	public void setA(int a)
	{
		this.a = a;
	}
}

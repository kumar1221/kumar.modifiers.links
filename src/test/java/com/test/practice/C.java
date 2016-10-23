package com.test.practice;

public class C {

	int h;
	int d;
	public C(){
		h = 80;
		d = 20;
	}
	public C(int h){
		this.h = h;
		this.d = 20;
	}
	public C(int h,int d){
		this.h = h;
		this.d = d;
	}
	public void f(){
		System.out.println(h+"  :  "+d);
	}
	public static void main(String[] args) {
	
	C	c  = new C(60,70);
	
	c.f();
		c = null;
		c.f();
	}

}

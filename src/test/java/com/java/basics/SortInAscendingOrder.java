package com.java.basics;

import java.util.Scanner;

public class SortInAscendingOrder {
	
	static int a,b,c,d,e,num;
	static int cnt =0;
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of integers : 5");
		num = input.nextInt();
		System.out.println("Enter "+ num + "Numbers");
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		input.close();
		
		for(int i=0;cnt!=5;i++){
			if(i==a || i == b ||i == c ||i == d ||i == e ){
				
				
				System.out.println("\t" + i);
				cnt++;
				
			}
		}
		
	}
	

}

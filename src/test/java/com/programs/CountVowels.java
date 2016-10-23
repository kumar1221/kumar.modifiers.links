package com.programs;

import java.util.Scanner;

public class CountVowels {
	
	public String name;
	Scanner in;
	char vowel;
	int cnt = 0;
	
	
	public static void main(String[] args){
		
		CountVowels c = new CountVowels();
	    c.vowelCount();
	
	}
	
	public void vowelCount(){
		
		System.out.println("Enter the String ");
		in = new Scanner(System.in);
		name = in.nextLine();
		for(int i=0;i<name.length();i++){
			vowel =name.charAt(i);
			if((vowel=='a')||(vowel=='e')||(vowel=='i')||(vowel=='o')||(vowel=='u'))
				cnt++;
		}
		System.out.println("The Total no of Vowels is :"+ cnt);
		System.out.println("The Total no of Constants is :"+ (name.length()-cnt));
	}

}

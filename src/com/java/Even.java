package com.java;

import java.util.Scanner;

public class Even {
	
	public static void main(String[]args) {
		int b=2;
		int c=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		
		int a=sc.nextInt();
		
		
		if(a%2==0) {
			System.out.println(b);
		}
		else
			System.out.println(c);
	}

}

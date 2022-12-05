package com.java;

import java.util.Scanner;

public class LatDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		
		int a=sc.nextInt();
		int num2;
		
		num2=a%10;
		   System.out.println(num2);
		   if(num2<0)
			   System.out.println(num2*-1);
			   else {
				   System.out.println(num2);
			   }
		
	}

}

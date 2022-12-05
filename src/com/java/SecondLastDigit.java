package com.java;

import java.util.Scanner;

public class SecondLastDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		
		int a=sc.nextInt();
		if(a<0) {
			a=a*-1;
		}
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter b value");
		
		int b=sc.nextInt();
		
		if(b<0) {
			b=b*-1;
		}
		int num1;
		int num2;
		
		num1=a%10;
		num2=b%10;
		
		int num3=num1+num2;
		System.out.println(num3);
		
	}
}


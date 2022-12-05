import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  a value ");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("and enter b value");
		
		int a=sc.nextInt();
		int b=sc1.nextInt();
		
		if(a>b) {
			System.out.println("Grater number is "+a);
		}
		else {
			System.out.println("Grater number is "+b);
		}
	}

}

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int number=sc.nextInt();
		
		if (number>0) {
			System.out.println(number + "number is positive");
		}
		else if  (number==0) {
			System.out.println(number + "number is zero");
		}
		else {
			System.out.println(number + "number is negative");
		}

	}

}

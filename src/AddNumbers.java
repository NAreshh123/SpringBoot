import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("enter  a value ");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("and enter b value");
		
		int a=sc.nextInt();
		int b=sc1.nextInt();
		int c=a+b;
		
		if(c%2==0) {
			System.out.println(c+" Number is even");
		}
		else {
			System.out.println(c+" Number is odd");
		}


	}

}

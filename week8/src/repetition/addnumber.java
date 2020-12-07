package repetition;

import java.util.Scanner;

public class addnumber {

	public static void main(String[] args) {
		
		int value;
		int sum=0;
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter first integer (enter 0 to quit): ");
		value=scan.nextInt();
		
		while(value!=0) {
			sum=sum+value;
			
			System.out.print("Enter next integer (enter 0 to quit): ");
			value=scan.nextInt();
		}
		System.out.println("SUM of the integers : "+sum);
	}

}

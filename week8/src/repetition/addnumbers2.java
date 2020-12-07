package repetition;

import java.util.Scanner;

public class addnumbers2 {

	public static void main(String[] args) {
		
		int value;
		int sum=0;
		char choice;
		
		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.print("Enter a integer : ");
			value=scan.nextInt();
			
			sum = sum+value;
			
			System.out.print("Enter Y for yes or N for no: ");
			choice = scan.next().charAt(0);
		}while(choice=='y' || choice=='Y');
		
		System.out.println("SUM of the integers : "+sum);
	}
		
}

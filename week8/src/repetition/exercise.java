package repetition;

public class exercise {

	public static void main(String[] args) {

// exercise1	
		int choice=1 , total=0;
		while(choice<4) {
			total=choice++; // increase the choice and put it in the total variable
			System.out.print(total);
		}	
			System.out.println("");

	
// exercise2		
		for(int number=2;number<20;number++) {
			number=number*2;  // number multiply by 2 
			if(number<15) {   // if the number is less than 15, then print out the number
				System.out.println(number); // the number is equal to 4, then the number will increase +1 become 5
			}
		}
		System.out.println("");
		
// exercise3		
		int i=1;
		 do {	
			   if ((i % 2)== 0)
				System.out.print(i);
			   i++;
		    } while(i<5);
		
	
	


		
	
	}
}

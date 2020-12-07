package repetition;

public class SumAverageRunningInt {

// for loop	
	public static void main(String[] args) {
		
	int sum=0 ;
	double average;
	int lowerbound = 1;
	int upperbound = 100;
	
	for(int number=lowerbound;number<=upperbound;++number) {
		sum=number+sum;
		
	}
	System.out.println("The sum of 1 to 100 is "+ sum);
	average=(double)sum/((upperbound-lowerbound)+1);
	System.out.println("The average is " +average);
		
System.out.println("");		

// while loop		
	int sum1=0 ;
	double average1;
	int lowerbound1 = 1;
	int upperbound1 = 100;
	int number1=lowerbound1;
	
	while( number1<=upperbound1) {
		sum1=sum1+number1;
	++number1;
	}
	System.out.println("The sum of 1 to 100 is "+ sum1);
	average1=(double)sum1/((upperbound1-lowerbound1)+1);	
	System.out.println("The average is " +average1);
		
	System.out.println("");		

//do- while loop			
	int sum2=0 ;
	double average2;
	int lowerbound2 = 1;
	int upperbound2 = 100;
	int number2=lowerbound2;
	
	do {
		sum2=sum2+number2;
		++number2;
	}while( number2<=upperbound2);
		
	System.out.println("The sum of 1 to 100 is "+ sum2);
	average2=(double)sum2/((upperbound2-lowerbound2)+1);	
	System.out.println("The average is " +average2);
		
	System.out.println("");			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

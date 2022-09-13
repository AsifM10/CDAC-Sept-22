// factorial of a number using recursion.

import java.util.*;

class FactRecur{

	public static void main(String args[]){
	
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		
		int fact= factorial(num);
		System.out.println("The factorial of "+num+" is "+fact);
	}


	public static int factorial(int num)
	{
		if(num>=1)
			return num * factorial(num-1);
		else
			return 1;
	}
}
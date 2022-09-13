// WAP to find the factorial of a given number

import java.util.Scanner;

class Factorial{

	public static void main(String args[])
{
		int n,fact=1;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		n=num;
		
		while(num!=0)
		{
		
			fact= fact*num;
			num--;
		}
		
		System.out.println("The factorial of "+n+" is "+fact);

}
}
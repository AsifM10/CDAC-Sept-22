// write a program to print the digits of a given number.

import java.util.Scanner;

class Digits{

	public static void main(String args[]){
	
		int count=0,n;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		n=num;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("The number "+n+" contains "+count+" digits");
	
	}
}
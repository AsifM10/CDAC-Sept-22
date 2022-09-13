// write a java program to reverse a given number.

import java.util.Scanner;

class Reverse{

	public static void main(String args[]){
	
		Scanner scan= new Scanner(System.in);
		int num=scan.nextInt();
		int r=0;
		System.out.println("The original no. is "+num);
		
		while(num!=0)
		{
			int d=num%10;
			r= r*10 + d;
			num=num/10;
		}
		System.out.println("The reversed number is "+r);
	}
}
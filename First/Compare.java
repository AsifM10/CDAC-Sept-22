//WAP to find smallest of the 3 numbers.

import java.util.Scanner;
class Compare{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();		
		if(a<b)
		{
			if(a<c)
			System.out.println("the smallest no. is "+a);
		else
			System.out.println("the smallest no. is "+c);		
		}
		else
		if(b<c)
		System.out.println("the smallest no. is "+b);
		else
		System.out.println("the smallest no. is "+c);	
	}
}
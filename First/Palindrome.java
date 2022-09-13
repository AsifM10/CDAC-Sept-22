// Check whether the given number is palindrome or not.

import java.util.Scanner;
class Palindrome{

	public static void main(String args[]){
	
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int r=0;
		int a=num;
		while(num!=0)
		{
			int digit=num%10;
			r=r*10+digit;
			num=num/10;
		}
		
		if(a==r)
		System.out.println("The number is palindrome");
		else
		System.out.println("The number is not palindrome");
	}
}
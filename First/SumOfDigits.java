//  WAP of sum of digits of given number.

import java.util.Scanner;

class SumOfDigits{

	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	int num= scan.nextInt();
	int n=num;
	int sum=0,a;
	
	while(num!=0)
	{
		a=num%10;
		sum=sum+a;
		num=num/10;
	}
		System.out.println("the sum of digits of "+n+" is "+sum);
	}

}
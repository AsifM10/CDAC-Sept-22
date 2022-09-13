// WAP to find GCD of two numbers.

import java.util.Scanner;
class GCD{

	public static void main(String args[]){
	
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int gcd=1;
	
	for(int i=2; i<=num1 && i<=num2; i++)
	{
	if(num1%i==0 && num2%i==0)
			{
				gcd=i;
				}
		}
		System.out.println("the GCD of "+num1+" and "+num2+" is "+gcd);
	} 
}
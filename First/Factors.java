// WAP to find factors of given number.

import java.util.Scanner;

class Factors{

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		
		System.out.print("The factors of "+num+" are: ");
		
		for(int i=1;i<=num;i++){
			
			if(num%i==0)
			System.out.print(i+" ");
			}
		
		
	}
}
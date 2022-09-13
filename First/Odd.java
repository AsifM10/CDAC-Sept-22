// write a program to print odd number series

import java.util.Scanner;
class Odd{

 public static void main(String args[]){
 
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number you want even no. to be printed");
	int num=scan.nextInt();
	
	for(int i=1; i<=num; i++)
	{
		System.out.println(i);
		++i;
		
	
	}
 }
}
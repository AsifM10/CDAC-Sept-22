// Add two numbers without using arithmetic opr

import java.util.Scanner;

class Add{

	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int count=0;
	
	while(a!=0 || b!=0)
	{
		count++;
		if(a!=0)
			a--;
		else
			b--;
	}
	
	System.out.println(count);
	}
}
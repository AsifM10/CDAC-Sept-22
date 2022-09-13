// check whether the entered year is leap year or not,.

import java.util.Scanner;

class Leap{

public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the Year: ");

	int y = sc.nextInt();
	
	if ((y%4==0 && y%100!=0) || y%400 == 0  )
	
	 System.out.println("Year is Leap Year ");
	
	
	else 
	System.out.println("Non leap year");
	}

}

import java.util.Scanner;
 class PE{
 
	public static void main(String args[]){
	
	Scanner scan = new Scanner(System.in);
	int num= scan.nextInt();
	
	if(num==0)
	System.out.println("The entered number is zero!");
	else if(num>0)
	System.out.println("The entered number is positive!");
	else
	System.out.println("The entered number is negative!");
	}
 }
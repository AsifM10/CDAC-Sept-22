// check whether the number is Even or Odd
import java.util.Scanner;

class Evenodd{

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%2==0)
		System.out.println("The number is even");
		else
		System.out.println("The number is odd");
	}
}
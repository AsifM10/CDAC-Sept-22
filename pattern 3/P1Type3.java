import java.util.*;
class P1Type3{
	
	public static void main(String args[])
	{
	Scanner scan= new Scanner(System.in);
	int rows= scan.nextInt();
	
	for(int i=1; i<=rows; i++)
	{
		for(int s=rows-1; s>=i; s--)
		{
			System.out.print(" ");
		}
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+" ");
			}
		System.out.println();
		
		}
	}
}
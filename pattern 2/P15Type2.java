import java.util.Scanner;

class P15Type2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows to print");
		int row=scan.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0) 	System.out.print("*");
				else if(i==row-1)
					System.out.print("*");
				else if(i==j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}

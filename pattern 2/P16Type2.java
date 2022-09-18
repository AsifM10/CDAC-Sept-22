import java.util.Scanner;

class P16Type2
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number of rows ");
		int row=scan.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<row;j++)
			{
				if(j==row-1)
				System.out.print("*");
				else if(i==row)
				System.out.print("*");
				else if((j+i)==row)
				System.out.print("*");
				else
					System.out.print(" ");
							
			}
			if(i!=row)
				System.out.println();
		}
	}
}


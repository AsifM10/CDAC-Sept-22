import java.util.Scanner;

class P4Type3
{
	public static void main(String []args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number of rows want to print");
		int row =scan.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int s=row;s>i;s--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print(j+" ");
			}
			
			for(int j=i;j>0;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
	}
}
import java.util.Scanner;

class P5Type3
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number of rows");
		int row =scan.nextInt();
		for(int i=row;i>0;i--)
		{
			for(int s=1;s<i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
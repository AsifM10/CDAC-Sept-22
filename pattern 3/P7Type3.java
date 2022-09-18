import java.util.Scanner;

class P7Type3
{
	public static void main(String[] args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a number of rows to print");
		int row=scan.nextInt();
		for(int i=row;i>0;i--)
		{
			for(int s=i;s<row;s++)
				System.out.print(" ");
			for(int j=0;j<i;j++)
				System.out.print(i+" ");
			System.out.println();
			
		}
	}
}
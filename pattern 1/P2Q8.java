class P2Q8{

public static void main(String args[]){
	
	for(int i=1;i<5;i++)//rows
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	for(int i=1;i<=5;i++)
	{
		
		for(int j=5;j>=i;j--)//col
		{
			System.out.print("*");
			
		}
		
		System.out.println();
	}
	
	
	
} 
}
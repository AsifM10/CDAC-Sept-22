class P11{

	public static void main(String args[]){
	
	for(int i=1; i<=5; i++) //row
	{
		for(int s=4; s>=i; s--)  //space
			
			System.out.print(" ");
		
			
			for(int j=1; j<=i; j++) //column
			{
				System.out.print("*");
			}
			for(int j=0; j<i-1; j++)
			{
				System.out.print("*");
			}
		System.out.println();
	}
	
	}

}
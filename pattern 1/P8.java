class P8{
	public static void main(String args[]){
	
	for(int i=5; i>=1; i--) //Row
	{
		
		for(int s=1; s<=i; s++)		//space
		{
			System.out.print(" ");
		}
		for(int j=i; j<=5; j++)  //Columns
		{
		
			System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
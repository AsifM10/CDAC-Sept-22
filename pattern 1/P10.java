class P10{
	public static void main(String args[]){
		int alphabet=64;
	
	for(int i=5; i>=1; i--) //Row
	{
		
		for(int s=1; s<=i; s++)		//space
		{
			System.out.print(" ");
		}
		for(int j=i; j<=5; j++)  //Columns
		{
		
			System.out.print((char) (alphabet+j) + " ");
			}
			System.out.println();
		}
		
	}

}
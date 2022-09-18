class P9{
	public static void main(String args[]){
		int alphabet=64;
	
	for(int i=1; i<=5; i++) //Row
	{
		
		for(int s=4; s>=i; s--)		//space
		{
			System.out.print(" ");
		}
		for(int j=1; j<=i; j++)  //Columns
		{
		
			System.out.print((char) (alphabet+j) + " ");
			}
			System.out.println();
		}
		
	}

}
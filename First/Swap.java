import java.util.Scanner;

class Swap{
	public static void main(String args[]){
		int i=10;
		int j=5;
		
		System.out.println("Swap number i="+i+" and j= "+j);
		
		i=i+j;
		j=i-j;
		i=i-j;
	
		System.out.println("Swaped number i="+i+" and j="+j);
		}
	
}
//WAP to identify vowel.:{a,e,i,o,u}
import java.util.*;
class Switch3{
	
	public static void main(String args[])
	{
		boolean b = false;
		Scanner scan= new Scanner(System.in) ;
		System.out.println("Enter the alphabet :");
		char ch= scan.next().charAt(0);
		switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': b=true;
		}
			if(b==true)
			{
				System.out.println(ch+" is vowel");
			}
			else if((ch>='a' && ch<='z') || (ch>='A' && ch<='z'))
				System.out.println(ch+" is consonant");
			else
				System.out.println(ch+" is not an Alphabet!!");
		
		
	}
}
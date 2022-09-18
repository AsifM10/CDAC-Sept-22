 /* WAP to accept input in int, float, char, String

	- case values : 1,2,3,4,5,6,7
	
	- case values : 1.1, 2.2, 3.3,..7.7
	
	- case values : M,T,W, t, F S,s
	
	- case values : Monday, Tuesday....Sunday */
	
import java.util.*;
class Switch4{
	
	public static void main(String args[]){
	//Scanner scan = new Scanner(System.in);
	//int day=scan.nextInt();
	//switch(day){
		
		/*case 1: System.out.println("Today is monday!!");
		break;
		case 2: System.out.println("Today is Tuesday!!");
		break;
		case 3: System.out.println("Today is Wednesday!!");
		break;
		case 4: System.out.println("Today is Thursday!!");
		break;
		case 5: System.out.println("Today is Friday!!");
		break;
		case 6: System.out.println("Today is Saturday!!");
		break;
		case 7: System.out.println("Today is Sunday!!");
		break;
		default:  System.out.println("Enter between 1 to 7");*/
		
		/*Scanner scan = new Scanner(System.in);
		float f=scan.nextFloat(); // 1.1 2.2 3.3 4.4 5.5 6.6 7.7
		switch(f){
			case 1.1: System.out.println("1.1");
		break;
		case 2.2: System.out.println("2.2");
		break;
		case 3.3: System.out.println("3.3");
		break;
		case 4.4: System.out.println("4.4");
		break;
		case 5.5: System.out.println("5.5");
		break;
		case 6.6: System.out.println("6.6");
		break;
		case 7.7: System.out.println("7.7");
		break;
		default:  System.out.println("Enter between 1.1 to 7.7");  incompatible types: possible lossy conversion from float to int*/
			
		/*Scanner scan = new Scanner(System.in);
		char ch=scan.next().charAt(0);
		
		switch(ch){
		case 'M': System.out.println("Today is monday!!");
		break;
		case 'T': System.out.println("Today is Tuesday!!");
		break;
		case 'W': System.out.println("Today is Wednesday!!");
		break;
		case 't': System.out.println("Today is Thursday!!");
		break;
		case 'F': System.out.println("Today is Friday!!");
		break;
		case 'S': System.out.println("Today is Saturday!!");
		break;
		case 's': System.out.println("Today is Sunday!!");
		break;
		default:  System.out.println("Enter between M T W t F S s");
		
			}*/
			
			Scanner scan = new Scanner(System.in);
			String day= scan.nextLine();
			
			switch(day){
		
		case "Monday": System.out.println("Today is monday!!");
		break;
		case "Tuesday": System.out.println("Today is Tuesday!!");
		break;
		case "Wednesday": System.out.println("Today is Wednesday!!");
		break;
		case "Thursday": System.out.println("Today is Thursday!!");
		break;
		case "Friday": System.out.println("Today is Friday!!");
		break;
		case "Saturday": System.out.println("Today is Saturday!!");
		break;
		case "Sunday": System.out.println("Today is Sunday!!");
		break;
		default:  System.out.println("Enter between Monday to Sunday");
			}
	
		}

}
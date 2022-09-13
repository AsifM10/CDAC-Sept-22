 // WAP to find LCM of two numbers.

import java.util.Scanner;
 
 class LCM {
  public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
   
   int lcm = (num1 > num2) ? num1 : num2;

   
    while(true) {
      if( lcm % num1 == 0 && lcm % num2 == 0 ) {
        System.out.printf("The LCM of "+num1+" and "+num2+" is "+lcm);
        break;
      }
      ++lcm;
    }
  }
}
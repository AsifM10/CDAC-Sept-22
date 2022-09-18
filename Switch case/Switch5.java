/*Q5.Result Evaluation
	>85:Dist
	60 to 85: First
	50 to 60: Second
	40 to 50: Third
	<40 : Fail */

import java.util.Scanner;

class Switch5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks");
		int marks = scan.nextInt();

		if(marks >85){
			System.out.println("Excellent: Distinction");
		}else if(marks < 85 && marks >= 60){
			System.out.println("Very Good: Grade first");
		}else if(marks < 60 && marks >= 50){
			System.out.println("Good: Grade Second");
		}else if(marks < 50 && marks >= 40){
		System.out.println("Good: Grade Third");}
			else
			System.out.println("Failed!");
		}
	}


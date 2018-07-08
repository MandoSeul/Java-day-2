/*/
package ex02.IF;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("Write your score : ");
			Scanner sc = new Scanner(System.in);
			int sum = ( sc. nextInt() + sc.nextInt() + sc.nextInt() );;
			char grade;
			double avg = sum/3.0;
		if((avg<=100)&&(avg>=90))
			grade = 'A';
		else if((avg<=89)&&(avg>=80))
			grade = 'B';
		else if((avg<=79)&&(avg>=70))
			grade = 'C';
		else if((avg<=69)&&(avg>=60))
			grade = 'D';
		else
			grade = 'F';
		System.out.println("your Score is  " + avg);
		System.out.println("your Grade is  " + grade);
				
	}
}
//*/

//*/
package ex02.IF;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		System.out.println("Write your score : ");
			Scanner sc = new Scanner(System.in);
			int sum = ( sc. nextInt() + sc.nextInt() + sc.nextInt() );;
			char grade;
			double avg = sum/3.0;
		if((avg<=100)&&(avg>=90))
			grade = 'A';
		else if((avg<=89)&&(avg>=80))
			grade = 'B';
		else if((avg<=79)&&(avg>=70))
			grade = 'C';
		else if((avg<=69)&&(avg>=60))
			grade = 'D';
		else
			grade = 'F';
		System.out.println("your Score is  " + avg);
		System.out.println("your Grade is  " + grade);
				
	}
}
//*/
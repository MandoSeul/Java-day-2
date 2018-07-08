/*/
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("1,2,3에서 숫자 입력 요망 : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point){ // 문자형, 정수형(long제외)만 올 수 있다.
		//실수형은 올 수 없음.
		case 1:
			System.out.println("집을 줄께");
			break;
		case 2:
			System.out.println("자전거를 줄께");
			break;
		case 3:
			System.out.println("사탕을 줄께");
			break;
		default: {
			System.out.println("범위 이내의 숫자를 입력하세요");	
			System.exit(0);
			}
		} // switch end
	System.out.println("당첨되었습니다");
	}
}
//*/

/*/
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 사친연산 프로그램 switch~case 형태로 출력
		int i, j, result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계산될  숫자들을 입력하시오 : ");
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println("사칙연산을 입력하시오 : ( *, / , +, - ) ");
		String str = sc.next();
		char x = str.charAt(0);
		
		switch(x){ // 문자형, 정수형(long제외)만 올 수 있다.
		//실수형은 올 수 없음.
		case '*':
			result=i*j;
			break;
		case '/':
		{	if(j==0){
				System.out.println("나누기를 할 수 없습니다.");
				System.exit(0);}
			result=i/j;
			break;}
		case '-':
			result=i-j;
			break;
		case '+':
			result=i+j;
			break;
			
		default: {
			System.out.println("잘못된 기호입니다");	
			System.exit(0);
			}
		} // switch end
	System.out.println(i+""+x+""+j+"="+result);
	}
}
//*/

//*/
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// 학점 프로그램 switch~case 형태로 출력
		System.out.println("Write your score : ");
		Scanner sc = new Scanner(System.in);
		int sum = ( sc. nextInt() + sc.nextInt() + sc.nextInt() );;
		char grade;
		double avg = sum/3.0;
		
		switch(sum / 30){
		case 10:
		case 9:		
			grade = 'A';
			break;
		case 8:		
			grade = 'B';
			break;
		case 7:		
			grade = 'C';
			break;
		case 6:		
			grade = 'D';
			break;
		default:	
			grade = 'F';
			break;
		}
		System.out.println("your Score is  " + avg);
		System.out.println("your Grade is  " + grade);
		
		
		switch((int)(avg / 10)){
		case 10:
		case 9:		
			grade = 'A';
			break;
		case 8:		
			grade = 'B';
			break;
		case 7:		
			grade = 'C';
			break;
		case 6:		
			grade = 'D';
			break;
		default:	
			grade = 'F';
			break;
		}
	System.out.println("your Score is  " + avg);
	System.out.println("your Grade is  " + grade);
	
}}
//*/
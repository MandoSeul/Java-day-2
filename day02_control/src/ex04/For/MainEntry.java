/*
package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		for(int i =1; i<101; i++)
		{
			if(i%2==0)
				System.out.printf(i + "\t");
			if(i%20==0)
				System.out.println();
		
	}
	}}
//*/

/*
package ex04.For;

public class MainEntry {
	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		for(int i =1; i<101; i++)
		{
		if(i%3==0)
		{
			sum = i+sum;
			count++;
		}
	}
		
		System.out.println("3의 배수의 개수는 : " + count);
		System.out.println("3의 배수의 합은 : " + sum);

	}}
//*/

/*
package ex04.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
// 원하는 단을 입력받아서 구구단을 출력하는 프로그램
		System.out.println("숫자를 입력하세요 : ");
		int m_number = new Scanner(System.in).nextInt();
		
		for(int i =1; i<10; i++)
		{
			System.out.println( m_number+"*"+i +"="+ (m_number+i));
	}
		

	}}
//*/

/*
package ex04.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int com, eng, kor ;
		double avg = 0;
		int sum =0;
		System.out.println("전산, 영어, 국어 성적을 입력하세요 : ");
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		sum = kor + eng+ com;
		avg = sum/3.0;
		
		if(avg>=60)
		{
			if((kor>=40)&&(com>=40)&&(eng>=40))
			System.out.println("합격입니다 축하합니다");
			else 
			{
				if(kor<40)
				System.out.println("국어과목미달입니다. 탈락입니다");
				else if(com<40)
					System.out.println("국어과목미달입니다. 탈락입니다");
				else if(eng<40)
					System.out.println("국어과목미달입니다. 탈락입니다");
			}
		}
		else
			System.out.println("평균을 못넘었습니다. 탈락입니다");

	}}
//*/

//*
package ex04.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int month, year  ;
		boolean flag = false;
		String str;
		System.out.println("year를 입력하세요 : ");
		year = sc.nextInt();
		System.out.println("month를 입력하세요 : ");
		month = sc.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일 까지 있습니다");
			break;
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 까지 있습니다");
			break;
		default:
			System.out.println("month가 아닙니다.");	
			System.exit(0);
		}
		if(year%4==0){
		if((year%100 !=0)||(year%400 ==0))
			{
				flag = true;
			}//in if end
		}//out if end
	str = (flag ==true)?"윤년":"평년";
	System.out.println(year + "====>" + str);
	//main end
	}}
//*/

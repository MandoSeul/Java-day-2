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
		
		System.out.println("3�� ����� ������ : " + count);
		System.out.println("3�� ����� ���� : " + sum);

	}}
//*/

/*
package ex04.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
// ���ϴ� ���� �Է¹޾Ƽ� �������� ����ϴ� ���α׷�
		System.out.println("���ڸ� �Է��ϼ��� : ");
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
		System.out.println("����, ����, ���� ������ �Է��ϼ��� : ");
		com = sc.nextInt();
		eng = sc.nextInt();
		kor = sc.nextInt();
		
		sum = kor + eng+ com;
		avg = sum/3.0;
		
		if(avg>=60)
		{
			if((kor>=40)&&(com>=40)&&(eng>=40))
			System.out.println("�հ��Դϴ� �����մϴ�");
			else 
			{
				if(kor<40)
				System.out.println("�������̴��Դϴ�. Ż���Դϴ�");
				else if(com<40)
					System.out.println("�������̴��Դϴ�. Ż���Դϴ�");
				else if(eng<40)
					System.out.println("�������̴��Դϴ�. Ż���Դϴ�");
			}
		}
		else
			System.out.println("����� ���Ѿ����ϴ�. Ż���Դϴ�");

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
		System.out.println("year�� �Է��ϼ��� : ");
		year = sc.nextInt();
		System.out.println("month�� �Է��ϼ��� : ");
		month = sc.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "���� 31�� ���� �ֽ��ϴ�");
			break;
		case 2:
			System.out.println(month + "���� 28�� ���� �ֽ��ϴ�");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�� ���� �ֽ��ϴ�");
			break;
		default:
			System.out.println("month�� �ƴմϴ�.");	
			System.exit(0);
		}
		if(year%4==0){
		if((year%100 !=0)||(year%400 ==0))
			{
				flag = true;
			}//in if end
		}//out if end
	str = (flag ==true)?"����":"���";
	System.out.println(year + "====>" + str);
	//main end
	}}
//*/

/*/
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("1,2,3���� ���� �Է� ��� : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point){ // ������, ������(long����)�� �� �� �ִ�.
		//�Ǽ����� �� �� ����.
		case 1:
			System.out.println("���� �ٲ�");
			break;
		case 2:
			System.out.println("�����Ÿ� �ٲ�");
			break;
		case 3:
			System.out.println("������ �ٲ�");
			break;
		default: {
			System.out.println("���� �̳��� ���ڸ� �Է��ϼ���");	
			System.exit(0);
			}
		} // switch end
	System.out.println("��÷�Ǿ����ϴ�");
	}
}
//*/

/*/
package ex03.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		// ��ģ���� ���α׷� switch~case ���·� ���
		int i, j, result = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����  ���ڵ��� �Է��Ͻÿ� : ");
		i = sc.nextInt();
		j = sc.nextInt();
		System.out.println("��Ģ������ �Է��Ͻÿ� : ( *, / , +, - ) ");
		String str = sc.next();
		char x = str.charAt(0);
		
		switch(x){ // ������, ������(long����)�� �� �� �ִ�.
		//�Ǽ����� �� �� ����.
		case '*':
			result=i*j;
			break;
		case '/':
		{	if(j==0){
				System.out.println("�����⸦ �� �� �����ϴ�.");
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
			System.out.println("�߸��� ��ȣ�Դϴ�");	
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
		// ���� ���α׷� switch~case ���·� ���
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
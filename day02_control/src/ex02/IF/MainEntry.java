
/*
package ex02.IF;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		int year;
		String str;
		boolean flag = false;
		System.out.println("year : ");
		year = new Scanner(System.in).nextInt();		
		if(year%4==0){
			if((year%100 !=0)||(year%400 ==0))
			{
				flag = true;
			}//in if end
		}//out if end
	str = (flag ==true)?"����":"���";
	System.out.println(year + "====>" + str);
	}//main end
}
//*/

/*
package ex02.IF;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("���ĺ��� �Է� �ϼ��� : ");
		String str = new Scanner(System.in).next();
		char ch = str.charAt(0); // �ѹ��ڷ� ó��
		if((ch >= 65 )&&(ch<=90))
			System.out.println(ch+" ====> "+(char)(ch+32));
		else if((ch >= 'a' )&&(ch<='z')) // ���ڿ� ���� ��� ����
			System.out.println(ch+" ====> "+(char)(ch-32));
		else
			System.out.println("error");
	}
	
}
//*/

//*
package ex02.IF;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class MainEntry {
	public static void main(String[] args) {
	int i, j, result = 0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("����  ���ڵ��� �Է��Ͻÿ� : ");
	i = sc.nextInt();
	j = sc.nextInt();
	System.out.println("��Ģ������ �Է��Ͻÿ� : ( *, / , +, - ) ");
	String str = sc.next();
	char x = str.charAt(0);

	if(x=='+')
		result = (i+j) ;
	else if(x=='-')
		result =(i-j);
	else if(x=='*')
		result = (i*j);
	else if(x=='/')
		result = (i/j);
	
	System.out.println(i + ""+ x+""+j+ "=" +result);
	}
}
//*/
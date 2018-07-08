
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
	str = (flag ==true)?"윤년":"평년";
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
		System.out.println("알파벳을 입력 하세요 : ");
		String str = new Scanner(System.in).next();
		char ch = str.charAt(0); // 한문자로 처리
		if((ch >= 65 )&&(ch<=90))
			System.out.println(ch+" ====> "+(char)(ch+32));
		else if((ch >= 'a' )&&(ch<='z')) // 문자와 정수 모두 가능
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
	
	System.out.println("계산될  숫자들을 입력하시오 : ");
	i = sc.nextInt();
	j = sc.nextInt();
	System.out.println("사칙연산을 입력하시오 : ( *, / , +, - ) ");
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
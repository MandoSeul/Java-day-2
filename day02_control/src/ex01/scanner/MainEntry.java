/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : 표준입력
	Scanner sc = new Scanner(System.in);
	System.out.printf("정수 숫자 입력 요망 : ");
	int su = sc.nextInt();
	System.out.println("\n\n입력 받은 수는 " + su);
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : 표준입력
	Scanner sc = new Scanner(System.in);
	System.out.printf("문자열, 정수, 실수   숫자 입력 요망 : ");
	
	String name = sc.nextLine();
	int su = sc.nextInt();
	float su2 = sc.nextFloat();
	
	
	System.out.println("\n\n입력 받은 문자열은 " + name);
	System.out.println(su+ " , " + su2);
	
	
	
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : 표준입력
	System.out.printf("문자열 입력 요망 : ");
	
	String name = new Scanner(System.in).nextLine();
	
	System.out.println("\n\n입력 받은 문자열은 " + name);
	
}
}
//*/

//*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		//next() vs nextline()
		Scanner sc = new Scanner(System.in);
	System.out.println(" string input : ");
	int next;
	String line;
	next = sc.nextInt();
	sc.nextLine();
	line = sc.nextLine();
	System.out.println(" 입력 받은 문자 " + next );
	System.out.println(" 입력 받은 문자 " + line );
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

	// 1. 사용할 변수 선언
	int kor , eng , com , total;
	String name;
	double avg = 0; // 평균-소수점 2자리까지 표현
	Scanner sc = new Scanner(System.in);
	
	//2. 메세지 출력 및 입력받기
	System.out.println(" 이름을 입력하세요 : ");
	name = sc.nextLine();
	System.out.println(" 국어점수를 입력하세요 : ");
	kor = sc.nextInt();
	System.out.println(" 컴퓨터점수를 입력하세요 : ");
	com = sc.nextInt();
	System.out.println(" 영어점수를 입력하세요 : ");
	eng = sc.nextInt();
	
	
	//3. 처리(계산)
	total = kor + eng + com;
	avg = ((double)total/3);
	
	//4. 결과출력
	System.out.println(name +"님의 성적표");
	System.out.println("kor : " + kor + "\teng : " + eng + "\tcom : " + com );
	System.out.printf("total : " + total +"\taverage : %.2f " ,avg);

}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

	// 1. 사용할 변수 선언
	int Weight;
	String name;
	Scanner sc = new Scanner(System.in);
	
	//2. 메세지 출력 및 입력받기
	System.out.println(" 이름을 입력하세요 : ");
	name = sc.nextLine();
	System.out.println(" 몸무게를 입력하세요 : ");
	Weight = sc.nextInt();
	
	//3. 처리(계산)

	//4. 결과출력
	System.out.println(name +"님의 몸무게입니다.");
	System.out.println("Weight : " + Weight);

}
}
//*/

/*/
package ex04.For;

public class MultiFor {
public static void main(String[] args) {
	
	for(int i =0; i<2; i++){
		for( int j=1 ;j<3; j++){
			System.out.printf(j+ " \t");
		}
		System.out.println();
	}

}
}
//*/

/*/
package ex04.For;

public class MultiFor {
public static void main(String[] args) {
	
	for(int i =0; i<=5; i++){
		for( int j=0 ;j<i; j++){
			
			System.out.printf( "*");
		}
		
		System.out.println();
	}

}
}

/*
package ex04.For;

public class MultiFor {
public static void main(String[] args) {
	//구구단 전체 출력 프로그램
	for(int i =1; i<=9; i++){
		//System.out.printf(i+"*");
		for( int j=1 ;j<=9; j++){
			//System.out.printf(i+"*"+j +"="+ (i*j)+"\n");
			System.out.printf("%d*%d=%2d\t",j,i,(j*i));
		}	
		System.out.println();
	}

}
}
//*/

/*/
package ex04.For;

public class MultiFor {
public static void main(String[] args) {
	
	double rnd = Math.random(); // 0.0~ 1.0 부터 의 숫자 중에 임의의 숫자
	
	for(int i = 0; i<5; i++){
	int j = (int)(Math.random()*5); // 0~4까지 숫자 외에는 나오지 않음
	//1~5로 만들고 싶으면 +1 하면 됨
	System.out.println(j);
	}
}
}
//*/

//*/
package ex04.For;

import java.util.Scanner;

public class MultiFor {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double rnd = (int)(Math.random()*100+5);
	for(int j=0; j<5; j++){
		
		System.out.println("1~100 이내의 숫자를 입력하시오 : ");
		int i=sc.nextInt();
		
		if(i==rnd)
			System.out.println("Answer!!");
		else if (i < rnd){
			System.out.println(" UP ");
			System.out.println((j+1)+"번째 입니다. 기회는 총 5번");
		}
		else{
			System.out.println(" Down ");
			System.out.println((j+1)+"번째 입니다. 기회는 총 5번");
		}
		
	}
	
	
}}


//*/
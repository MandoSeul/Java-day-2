
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
	//������ ��ü ��� ���α׷�
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
	
	double rnd = Math.random(); // 0.0~ 1.0 ���� �� ���� �߿� ������ ����
	
	for(int i = 0; i<5; i++){
	int j = (int)(Math.random()*5); // 0~4���� ���� �ܿ��� ������ ����
	//1~5�� ����� ������ +1 �ϸ� ��
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
		
		System.out.println("1~100 �̳��� ���ڸ� �Է��Ͻÿ� : ");
		int i=sc.nextInt();
		
		if(i==rnd)
			System.out.println("Answer!!");
		else if (i < rnd){
			System.out.println(" UP ");
			System.out.println((j+1)+"��° �Դϴ�. ��ȸ�� �� 5��");
		}
		else{
			System.out.println(" Down ");
			System.out.println((j+1)+"��° �Դϴ�. ��ȸ�� �� 5��");
		}
		
	}
	
	
}}


//*/
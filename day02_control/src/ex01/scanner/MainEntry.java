/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : ǥ���Է�
	Scanner sc = new Scanner(System.in);
	System.out.printf("���� ���� �Է� ��� : ");
	int su = sc.nextInt();
	System.out.println("\n\n�Է� ���� ���� " + su);
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : ǥ���Է�
	Scanner sc = new Scanner(System.in);
	System.out.printf("���ڿ�, ����, �Ǽ�   ���� �Է� ��� : ");
	
	String name = sc.nextLine();
	int su = sc.nextInt();
	float su2 = sc.nextFloat();
	
	
	System.out.println("\n\n�Է� ���� ���ڿ��� " + name);
	System.out.println(su+ " , " + su2);
	
	
	
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
	//system.in : ǥ���Է�
	System.out.printf("���ڿ� �Է� ��� : ");
	
	String name = new Scanner(System.in).nextLine();
	
	System.out.println("\n\n�Է� ���� ���ڿ��� " + name);
	
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
	System.out.println(" �Է� ���� ���� " + next );
	System.out.println(" �Է� ���� ���� " + line );
}
}
//*/

/*
package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

	// 1. ����� ���� ����
	int kor , eng , com , total;
	String name;
	double avg = 0; // ���-�Ҽ��� 2�ڸ����� ǥ��
	Scanner sc = new Scanner(System.in);
	
	//2. �޼��� ��� �� �Է¹ޱ�
	System.out.println(" �̸��� �Է��ϼ��� : ");
	name = sc.nextLine();
	System.out.println(" ���������� �Է��ϼ��� : ");
	kor = sc.nextInt();
	System.out.println(" ��ǻ�������� �Է��ϼ��� : ");
	com = sc.nextInt();
	System.out.println(" ���������� �Է��ϼ��� : ");
	eng = sc.nextInt();
	
	
	//3. ó��(���)
	total = kor + eng + com;
	avg = ((double)total/3);
	
	//4. ������
	System.out.println(name +"���� ����ǥ");
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

	// 1. ����� ���� ����
	int Weight;
	String name;
	Scanner sc = new Scanner(System.in);
	
	//2. �޼��� ��� �� �Է¹ޱ�
	System.out.println(" �̸��� �Է��ϼ��� : ");
	name = sc.nextLine();
	System.out.println(" �����Ը� �Է��ϼ��� : ");
	Weight = sc.nextInt();
	
	//3. ó��(���)

	//4. ������
	System.out.println(name +"���� �������Դϴ�.");
	System.out.println("Weight : " + Weight);

}
}
//*/
package chap_01;

import java.util.Scanner;

public class Exam_p98 {

	public static void main(String[] args) {
	//Ȯ�ι��� 1.
		String name = "���ڹ�";
		int age = 25;
		String tel1 = "010", tel2 = "123", tel3 = "4567";
		System.out.println("�̸�: " + name);
		System.out.print("����: " + age + "\n");
		System.out.printf("��ȭ: %s-%s-%s"+"\n", tel1,tel2,tel3);
		
	//Ȯ�ι��� 2.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ��:");
		String strNum1 = scanner.nextLine();
				
		System.out.printf("�ι�° ��:");
		String strNum2 = scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ���:" +result);
		
	//Ȯ�ι��� 3.
		
		System.out.println("1. �̸�:");
		String name2 = scanner.nextLine();
		
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�:");
		String jumin = scanner.nextLine();
		
		System.out.println("3. ��ȭ��ȣ:");
		String tel = scanner.nextLine();
		
		System.out.println(name2);
		System.out.println(jumin);
		System.out.println(tel);
		
				
		
			
		
		
		
		
		
	} //end main

} //end class

package chap_03;

import java.util.*;

public class Exam_p128 {

	public static void main(String[] args) {
	//���� 4��
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils / students);
		int remainPencils = pencils % students;
		
		System.out.printf("�л��� ���� �� : %d, ���� ���� �� : %d \n", pencilsPerStudent, remainPencils);
		
		
	//���� 5�� -> ���� Ÿ�Ժ�ȯ
		
	//���� 6��
		int value = 365;
		System.out.println(value/100*100);
		
	//���� 7�� -> �ε��Ҽ��� ǥ����Ķ��� 0.1�� 0.1���� ū ��
		//���� Ÿ�� ��ȯ (float)0.1
		
	//���� 8��
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height / 2.0);
		System.out.println("��ٸ����� ���� : " + area);
		
	//���� 9��
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		double num1 = sc.nextDouble();
		
		System.out.println("�ι�° �� : ");
		double num2 = sc.nextDouble();
		
		if(num2 == 0 || num2 == 0.0) {
			System.out.println("��� : ���Ѵ�");			
		}else {
			System.out.println("��� : " + (num1 / num2));
		}
		
	//���� 10��
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("���� ���� : " + var4);
		
	//���� 11��
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵�:");
		String name = scanner.nextLine();
		
		System.out.print("�н����� :");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");				
			}else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
		}else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}
		
	//���� 12��
		
		
		
		
		
		
		
	
		
		
		
	}//end main

}//end clss

package chap_04;

import java.util.Scanner;

public class Exam_p160 {

	public static void main(String[] args) {
		
	//����2. 3�� ����� ��
		//1. ���� ������ ����
		int sum = 0;
		//1���� 100���� �� �߻� �ݺ���
		for(int i = 1; i <= 100; i++) {
			if(i % 3 ==0) {		//3�� ������� ���ǹ�
				sum += i;
			}	
		}
		System.out.println("3�� ����� : " + sum);		//������ �� ���

		
	//����3. 
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		System.out.println("����");
		
	//����4.
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
	//����5.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
//				if (j == i) {
//				}	
			}
			System.out.println();
		}
		
	//����5. ȥ���غ���
//		for(int i = 1, i <= 4, i++) {
//			for(int j = 1, j <= 4, j++)
//		}
//	
	//����6.
		for(int b = 1; b < 5; b++) {
			
			for(int s = 4; s > 0; s--) {
				if(b < s) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	
	//����7.
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int money = 0; // money�� ��� ��ߵǴϱ� ������ ��������.
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("----------------------------------");
			System.out.print("����> ");
			int sNum = scanner.nextInt(); //�ڷᰡ ���� int �� ���� int�� �޾Ƶ� ����			
			
			switch(sNum) {
			case 1 :
				System.out.print("���ݾ�> ");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2 :
				System.out.print("��ݾ�> ");
				money = scanner.nextInt();
				if(money > balance) {
					System.out.println("�ܰ����");
				}else {
					balance -= money;	
				}				
				break;
			case 3 :
				System.out.println("�ܰ� > " + balance);
				break;
			case 4 :
				System.out.println("���α׷� ����");
				run = false;				
			}			
		}
		

			
		
		
		
	}//end main

}//end class

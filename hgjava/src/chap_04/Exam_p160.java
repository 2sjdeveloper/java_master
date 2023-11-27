package chap_04;

import java.util.Scanner;

public class Exam_p160 {

	public static void main(String[] args) {
		
	//문제2. 3의 배수의 합
		//1. 합을 저장할 변수
		int sum = 0;
		//1에서 100까지 수 발생 반복문
		for(int i = 1; i <= 100; i++) {
			if(i % 3 ==0) {		//3의 배수인지 조건문
				sum += i;
			}	
		}
		System.out.println("3의 배수합 : " + sum);		//구해진 합 출력

		
	//문제3. 
		while(true) {
			int dice1 = (int)(Math.random()*6) + 1;
			int dice2 = (int)(Math.random()*6) + 1;
			System.out.printf("(%d, %d)\n", dice1, dice2);
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		System.out.println("종료");
		
	//문제4.
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if((4*x + 5*y) == 60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
	//문제5.
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
//				if (j == i) {
//				}	
			}
			System.out.println();
		}
		
	//문제5. 혼자해보기
//		for(int i = 1, i <= 4, i++) {
//			for(int j = 1, j <= 4, j++)
//		}
//	
	//문제6.
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
	
	//문제7.
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int money = 0; // money를 계속 써야되니까 변수에 저장해줌.
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------");
			System.out.print("선택> ");
			int sNum = scanner.nextInt(); //자료가 전부 int 일 때는 int로 받아도 무관			
			
			switch(sNum) {
			case 1 :
				System.out.print("예금액> ");
				money = scanner.nextInt();
				balance += money;
				break;
			case 2 :
				System.out.print("출금액> ");
				money = scanner.nextInt();
				if(money > balance) {
					System.out.println("잔고부족");
				}else {
					balance -= money;	
				}				
				break;
			case 3 :
				System.out.println("잔고 > " + balance);
				break;
			case 4 :
				System.out.println("프로그램 종료");
				run = false;				
			}			
		}
		

			
		
		
		
	}//end main

}//end class

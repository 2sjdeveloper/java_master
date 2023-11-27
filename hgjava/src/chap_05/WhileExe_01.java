package chap_05;

import java.util.Scanner;

public class WhileExe_01 {

	public static void main(String[] args) {
		// for : 반복 횟수가 정해져있는 경우.
		
		// while : 특정 조건을 만족하는 동안만 반복.
		Scanner scn = new Scanner(System.in);		
		while(true) {
			System.out.println("문자값을 입력>>>");
			
			String txt = scn.nextLine();
			if(txt.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			System.out.println("입력한 값은 " + txt);
		}
		System.out.println("end of prog");
	}

}

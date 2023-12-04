package chap_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExe3 {
	
	static Scanner scn = new Scanner(System.in);
	List<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
	

		// 회원등록(회원번호, 이름, 포인트)
		// 1.등록 2.이름으로 조회 3.회원번호로 포인트 변경 4.삭제 5.종료

//		System.out.println("회원번호 이름 포인트");
//
//		String input = scn.nextLine();
//		String[] inAry = input.split(" ");
//		System.out.println(inAry[0]);
//		System.out.println(inAry[1]);
//		System.out.println(inAry[2]);
//
//		System.out.println("end");
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.이름조회 3.회원번호조회 후 포인트변경 4.삭제 5.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1:
				addMember();
				break;
	


			}
		} // end of while

	}// end of main

	private static void addMember() {
		System.out.println("회원 번호 입력");
		String memNum= scn.nextLine();
		System.out.println("회원 이름 입력");
		String memName = scn.nextLine();
		System.out.println("포인트 입력");
		int point = Integer.parseInt(scn.nextLine());
		
		
	}
	
	
	
	
	
	

}// end of class

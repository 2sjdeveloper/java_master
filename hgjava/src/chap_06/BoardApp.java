package chap_06;

import java.util.Scanner;

public class BoardApp {
	public static void main(String[] args) {
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		
		while (run) {
			System.out.println("1.등록 2.목록보기 3.상세보기 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("게시글 번호 입력 >>");
				int textNo = Integer.parseInt(scn.nextLine());
				System.out.println("제목 입력 >>");
				String title = scn.nextLine();
				System.out.println("작성자 입력");
				String text = scn.nextLine();
				System.out.println("내용 입력");
				
			}
		}//end of while
				
		
	}//end of main

}//end of class



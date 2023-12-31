package todo_p20231205;

import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		BookExe exe = new BookExe();
		BookDAO dao = new BookDAO();

		while (run) {
			System.out.println("1.등록 2.목록 3.단건조회 4.수정 5.삭제 6.종료");
			int menu = Integer.parseInt(scn.nextLine()); // "1"

			switch (menu) {
			case 1:
				System.out.println("도서코드입력>> ");
				String code = scn.nextLine();
				System.out.println("도서명입력>> ");
				String name = scn.nextLine();
				System.out.println("저자입력>> ");
				String author = scn.nextLine();
				System.out.println("출판사입력>> ");
				String press = scn.nextLine();
				System.out.println("가격입력>> ");
				int price = Integer.parseInt(scn.nextLine());

				Book std = new Book(code, name, author, press, price);
				// 
				if (dao.addBook(std)) {
					System.out.println("저장되었습니다.");
				} else {
					System.out.println("저장 중 오류.");
				}

				break;

			case 2: // 목록보기.
				ArrayList<Book> stdAry = dao.getBookList();
				for (Book stdnt : stdAry) {

					stdnt.showInfo();

				} // 
				break;

			case 3: // 단건조회.
				System.out.println("조회할 도서코드 입력>>>>");
				code = scn.nextLine();
				Book bc = dao.getBook(code);
				if (bc != null) {
					bc.showInfo();
				} else {
					System.out.println("없는 정보");
				}
				break;

			case 4: // 수정.
				System.out.println("수정할 도서코드 입력>>>>");
				String bookCode = scn.nextLine();
				System.out.println("가격 입력>>>");
				price = Integer.parseInt(scn.nextLine());

				if (dao.modifyBook(bookCode, price)) {
					System.out.println("수정 완료.");
				} else {
					System.out.println("수정 실패.");
				}
				break;

			case 5: // 삭제.
				System.out.println("삭제할 도서코드 입력>>>>");
				bookCode = scn.nextLine();
				if (dao.removeBook(bookCode)) {
					System.out.println("삭제 완료.");
				} else {
					System.out.println("삭제 실패.");
				}
				break;

			case 6:
				System.out.println("프로그램을 종료합니다.");
				run = false;

			}
		} // end of while.
		System.out.println("end of prog.");
	}
}

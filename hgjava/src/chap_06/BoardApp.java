package chap_06;

//실행하는 객체
import java.util.Scanner;

public class BoardApp {
	static BoardExe exe = new BoardExe();

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		String id = null;
		UserExe uexe = new UserExe();

		while (true) {
			System.out.println("id를 입력 >>> ");
			id = scn.nextLine();
			System.out.println("pw를 입력 >>> ");
			String pw = scn.nextLine();
			User user = uexe.logIn(id, pw);
			if (user != null) {
				System.out.println(user.getUserName() + "님 환영합니다.");
				break;
			} else {
				System.out.println("id, pw 확인바람");
			}
		} // 로그인 처리

		// 초기값 생성.
		exe.initData();

		while (run) {
			System.out.println("1.등록 2.목록보기 3.상세보기 4.수정 5.삭제 6.종료");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록
				System.out.println("제목 입력 >>");
				String title = scn.nextLine();
				System.out.println("내용 입력");
				String text = scn.nextLine();
				System.out.println("날짜 입력");
				String date = scn.nextLine();

				Board board = new Board(exe.getSequence(), title, id, text, date);

				if (exe.addBoard(board)) {
					System.out.println("입력 성공");
				} else {
					System.out.println("처리 실패");
				}
				break;

			case 2: // 목록보기 -> 페이지보기
				Board[] boardAry = exe.boardList();
				showList(boardAry, 1);
				while (true) {
					int page = Integer.parseInt(scn.nextLine());
					if (page == 0) {
						break;
					}
					showList(boardAry, page);
				}
				break;

			case 3: // 상세보기
				System.out.println("글번호 입력 >>>");
				int no = Integer.parseInt(scn.nextLine());
				Board result = exe.getBoard(no);
				if (result != null) {
					System.out.println(result.showDetailInfo());
				} else {
					System.out.println("조회된 내용이 없습니다");
				}
				break;

			case 4: // 수정
				System.out.println("수정할 글번호 >> ");
				no = Integer.parseInt(scn.nextLine());
				System.out.println("수정할 글내용 >> ");
				text = scn.nextLine();
				// 권한 체크
				if (!exe.checkResponsibility(id, no)) {
					System.out.println("수정 권한없음");
					continue;
				}
				if (exe.modBoard(no, text)) {
					System.out.println("변경 성공");
				} else {
					System.out.println("변경 실패");
				}
				break;

			case 5: // 삭제
				System.out.println("삭제할 글번호 >> ");
				no = Integer.parseInt(scn.nextLine());
				if (!exe.checkResponsibility(id, no)) {
					System.out.println("삭제 권한없음");
					continue;
				}

				if (exe.remBoard(no)) {
					System.out.println("삭제 성공");
				} else {
					System.out.println("삭제 실패");
				}
				break;

			case 6:
				System.out.println("프로그램 종료");
				run = false;

			}
		} // end of while
		System.out.println("end of prog");

	}// end of main

	public static void showList(Board[] boardAry, int page) {
		// 페이징 처리
		Board[] pageAry = exe.pageList(boardAry, page);
		System.out.println("글번호 제목    작성자");
		System.out.println("==================");
		for (Board brd : pageAry) {
			if (brd != null) {
				System.out.println(brd.showInfo());
			}
		}
		// 전체페이지 계산하고 출력
		int cnt = exe.getBoardCount();
		int totalPage = (int) Math.ceil(cnt / 5.0);

		for (int i = 1; i <= totalPage; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n 페이지를 선택하세요 >> 종료: 0 입력");

	}// end of showList

}// end of class

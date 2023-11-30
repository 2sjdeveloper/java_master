package chap_06;

import java.text.SimpleDateFormat;
import java.util.Date;

//데이터저장소

//저장소 : boards
public class BoardExe {
	static Board[] boards;

	BoardExe() {
		// boards = new Board[100];
	}

	static {
		boards = new Board[100];
	}

	// 초기값 생성
	public static void initData() {
		boards[0] = new Board(1, "첫번째 글", "user01", "첫번째 글입니다", "23-11-27");
		boards[1] = new Board(2, "두번째 글", "user02", "두번째 글입니다", "23-11-27");
		// boards[2] <-- 다섯번째 글이 들어감.
		boards[3] = new Board(4, "네번째 글", "user03", "네번째 글입니다", "23-11-27");
		boards[2] = new Board(3, "세번째 글", "user03", "네번째 글입니다");

		boards[4] = new Board(5, "다섯번째 글", "user01", "네번째 글입니다");
		boards[5] = new Board(6, "여섯번째 글", "user02", "네번째 글입니다");
		boards[6] = new Board(7, "일곱번째 글", "user01", "네번째 글입니다");
		boards[7] = new Board(8, "여덟번째 글", "user02", "네번째 글입니다");

	}

	// 등록. 글번호. 제목. 작성자. 내용. 작성일시 => 반환값 : boolean.
	public static boolean addBoard(Board board) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] == null) {
				boards[i] = board;
				return true; // break; //반복문 종료.
			}
		}
		return false;
	}

	// 목록. 반환값 : 배열
	public static Board[] boardList() {
		// boards => 새로운 배열에 정렬된 값으로 반환.
		Board temp = null;
		for (int j = 0; j < boards.length - 1; j++) {
			// 위치변경작업
			for (int i = 0; i < boards.length - 1; i++) { // 두개의 숫자를 비교하는거니까 횟수를 렝스 빼기 1
				if (boards[i] != null && boards[i + 1] != null) {
					if (boards[i].getTextNo() > boards[i + 1].getTextNo()) {
						temp = boards[i];
						boards[i] = boards[i + 1];
						boards[i + 1] = temp;
					}
				}
			}
		}
		return boards;
	}// end of boardList()

	// 배열, 페이지 => 페이지의 5건을 반환
	public static Board[] pageList(Board[] ary, int page) {
		Board[] resultAry = new Board[5];

		int start = (page - 1) * 5;
		int end = page * 5;
		int j = 0;
		for (int i = 0; i < ary.length; i++) {
			if (i >= start && i < end) {
				resultAry[j++] = ary[i];
			}
		}
		return resultAry;
	}

	// 단건 조회. 매개변수 : 글번호, 반환값: Board
	public static Board getBoard(int boardNo) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == boardNo) {
				return boards[i];
			}
		}
		return null;
	}

	// 신규번호 생성 메소드 : 현재 글번호 + 1
	public static int getSequence() {
		int seqNo = 1;
		// 배열에서 글 번호의 max값 가져오기.
		int max = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() > max) {
				max = boards[i].getTextNo();
			}
		}
		seqNo = max + 1;
		return seqNo;
	}

	// 수정. 글번호 받아서 글내용 수정하기
	// 같은 표현 : 매개값(글번호, 내용) => boolean
	public static boolean modBoard(int no, String content) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no) {
				boards[i].setText(content);
				boards[i].setDate(sdf.format(today));
				return true;
			}
		}
		return false;
	}

	// 삭제. 매개값(글번호) => 반환 : boolean타입.
	public static boolean remBoard(int no) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no) {
				boards[i] = null;
				return true;
			}
		}
		return false;
	}

	// (사용자)가 (해당글 번호)의 수정, 삭제 권한 체크 => boolean타입으로 반환
	public static boolean checkResponsibility(String id, int no) {
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getTextNo() == no && boards[i].getWriter().equals(id)) {
				return true;
			}
		}
		return false;
	}// end of checkResponsibility

	// 게시글을 담고 있는 배열에서 값이 있는 건수를 반환.
	public static int getBoardCount() {
		int realCnt = 0;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null) {
				realCnt++;
			}
		}
		return realCnt;
	}// end of getBoardCount
}

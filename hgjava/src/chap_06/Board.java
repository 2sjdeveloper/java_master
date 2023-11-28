package chap_06;

public class Board {
	int textNo;
	String title;
	String writer;
	String text;
	String date;
	
	Board(int textNo, String title, String writer, String text, String date){
		this.textNo = textNo;
		this.title = title;
		this.writer = writer;
		this.text = text;
		this.date = date;
	}

	void showInfo() {
		System.out.println(textNo + "-" + title + writer + text + date);
	}

	public int getTextNo() {
		return textNo;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getText() {
		return text;
	}

	public String getDate() {
		return date;
	}

	public void setTextNo(int textNo) {
		this.textNo = textNo;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setDate(String date) {
		this.date = date;
	}




}

//게시판(게시글 번호/제목/작성자/내용/작성일시)
//-----------------------------------------------------
//1. 자바게시판입니다. user01
//2. 공부합시다 	user02
//3. SQL이 기대됩니다. user03
//-----------------------------------------------------
//번호 : 1/ 제목 : 자바게시판입니다.
//작성자: user01
//내용 : 오늘은 숙제로 자바게시판을 만들어봅시다.
//일시: 2023-11-28
//-----------------------------------------------------
//
//필요한 기능 : 1. 등록 2. 목록보기 3. 상세보기 4. 종료
//
//1. Board.java 클래스 라이브러리 생성
//대충보기, 상세보기는 보드에 생성
//2. BoardApp.java 메인 메소드 담은 실행 용도 클래스 생성
//보드앱은 배열만 생성
//3. 속성은 다 프라이빗. 겟, 셋 메소드 활용....
package chap_06;

import java.text.SimpleDateFormat;
import java.util.Date;

import lombok.Data;

@Data

//데이터와 정보를 주고받기 위한 매개?

//필요한 기능 : 1. 등록 2. 목록보기 3. 상세보기 4. 종료
//
//1. Board.java 클래스 라이브러리 생성
//대충보기, 상세보기는 보드에 생성
//2. BoardApp.java 메인 메소드 담은 실행 용도 클래스 생성
//보드앱은 배열만 생성
//3. 속성은 다 프라이빗. 겟, 셋 메소드 활용....


public class Board {
	private int textNo;
	private String title;
	private String writer;
	private String text;
	private String date;

	public Board(int textNo, String title, String writer, String text) {
		Date today = new Date(); // 시스템시간을 기준으로 생성.
		// Date -> String -> Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		this.textNo = textNo;
		this.title = title;
		this.writer = writer;
		this.text = text;
		this.date = sdf.format(today);

	}

	public Board(int textNo, String title, String writer, String text, String date) {
		// this(); //기본 생성자
		this(textNo, title, writer, text);

//		this.textNo = textNo;
//		this.title = title;
//		this.writer = writer;
//		this.text = text; >> 이 네 줄을 위에 "this(~~)"의 한 줄로 표현 가능.
		this.date = date;

	}

	String showInfo() {
		return textNo + " " + title + " " + writer + " " + date;
	}

	String showDetailInfo() {
		String result = "번호: " + textNo + "/ 제목: " + title;
		result += "\n작성자: " + writer;
		result += "\n내용: " + text;
		result += "\n날짜: " + date;
		return result;

	}

}

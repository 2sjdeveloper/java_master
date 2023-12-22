package com.yedam.board.vo;

import java.util.Date;

import lombok.Data; //get,set 다 만들어줌.

@Data
public class BoardVO { //밸류 오브젝트 : 밸류를 담기위한 오브젝트 역할.
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private Date writeDate;
	private int clickCnt;
	private String image;
	
	

}

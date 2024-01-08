package com.yedam.reply.vo;

import lombok.Data;

@Data
public class PageDTO {
	private int currPage;
	private int totalCnt;
	private boolean prev, next;
	private int startPage, lastPage;

	// 생성자: 전체 건수, 현재 페이지를 매개값으로 받는 생성자를 만듦.
	public PageDTO(int page, int totalCnt) {
		this.currPage = page;
		this.totalCnt = totalCnt;
		
		//이전 페이지 여부, 첫페이지, 마지막페이지, 이후페이지가 있는지 여부를 계산해서 만듦.
		//예를 들어 전체 건수 : 75건이면 마지막 페이지는 15페이지. 70건이면 마지막 페이지는 14페이지. 페이지 숫자도 5개씩 표시.
		int realLast = (int) Math.ceil(totalCnt / 5.0); //마지막 페이지는 토탈 건수를 기준으로 계산해서 만듦.
		this.lastPage = (int) Math.ceil(page / 5.0) * 5;
		this.startPage = this.lastPage - 4;
		this.lastPage = this.lastPage > realLast ? realLast : this.lastPage;
		
		this.prev = this.startPage > 1;
		this.next = this.lastPage < realLast;		
	}
	
	//우클릭-> 소스-> 투스트링
	@Override
	public String toString() {
		return "PageDTO [currPage=" + currPage + ", totalCnt=" + totalCnt + ", prev=" + prev + ", next=" + next
				+ ", startPage=" + startPage + ", lastPage=" + lastPage + "]";
	}

}

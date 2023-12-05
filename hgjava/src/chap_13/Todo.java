package chap_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Todo {
	private String todo;
	private Date dueDate; //데이트 임포트 할 때는 자바 유틸 데이트.
	//투두는 오늘까지 완료. 듀데이트는 기한 있음.
	
	Todo(String todo){
		this.todo = todo;
		this.dueDate = new Date(); //년,월,일 시:분:초
	}
	
	Todo(String todo, Date dueDate){
		this.todo = todo;
		this.dueDate = dueDate;
	}
	
	//toString
	@Override
	public String toString() { //tostring 하고 컨트롤 스페이스 치면 자동완성됨.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return todo + " " + sdf.format(dueDate);
	}

}


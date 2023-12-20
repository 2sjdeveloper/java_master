package sujinTravel;

public class TravelComment {
	private int commentNo;
	private String comment;
	
	TravelComment(){
		
	}
	
	public TravelComment(String comment) {
		this.commentNo = commentNo; 
		this.comment = comment;
	}
	
	void showInfo() {
		System.out.println(commentNo + "  " + comment + "  ");
	}
	

	public int getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(int commentNo) {
		this.commentNo = commentNo;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}

package remind_06;
//학생정보저장. => Student.java

//-> 학생번호(23-001, 23-002)   setStudentNo
//-> 학생이름(홍길동, 박씨)
//-> 영어
//-> 수학
//-> method: showInfo() 학생이름, 영어, 수학 점수.

public class Student {
	String stuNo;
	String stuName;
	int eng;
	int math;
	
	//기본 생성자 만들기
	Student(){
		
	}

	Student(String stuNo, String stuName, int eng, int math) {
		this.stuNo = stuNo; //stu_no
		this.stuName = stuName; //stu_name
		this.eng = eng; //eng
		this.math = math; //math
	}

	void showInfo() {
		System.out.println("학생 번호는 " + stuNo + ", 이름은 " + stuName + "이고 영어점수는 " + eng + ", 수학점수는 " + math + "입니다");
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getStuNo() {
		return stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public static void main(String[] args) {

	}

}// end class

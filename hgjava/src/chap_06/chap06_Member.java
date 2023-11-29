package chap_06;
//회원관리 앱

//회원번호, 회원이름, 연락처, 성별
//public <-> private (접근의 수준을 정하는 지시자. 퍼블릭/프라이빗 : 다른 클래스에서 접근이 가능/불가능)

public class chap06_Member {
	// 속성(=필드). 값에 맞는 타입을 잘 지정해줘야함.
	private int memberNo;
	private String memberName;
	private String phone; // 휴대폰 번호 사이에 있는 - 하이픈이 문자로 인식되기때문에 string으로 설정
	private String gender; // Men or Women = > M, W
	
	// 프라이빗으로 하면 메소드로 값을 담게 해줌. 왜냐하면 사람들이 입력값을 지맘대로 쓰기때문에 값을 통일하기 위해서.

	// 생성자 : 필드의 초기값을 지정하는 역할
	// 기본생성자 컴파일러가 생성.
	chap06_Member() {

	}

	chap06_Member(int memberNo, String memberName) {
		this.memberNo = memberNo;
		this.memberName = memberName;
	}

	public chap06_Member(int memberNo, String memberName, String phone, String gender) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.phone = phone;
		this.gender = gender;
	}

	// 기능(메소드)
	void showInfo() {
		System.out.println("이름은 " + memberName + "이고 연락처는 " + phone + "입니다");
	}

	String showAllInfo() {
		String result = "이름은" + memberName + "이고 번호는" + memberNo + "이고 연락처는" + phone + "이고 성별은 " + gender + "입니다.";
		return result; // 문자열 값을 반환한다는 의미.. 라는데 이게 무슨 소리지..
	}

	// memberNo의 값을 지정하는 메소드.
	void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	void setPhone(String phone) {
		this.phone = phone;
	}

	void setGender(String gender) {
		this.gender = gender;
	}
	// 우클릭->소스->게터즈 세터즈...?

	// getter. 값을 가져오는 메소드를 만든다...고 한다.
	int getMemberNo() {
		return memberNo;
	}

	String getMemberName() {
		return memberName;
	}

	String getPhone() {
		return phone;
	}

	String getGender() {
		return gender;
	}

} // end class

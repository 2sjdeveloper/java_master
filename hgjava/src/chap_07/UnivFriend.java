package chap_07;

//자식클래스 : UnivFriend -> Friend(부모)

public class UnivFriend extends Friend {
	private String univ; // 학과
	private String major; // 전공

	public UnivFriend() {		
	}
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone);
		this.univ = univ;
		this.major = major;
	}

	// 컨트롤 + 스페이스 눌러서 쇼인포 선택.
	@Override // 쇼인포에만 영향을 줌.
	public String showInfo() {
		return "이름은 " + getName() + " 연락처는 " + getPhone() + " 학교는 " + univ + " 전공은 " + major;
	}

	public String getUniv() {
		return univ;
	}

	public void setUniv(String univ) {
		this.univ = univ;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}

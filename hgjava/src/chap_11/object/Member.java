package chap_11.object;

public class Member {
	private String name;
	private int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// equals 메소드
	@Override
	public boolean equals(Object obj) {
		// 이름과 나이가 같으면 논리적으로 동등한 객체로 취급한다.
		if (obj instanceof Member) {
			Member target = (Member) obj;
			if (this.name.equals(target.name) && this.age == target.age) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

}

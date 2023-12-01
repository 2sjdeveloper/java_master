package chap_11.object;

import java.util.HashSet;

public class HashSetExe {
	public static void main(String[] args) {
		// 배열의 단점을 보완하기위해 컬렉션을 사용.
		// 컬렉션 종류 : List, Set, Map
		// set 컬렉션 : 중복은 nono~!

		// HashSet : set 컬렉션의 대표적인 해시코드(중복은 no!)
		HashSet<String> set = new HashSet<String>(); // <String>의 의미 : 이 컬렉션에는 스트링타입만 담겠다는 의미.
		set.add("Hong");
		set.add("Hwang");
		set.add("Park");
		set.add("Hong");
		// set.add(new Member("Hong',20)); << <String>으로 지정을 해놨기때문에 이렇게 쓰면 에러남.

		// 중복된 값은 제거됨.
		for (Object name : set) {
			System.out.println(name);
		}

		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 21));
		members.add(new Member("박길동", 22));
		members.add(new Member("홍길동", 20));
		for(Member mem : members) {
			System.out.println(mem.toString());
		}

	}

}

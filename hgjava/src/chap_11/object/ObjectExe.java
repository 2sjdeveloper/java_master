package chap_11.object;

public class ObjectExe {
	public static void main(String[] args) {
		// equals. 메소드 살펴보기.

		Object obj1 = new Object();
		Object obj2 = new Object();

		// 객체의 주소값을 비교
		System.out.println(obj1.equals(obj2)); // 모양은 같아보이지만 만들어진 주소가 다르기때문에 결과는 false임.

		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println(str1.equals(str2)); // 스트링은 문자열을 비교하기때문에 값은 true가 나옴.

		Member mem1 = new Member("홍길동", 20);
		Member mem2 = new Member("홍길동", 20);
		System.out.println(mem1.equals(mem2));
		

	}// end of main

}// end of class

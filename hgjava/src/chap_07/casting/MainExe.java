package chap_07.casting;

import chap_07.abstracts.Animal;
import chap_07.abstracts.Bird;

public class MainExe {
	public static void main(String[] args) {
		Animal animal = null;
		animal = new Bird();

		double d1 = 100; // 자동 형변환 됨.ㅣ
		// int n2 = 100.0 //double 에서 int 로 형변환 불가
		int n1 = (int) 100.0; // 강제형변환. 더블을 인트로.

		// promotion.(자동형변환)
		Parent p1 = new Child(); // 자동형변환
		// 비교 : Child c1 = new Parent(); //자동형변환이 일어나지 않음.

		// Child c1 = (Child) new Parent(); // casting : 강제형변환

		// 강제형변환
		// 변수의 유형은 부모, 담긴 유형은 자식 인스턴스인 경우 강제형변환은 ok
		// 그러나 부모인스턴스를 담고 있으면서 강제 형변환을 하면 안됨. 에러남.
		// 에러: 컴파일에러 / 실행에러
		Parent p2 = new Parent(); // 부모 클래스 인스턴스 p2
		Child c2 = new Child(); // 자식클래스 인스턴스 c2

		p2 = c2; // = 는 같다가 아니고 대입 연산자임. 까먹지말기.
		// 형변환 하기 전에 인스턴스 유형을 체크해야됨.
		if (p2 instanceof Child) {
			Child c3 = (Child) p2;
		}

		System.out.println("end of prog.");

	}// end of main

}// end of class

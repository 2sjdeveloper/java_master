package chap_01;

import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello, Java");
		
		int x = 5;
		int y = x + 10;
		System.out.println(y);
		
		double z = 3.5;
		System.out.println(z);
		System.out.println("y = " + y);
		
	//문제 : 변수의 값 교환
		x = 3;
		y = 10;
		System.out.println("x:" + x + ", y:" + y);
		//값 교환
		int temp = x;
		x = y;
		y = temp;
		//출력
		System.out.println("x:" + x + ", y:" + y);
		
	//기본 타입
		//크기 순서 : byte < short < char(캐릭터는 음수표현 불가) < int < long
		
		char charData = 'a';
		int intData = charData;
		System.out.println("char : " + charData + ", int : " + intData);
		
		charData = 'A';
		intData = charData;
		System.out.println("char : " + charData + ", int : " + intData);
		// '' : 한글자, "" : 문자열. 문자열은 스트링 타입

	//타입변환
		System.out.println("타입변환");
		char c1 = 'a';
		int c2 = c1 + 2; //자동타입 변환	
		char c3 = (char)c2; //강제 타입 변환
		System.out.println(c2 + " c3 : " + c3);
		//90쪽 printf문 예제
		System.out.printf("c2값은 : %d, c3값은 : %s \n",c2,c3);
		System.out.println("c2값은 :" + c2 + " c3값은 :" +  c3); //두개가 같은 문장임. printf, println의 입력 방식의 차이.
		
		x = 5;
		y = 2;
		double result = (double)x / y;
		System.out.println(result);
		
		double v1 = 3.5;
		double v2 = 2.7;
		int result2 = (int)(v1 + v2);
		System.out.println(result2);
		
		//확인문제 9번.
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result3 = (int)(var1 + var2 + var3) + (int)(Double.parseDouble(var4));
		System.out.println(result3);
		
	//표준입력 : 키보드 => System.in.read()
		//단점 : 한글자만 읽어들이기때문에 통문자열로 읽지 못함.
		System.out.println("교재 92쪽");
		
//		int keyCode;
//		while(true) {
//			keyCode = System.in.read();
//			System.out.println("keyCode : " + keyCode);
//			if(keyCode == 113) {
//				break;
//			}
//		}
//		System.out.println("종료");
		
		//문자열 입력하기 위해 Scanner 클래스 (단점을 보완하기 위한 장치) -> 이 클래스를 이용해 객체를 생성해서 사용
		String scinput;
		Scanner sc = new Scanner(System.in); //임포트 에러가 떠서 "컨트롤+시프트+O" 사용했음. System.in 이 두개라서 위에거는 주석처리
		while(true) {
			System.out.print("이름 입력 : ");
			scinput = sc.nextLine();
			if(scinput.equals("q")) {
				break;
			}
			System.out.println("내 이름은 " + scinput);
		}
		System.out.println("종료");

		System.out.print("수 입력 : ");
		scinput = sc.nextLine();
		System.out.println(scinput + 10); //문자열로 받음
		System.out.println(Integer.parseInt(scinput) + 10); //계산가능한 숫자로 받음
		
		
		sc.close(); //입력장치 닫아줌

		
		
	} //end main

} //end class Hello

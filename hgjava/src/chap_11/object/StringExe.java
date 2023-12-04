package chap_11.object;

import javax.print.attribute.standard.NumberUpSupported;

public class StringExe {

	public static void main(String[] args) {

		String[] fileNames = { "c:/images/prod/smaple.jpg", "d:/test/sample/americano.png",
				"d:/goods/test/2023/moka.jpg" };
		for (String file : fileNames) {
			System.out.println(findFileName(file));
		}

		String[] numbers = { "980404-1234567", "980808-2234567", "020101-3456789", "030101-4567890", "0303034567890" };

		for (String no : numbers) {
			System.out.println(findGender(no));
		}

		byte[] b1 = "Hello".getBytes();
		for (byte b : b1) {
			System.out.println(b);
		}

		String name = new String(new byte[] { 65, 66, 67, 68, 69 });
		name = new String(b1);
		System.out.println(name);

		char c1 = name.charAt(0);
		System.out.println(c1);

	}// end of main

	// 성별을 반환
	static String findGender(String ssn) { 	//메서드 이름 : findgender
		//static : 정적 변수. 함수 이름으로 바로 호출 가능
		//string : 함수의 반환값 지정
		//findgender : 함수의 이름
		//string ssn : 함수의 인수 매개값(string형식으로 들어와야됨)을 ssn으로 임의 지정
		
		// 주민등록 번호 1,2,3,4로 판별

		int length = ssn.length();
		if (length == 14) {
			if (ssn.charAt(7) == '1' || ssn.charAt(7) == '3') {
				return "남";
			} else {
				return "여";
			}

		} else if (length == 13) {
			if (ssn.charAt(6) == '1' || ssn.charAt(6) == '3') {
				return "남";
			} else {
				return "여";
			}
		} else
			return null;
	}// end of findGender

	// 파일명 가져오기
	static String findFileName(String file) { //메서드 이름 : findFileName
		int location = file.lastIndexOf("/") + 1;
		String find = file.substring(location);
		return find;
	}

	// 파일명 가져오기 교수님 풀이.
//	static String findFileName(String file) {
//		
//		int pos = 0;
//		while (true) {
//			int pos2 = file.indexOf("/", pos);
//			if (pos == -1) {
//				break;
//			}
//			pos2++;
//			pos = pos2;
//		}
//		return file.substring(pos);
//	}

}// end of class

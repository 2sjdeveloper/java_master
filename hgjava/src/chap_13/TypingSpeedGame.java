package chap_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TypingSpeedGame {
	public static void main(String[] args) {
		String word = "i am a student. how are you";
		String[] words = word.split(" ");
		Scanner scn = new Scanner(System.in);

		List<String> list = new ArrayList<>();
		for (String str : words) {
			list.add(str);
		}
		boolean run = true;
		long start = System.currentTimeMillis(); // 시작시간을 가져오는 명령문

		while (run) {

			// 컬렉션 목록 출력하고
			for (String str : list) {
				System.out.println(str);
			}
			System.out.println(list);
			System.out.print("단어 입력하세요 : ");
			System.out.println(list.size());
			
			// 사용자의 입력값 : 스캐너 사용해서 입력값을 변수에 저장.
			String vocabulary = scn.nextLine();
			
			// 사용자 입력값과 컬렉션의 값과 비교해서 같은 단어가 있으면 삭제
			for (int i = 0; i < list.size(); i++) {
				if (vocabulary.equals(list.get(i))) {
					list.remove(i);
				}
			}
			if (list.size() == 0) {
				// break;
				run = false;
			}

			// System.out.println(list.size());
		}
		long end = System.currentTimeMillis(); // 걸린시간을 가져오는 명령문
		System.out.println("걸린 시간: " + (end - start) / 1000 + "초");
		// 시간 계산하기

		System.out.println("end of game");

	}// end of main

}// end of class

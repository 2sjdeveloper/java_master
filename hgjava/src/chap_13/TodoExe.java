package chap_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class TodoExe {
	public static void main(String[] args) {
		// 순번(문자값 또는 숫자값으로 받을거면 key), 할일(Todo) DueDate 추가.
		// 맵타입?
		Map<Integer, Todo> todoList = new HashMap<>(); // 키는 인티저, 할일은 스트링타입.
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("번호 할일 기한 >>>");
			String input = scn.nextLine(); // "20 장보기 날짜(23-12-08) (엔터)" 라고 입력했다고 가정하면. 엔터까지 전체 읽어서 변수에 담아줌.
			String[] inpAry = input.split(" ");

			// 걸러낼 조건.
			if (inpAry.length != 2 && inpAry.length != 3) {
				System.out.println("입력값을 확인하세요.");
				continue;
			}
			String order = inpAry[0]; // 순번
			String title = inpAry[1]; // 할일 제목.

			Todo todo = null;
			if (inpAry.length == 2) {
				todo = new Todo(title);

			} else if (inpAry.length == 3) {
				String dueDate = inpAry[2];
				// Date -> String 또는 String -> Date
				// 2023-10-23 <- 이건 그냥 문자열. 포멧을 알려줘야됨. 데이트 객체가 알 수 있도록.
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // MM은 대문자로.
				try {
					todo = new Todo(title, sdf.parse(dueDate)); // 문자열을 파스 메소드로 데이트 타입으로 바꿔줌.
				} catch (ParseException e) {
					e.printStackTrace();
				}

			} // end of if

			todoList.put(Integer.parseInt(order), todo);

			if (todoList.size() == 3) {
				break;
			}
		}
		// 순번, 할일 출력.
		System.out.println("번호 할일  기한");
		System.out.println("==============");

		Set<Entry<Integer, Todo>> entry = todoList.entrySet();
		for (Entry<Integer, Todo> ent : entry) {
			System.out.println(ent.getKey() + "  " + ent.getValue().toString());
		}

		System.out.println("end of prog"); // 반복문 종료문이 없으면 데드코드가 됨.
	}// end of main

}
// end of class

package todo_p20231201;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		int year = 2023;
		int month = 12;
		System.out.println(year + "년" + month + "월 달력");

		Calendar today = Calendar.getInstance();

		// 10월 달력 만들기

		today.set(Calendar.YEAR, year);
		today.set(Calendar.MONTH, (month - 1));
		today.set(Calendar.DATE, 1);
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + today.getActualMaximum(Calendar.DATE));

		// 달력만들기
		// System.out.println("10월 달력");
		String[] days = { "Sun", "Mon", "Thu", " Wed", " Thr", " Fri", "Sat" };

		for (String day : days) {
			System.out.printf("%4s", day);
		}
		System.out.println();

		// 빈공백 생성
		long days1 = today.get(Calendar.DAY_OF_WEEK);
		for (int i = 0; i < days1 - 1; i++) {
			System.out.printf("%4s", "");
		}

		for (int i = 1; i <= today.getActualMaximum(Calendar.DATE); i++) {
			System.out.printf("%4d", i);
			if ((i + days1 - 1) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n== the end ==");
	}

}
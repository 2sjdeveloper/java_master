package chap_11.object;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		//1:YEAR, 2: MONTH, DAY_OF_WEEK:요일.(일:1, 월:2 ... 토:7)

		Calendar cal = Calendar.getInstance();
		cal.set(1, 2022); // == (Calendar.YEAR, 2022)
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DATE, 1);
		cal.set(2023, 2, 1); //월은 0부터 시작이라 +1 해줘야됨. 
		System.out.println("요일: " + cal.get(Calendar.DAY_OF_WEEK));
		System.out.println("막날: " + cal.getActualMaximum(Calendar.DATE));

	}// end of main
}

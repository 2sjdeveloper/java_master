package chap_11.object;

public class SystemExe {

	public static void main(String[] args) {
		// System
		// 1000 * 60 * 60 * 24
		long dayCnt = 1000 * 60 * 60 * 24 * 365;
		long cur = System.currentTimeMillis();
		// 현재시점의 Date값을 1970년 1월 1일 0시 0분 0초를 기준으로 해서 밀리세컨으로 표현
		System.out.println(cur / dayCnt);

		long start = System.currentTimeMillis();
		long sum = 0;
		for (int i = 1; i < 1000000; i++) {
			sum += i;
		}
		System.out.println("누적합: " + sum);
		long end = System.currentTimeMillis();
		System.out.println("걸린 시간: " + (end - start));

	}

}

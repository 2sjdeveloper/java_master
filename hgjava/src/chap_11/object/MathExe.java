package chap_11.object;

public class MathExe {
	public static void main(String[] args) {
		long result = (long) Math.round(-1.7);
		System.out.println("round: " + result);

//		for (int i = 1; i <= 10; i++) {
//			int r = (int) (Math.random() * 10); //0 <= r < 10
//			int r = 1 + (int) (Math.random() * 10); // 1<= r < 11	
//			System.out.println(r);
//		}

		// 61 ~ 100점.
		for (int i = 1; i <= 10; i++) {
			int x = 61 + (int) (Math.random() * 40); // 0<= x < 40
			System.out.print(" " + x);			
		}
		System.out.println("\n");

		// 1 ~ 6까지의 수. 랜덤하게. 배열로.
		int[] numbers = new int[5]; // 중복되지 않은 값을 배열에 저장.
//		// 1. 1~6 숫자 생성.
//		for (int j = 1; j <= 5; j++) {
//			int y = 1 + (int) (Math.random() * 6);// 0<= x < 6 이니까 +1 해줌.
//			
			for(int i = 0; i< numbers.length; i++) {
				boolean exist = false;
				int no = 1 + (int) (Math.random() * 6);
				for(int j = 0; j<i; j++) {
					if(numbers[j] == no)
						exist = true;
				}
				if(exist) {
					i--;
					continue;					
				}
				numbers[i] = no;
						
	}

			
		
		// 2. 생성된 값이 배열에 있는지 체크
		
		// 3. 없으면 추가한다.
		// 4. 배열이 다 차면 종료한다.
		
	}// end of main

}// end of class

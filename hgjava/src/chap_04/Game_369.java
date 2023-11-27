package chap_04;

public class Game_369 {

	public static void main(String[] args) {
		// 1~50 : 369게임

		// 3,6,9 숫자의 갯수 체크 변수

		int heart = 0;

		// 반복문으로 숫자 1~50까지 발생
		// 일의 자리에 3,6,9 갯수 체크
		for (int i = 1; i <= 50; i++) {
			
			heart = 0;
			//일의자리
			if (i % 10 == 3 | i % 10 == 6 | i % 10 == 9) {
				heart++;
			}
			//십의 자리
			if (i / 10 == 3) {
				heart++;
			}
			
			if (heart == 0) {
				System.out.print(i + "\t");
			} else if (heart == 1) {
				System.out.print("●\t");
			} else {
				System.out.print("●●\t");
			}
			
			if (i % 10 == 0) {
				System.out.println();
			}
		}

		// 십의 자리에 3,6,9 갯수 체크

		// 갯수가 0 => 숫자 출력
		// 갯수가 1 -> ●
		// 갯수가 2 -> ●


		//교수님 풀이
		//369 갯수 체크 변수 
		int cnt = 0;
		//숫자 1~50 반복문
		for(int i = 1; i <= 50; i++) {
			cnt = 0; //다음 수를 위한 초기화
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) cnt++; //일의 자리에 369갯수 체크
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) cnt++; //십의 자리에 369갯수 체크
			//갯수가 0 -> 숫자, 갯수가 1 -> ♥, 갯수가 2 -> ♥♥
			switch(cnt) {
			case 0 : System.out.print(i + "\t"); break;
			case 1 : System.out.print("♥\t"); break;
			case 2 : System.out.print("♥♥\t"); break;
			}
			if(i % 10 == 0) System.out.println(); //한줄에 10개씩 출력
		}
		
		//내가 생각했던 방법
		
		int num2 = 1;
		String blink = "";
		for(int i = 1; i <= 50; i++) {
			blink = "";
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				blink += "○";
			}
			if(i / 10 == 3) {
				blink += "○";
			}
			if (i % 10 != 3 && i % 10 != 6 && i % 10 != 9 && i / 10 != 3){
				blink += i;
			}
			System.out.print(blink +"\t");
			if(i % 10 == 0)System.out.println();
		}
			
		
		//for... 깃허브 테스트용 추가
		for() {
			System.out.println(askd);
		}
		
		
		
		
		
		
	}
}
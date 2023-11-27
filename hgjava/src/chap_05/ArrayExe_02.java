package chap_05;

public class ArrayExe_02 {

	public static void main(String[] args) {
	// 정수를 담을 수 있는 배열을 생성하시오(크기는 10개의 정수를 저장).
		// 변수 이름 : intAry : 10부터 100까지 저장.
		// 출력 코드 작성.
		
		
		//이건 내가 한거
//		int sum = 0;
//		int[] intAry = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//		for(int i = 0; i < intAry.length; i++) {
//		sum = sum + intAry[i];
//		}
//		System.out.println("intAry 합은 : " + sum);

		
		//교수님 풀이
		int[] intAry = new int[10]; // {10,20,30,40....100}
		for (int i = 0; i < intAry.length; i++) {
			intAry[i] = (i + 1) * 10;
		}
		
		//출력 확장for 구문
		int sum = 0; //50보다 큰 수를 저장.
		double avg = 0;
		int count = 0;
		for(int num : intAry) {
			System.out.println(num);
			if (num > 50) { // 50보다 큰 수를 sum에 누적하기 위한 if문.
				sum = sum + num;
			
				count++;
			}
		}
		avg = sum/count;
		
		System.out.println("50보다 큰 수의 합계: " + sum);
		System.out.println("50보다 큰 수의 평균: " + avg);
				
		
		

	
	}
}

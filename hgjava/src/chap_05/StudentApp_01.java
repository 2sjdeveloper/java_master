package chap_05;

import java.util.Scanner;

public class StudentApp_01 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int studentNum = 0;
		int[] scores = null;
		String[] names = null;

		
		//1. 학생수 2. 점수입력 3. 목록출력 4. 분석(최고점수, 평균) 5. 종료
		
		boolean run = true;
		while (run) {
			
			System.out.println("1. 학생수 2. 점수입력 3. 목록출력 4. 분석(최고점수, 평균) 5. 종료");
			int menu = scn.nextInt(); //3을 입력하고 엔터를 치면 입력한 3을 읽어들이는 것이 nextInt.
			scn.nextLine(); //엔터도 같이 처리함... 무슨 말인지 알듯말듯..
			
			switch(menu) {
			case 1:
				System.out.println("학생 수 입력 >>");
				studentNum = scn.nextInt();
				scores = new int [studentNum];
				names = new String[studentNum];
				break;
			case 2:
				System.out.println("점수 입력 >>");
				//for 반복.
				for(int i = 0; i < scores.length; i++) {
					System.out.print("names[" + i +"]>>");
					names[i] = scn.nextLine();
					System.out.print("scores[" + i + "]>> ");
					scores[i] = scn.nextInt();
					scn.nextLine(); 
				}
				break;
			case 3:
				System.out.println("목록 출력 >>");
				for(int i = 0; i < scores.length; i++) {
					System.out.print("이름은 " + names[i] + ", 점수는 "+ scores[i] + "\n");
				}
				break;
			case 4:
				System.out.println("분석 >>");
				//최고점수 출력. 구현.
				int maxScore = 0;
				double avg = 0;
				int sum = 0;
				String maxName ="";
				
				// for (int num : scores) {
				for(int i = 0; i < scores.length; i++) {
					sum += scores[i]; // sum = sum + num;			
					if(maxScore <scores[i]) {
						maxScore = scores[i];
						maxName = names[i];				
					}					
				}
				avg = sum * 1.0 / scores.length;
				System.out.println(maxName + "의" + " 점수" + maxScore + ", 평균: " + avg);
				break;
								
			case 5:
				System.out.println("종료 >>");
				run = false;
				break;
			} //end of switch.			
		} //end of while.		
		System.out.println("end of prog.");
	}

}

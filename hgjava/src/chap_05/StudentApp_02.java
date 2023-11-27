package chap_05;

import java.util.Scanner;

public class StudentApp_02 {
	static Scanner scn = new Scanner(System.in);
	static Student[] students = null;
	
	public static void addStudent() { //메소드 만들기		
		System.out.println("학생정보 입력 >>");
		for(int i = 0; i < students.length; i++) {
			Student student = new Student();
			System.out.print("학생 이름 입력 >> ");
			student.name = scn.nextLine();
			System.out.print("학생 점수 입력 >> ");
			student.score = Integer.parseInt(scn.nextLine());
			System.out.print("남/여 입력 >> ");
			student.gender = scn.nextLine();			
			students[i] = student;					
		}
	} //end of addStudent()
	
	public static void searchStudent() {
		System.out.print("조회할 이름 입력 >>");
		String name = scn.nextLine();
		boolean exists = false;				
		//학생이름 - 점수.. 형태로 출력.
		for(Student stdn : students) {
			if(name.equals(stdn.name)) {											
				System.out.println("이름은 " + stdn.name + ", 점수는 " + stdn.score);
				exists = true;											
			}
		}
		if(!exists) {
			System.out.println("이름이 없습니다");
		}		
	}//end of searchStudent();
	
	public static void analysis() {
		int sumOfMen = 0, cntOfMen = 0;
		int sumOfWomen = 0, cntOfWomen = 0;
		for(Student stn : students) { //확장 for문
			if(stn.gender.equals("남")) {
				sumOfMen += stn.score;
				cntOfMen++;						
			}else if(stn.gender.equals("여")) {
				sumOfWomen += stn.score;
				cntOfWomen++;
			}
		}
		System.out.println("남학생의 평균: " + (sumOfMen * 1.0 / cntOfMen));
		System.out.println("여학생의 평균: " + (sumOfWomen * 1.0 / cntOfWomen));
	}//end of analysis()
	
	
	
	public static void modify() { //이름 입력 -> 변경 점수 입력
		System.out.print("조회할 이름 입력 >>");
		String name = scn.nextLine();
		boolean exists = false;	
		
		for(int i = 0; i < students.length; i++) {
			//조건 추가 => 변경점수 입력. 
			if (name.equals(students[i].name)) {
				System.out.println("변경점수 입력 >>");
				students[i].score = Integer.parseInt(scn.nextLine());
				exists = true;
			}
		}
		//찾는 이름 없음.
		if(!exists) {
			System.out.println("조회할 이름이 없습니다");
		}
		
	}//end of modify

	
	
	public static void main(String[] args) {
		boolean run = true; 
		
		int studentNum = 0;
		
		while (run) {			
			System.out.println("1. 학생수 2. 점수입력 3. 조회 4. 분석(최고점수, 평균) 5. 수정 6. 종료");
			int menu = scn.nextInt();
			scn.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("학생수 입력 >>");
				studentNum = Integer.parseInt(scn.nextLine()); // "3" -> 3 .. 문자열을 int 타입으로 바꿔줌
				students = new Student[studentNum];
				break;
			case 2:
				addStudent();				
				break;
			case 3:
				searchStudent();				
				break;
				
			case 4: //분석.
				analysis();				
				break;
			case 5: 
				modify();
				break;
			case 6:
				System.out.println("종료 >>");
				run = false;
				break;
				
			}
		}//end of while			
	}//end of main()
} //end of class


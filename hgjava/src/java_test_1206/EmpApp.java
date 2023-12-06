package java_test_1206;

import java.util.Scanner;

public class EmpApp {
	public static void main(String[] args) {
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		EmpDAO exe = new EmpDAO();

		while (run) {
			System.out.println("1.등록 2.목록 3.수정(급여) 4.삭제 5.조회(조건:입사일자) 6.종료");
			System.out.println("============================");
			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1: // 등록
				System.out.println("사번 입력(예: 23-01)");
				String code = scn.nextLine();
				System.out.println("이름 입력");
				String name = scn.nextLine();
				System.out.println("전화번호 입력");
				String phone = scn.nextLine();
				System.out.println("입사일 입력(예: 2023-10-01)");
				String date = scn.nextLine();
				System.out.println("급여 입력");
				int income = Integer.parseInt(scn.nextLine());

				Employee empemp = new Employee(code, name, phone, date, income);

				if (exe.addEmp(empemp)) {
					System.out.println("저장완료");
				} else {
					System.out.println("저장실패");
				}
				break;

			case 2: // 목록
				System.out.println("사번  이름  전화번호  입사일자 급여");
				for (Employee empInfo : exe.getEmpList()) {
					if (empInfo != null) {
						empInfo.showInfo1();
					} else {
						System.out.println("목록 없음");
					}
				}
				break;

			case 3: // 수정(급여)
				System.out.println("수정 사번 입력(예: 23-01)");
				code = scn.nextLine();
				System.out.println("수정 급여 입력");
				income = Integer.parseInt(scn.nextLine());

				if (exe.modifyEmp(code, income)) {
					System.out.println("수정 완료");
				} else {
					System.out.println("수정 실패");
				}
				break;

			case 4: // 삭제
				System.out.println("삭제 사번 입력");
				code = scn.nextLine();

				if (exe.removeEmp(code)) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("삭제 실패");
				}
				break;

			case 5: // 조회
				System.out.println("조회 입사일자 입력(예: 2023-10-01)");
				date = scn.nextLine();
				System.out.println("사번  이름  입사일자");
				Employee empl = exe.getEmployee(date);
				if (empl != null) {
					empl.showInfo2();
				} else {
					System.out.println("없는 정보");
				}
				break;

			case 6:
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}

}

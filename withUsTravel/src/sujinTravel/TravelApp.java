package sujinTravel;

import java.util.Scanner;

public class TravelApp {
	public static void main(String[] args) {
		boolean run = true;

		Scanner scn = new Scanner(System.in);
		TravelMemberDAO memberDAO = new TravelMemberDAO();

//		1. 로그인을 먼저 한다. (특정 아이디로 관리자를 구분함)
//		==============================================================
//		로그인해주세요
//		아 이 디  : 
//		비밀번호 : 
//		==============================================================
		TravelMember tm = null;
		while (run) {
			System.out.println("==============로그인 해주세요========================================");
			System.out.println("아이디 입력 : ");
			String memId = scn.nextLine();
			System.out.println("비밀번호 입력 : ");
			String memPw = scn.nextLine();
			System.out.println("=================================================================");

			// db 조회해서 반환.
			 tm = memberDAO.logInCheck(memId, memPw);
			if (tm == null) {
				System.out.println("아이디, 비밀번호를 확인하세요");

			} else {
				System.out.println("권한은 " + tm.getMemRights() + "입니다");
				break;
			}
		}
		
		if(tm.getMemRights().equals("user")) { //user 권한으로 로그인시 출력내용
			System.out.println("===================================================");
			System.out.println("회원님 '모여서 투표로 국내여행'에 오신 것을 환영합니다.");
			System.out.println();
			System.out.println("1. 여행 계획을 올려 '여행기획자'가 되어보세요!");
			System.out.println("2. 다른 사람들의 계획을 보고 '좋아요' 투표를 해보세요!");
			System.out.println("3. 현재 확정된 '여행 계획'을 보고 여행을 떠나보세요!");
			System.out.println("===================================================");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("여행 계획 올리기");
				System.out.println("지역번호 입력(예: 02, 031, 053 등등)");
				String areaCode = scn.nextLine();
				System.out.println("여행 코스 입력");
				String travelCourse = scn.nextLine();
				System.out.println("여행 시간 입력");
				String useTime = scn.nextLine();
				System.out.println("여행 비용 입력");
				String useMoney = scn.nextLine();
				
				TravelPlan std = new TravelPlan(areaCode, travelCourse, useTime, useMoney);
				// if (dao...) 이거 할 차례 . bookapp에 33행
				//dao도 같이 손봐야됨.
				
				
				
			
			}
//			1-1-1. 여행 계획 올리기
//			지역 코드 >>
//			여행 코스 >>
//			소요 시간 >>
//			여행 경비 >>		
//			2. 여행 계획 테이블 : travel_plan
//			글번호(자동부여) : text_no
//			지역번호코드 : area_code
//			여행코스 : travel_course
//			시간 : use_time
//			비용 : use_money
//			작성자 아이디 : 
//			좋아요 : travel_like
//			글숨김 : text_hide

			
		}else { //관리자권한시 출력내용
		System.out.println("1. 회원 관리");	
		}
		
		


	} // end of main

}// end of class

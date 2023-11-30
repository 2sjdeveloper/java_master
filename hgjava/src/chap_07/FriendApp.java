package chap_07;

import java.util.Scanner;

import chap_06.Board;
import chap_06.BoardExe;
import chap_06.StudentExe;

public class FriendApp { // 컨트롤 역할
	static Scanner scn = new Scanner(System.in);
	FriendExe exe = new FriendExe();
//	static Friend[] storage = new Friend[10];
	static Friend[] friends;

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("1.등록 2.목록 3.조회 4.종료");
			int menu = Integer.parseInt(scn.nextLine());
			switch (menu) {
			case 1: // 등록.
				addFriend();
				break;
			case 2: // 목록.
				friendList();
				break;
			case 3: // 조회.
				getFriend();
				break;
			default:
				System.out.println("종료합니다.");
				run = false;

			}
		}

		// 오브젝트.. 클래스...?

	}// end of main.

	private static void addFriend() {
		System.out.println("1.친구 2.학교 3.회사 ");
		int subMenu = Integer.parseInt(scn.nextLine());

		Friend friend = null;

		// case 1: //이름, 연락처
		System.out.println("이름>>> ");
		String name = scn.nextLine();
		System.out.println("연락처>>> ");
		String phone = scn.nextLine();

		if (subMenu == 1) {
			friend = new Friend(name, phone); // Friend 클래스의 인스턴스를 만듦.
		} else if (subMenu == 2) {
			// case 2: //이름, 연락처, 학교, 전공
			System.out.println("학교>>> ");
			String univ = scn.nextLine();
			System.out.println("전공>>> ");
			String major = scn.nextLine();
			friend = new UnivFriend(name, phone, univ, major);
		} else if (subMenu == 3) {
			// case 3: //이름, 연락처, 회사, 부서
			System.out.println("회사>>> ");
			String comp = scn.nextLine();
			System.out.println("부서>>> ");
			String dept = scn.nextLine();
			friend = new CompFriend(name, phone, comp, dept); // 컴퍼니 인스턴스를 만들어줌...
		}

		// 배열에 추가.
		if (FriendExe.addFriend(friend)) {
			System.out.println("입력 성공");
		} else {
			System.out.println("처리 실패");
		}
	}// 등록하기 위한 메소드

	private static void friendList() {
		Friend[] friendAry = FriendExe.friendList();
		for (Friend frd : friendAry) {
			if (frd != null) {
				System.out.println(frd.showInfo());
			}
		}

	}// 목록조회 위한 메소드

	private static void getFriend() {
		// 이름조회, 연락처조회.
		System.out.println("1.이름 2.연락처");
		int subMenu = Integer.parseInt(scn.nextLine());
		String searchCond = "";
		if (subMenu == 1) {
			searchCond = scn.nextLine();
			for (Friend fnd : friends) {
				if (fnd != null && fnd.getName().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		} else if (subMenu == 2) {
			searchCond = scn.nextLine();
			for (Friend fnd : friends) {
				if (fnd != null && fnd.getPhone().equals(searchCond)) {
					System.out.println(fnd.showInfo());
				}
			}
		} else {
			System.out.println("1 또는 2 선택하세요.");
		}

	}// 단건조회 위한 메소드

	void backup() { // 백업 용도... 라는디... 뭘..? 백업..? ..
		Friend parent = new Friend();
		parent.setName("홍길동");
		parent.setPhone("010-1111");
		System.out.println(parent.toString());

		UnivFriend child = new UnivFriend();
		child.setName("김철수");
		child.setPhone("010-2222");
		child.setUniv("구미대학교");
		child.setMajor("컴퓨터공학과");
		System.out.println(child.showInfo());

		Friend[] friends = new Friend[10];
		friends[0] = parent;
		friends[1] = child;
	}

}

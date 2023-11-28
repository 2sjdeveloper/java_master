package chap_06;

public class chap06_MemberApp {

	public static void main(String[] args) {
		chap06_Member[] members = new chap06_Member[10];
		
		members[0] = new chap06_Member(1, "Hong", "010-2222", "Men");
		//멤버 인스턴스를 만들어서 배열에다가 담았다는 뜻
		members[1] = new chap06_Member(2, "Park", "010-3333", "Women");
		members[2] = new chap06_Member(3, "Choi", "010-4444", "Women"); 

		for (int i = 0; i < members.length; i++) { //배열을 쓸 때 값이 없으면 null 로 채워짐.
			if (members[i] != null && members[i].getGender().equals("Women")) // * 널 값이 아닐때만 출력하라는 메세지(&& 전까지). 배열 쓸 때는 필요함.
			members[i].showInfo(); //위 if문이 없었으면 세번째부터는 null 값으로 뜸.
		}	//그전에 showAllInfo 였을때, showInfo 는 에러남. 이거는 왜냐믄 뭐... 반환값이 없어서 어쩌구..... 
	
	}//end main	
	
	static void test1() {
		chap06_Member mem1 = new chap06_Member(); //인스턴스 생성.
		System.out.println(mem1);
		//mem1.memberNo = 10;
		mem1.setMemberNo(10);
		//mem1.memberName = "Hong";
		mem1.setMemberName("Hong");
		//mem1.phone = "010-1234-5678";
		mem1.setPhone("010-1234-5678");
		//mem1.gender = "Men";
		mem1.setGender("Men");
		
		mem1.showInfo();
		
		chap06_Member mem2 = new chap06_Member(11, "Hwang");
		//mem2.phone = "010-3333-4444";
		mem2.setPhone("010-3333-4444");
		mem2.showInfo();
		
		chap06_Member mem3 = new chap06_Member(12, "Park" , "010-2222-3333" , "Women");
		mem3.showInfo(); //반환유형 : void
		String msg = mem3.showAllInfo(); //반환유형 : String
		System.out.println(msg);
		//뭐하는지 잘 모르겠음. 이해가 안된다. 책이랑 찾아보기..
		
		}//end of test1.


		
		
		


}//end class

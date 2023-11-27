package chap_05;

//복합적인 형태의 데이터 구조를 만들때 클래스를 씀.
class Friend{
	String name; //필드
	int age; //필드	
	double height; //필드
}

public class ReferenceExe_01 {
	public static void main(String[] args) {
		
		//참조변수 : 실제 값을 담는것이 아니라 실제 값의 주소를 담고 있음.
		Friend myFriend = new Friend(); //new => 객체 생성
		myFriend.name = "김철수";
		myFriend.age = 20;
		myFriend.height = 178.3;
		
//		Friend ourFriend = myFriend;
//		
//		myFriend.name = "홍길동";
//		
//		System.out.println(ourFriend.name);
//		System.out.println(ourFriend.age);
//		System.out.println(ourFriend.height);
		
		Friend yourFriend = new Friend(); //new => 객체 생성
		yourFriend.name = "김철수";
		yourFriend.age = 20;
		yourFriend.height = 178.3;
		
		System.out.println(myFriend == yourFriend); //속성이 같은것 같아도 이 명령은 주소값을 비교하기때문에 결과는 false로 나옴.
		
		//기본타입.
		int a = 10;
		int b = a;
		
		a = 20;
		
		//참조타입: 주소값을 변수에 저장.
		String name = "신용권"; //23dbdae34334 ?? 이게 뭐여?
		String hobby = "독서";
		
		String name1 = name;
		name1 = "김용권";
		System.out.println("name: " + name);
		System.out.println("name1: " + name1);
		
		
		
		
	}

}

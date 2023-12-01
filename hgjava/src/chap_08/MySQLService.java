package chap_08;

//상속: extends : 부모클래스를 상속하겠다. 
//구현: implements : 추상매체들만 갖고 있는 인터페이스를 구현하겠다.는 의미
public class MySQLService implements DatabaseService {

	@Override
	public void add() {
		System.out.println("MySQL 입력처리기");

	}

	@Override
	public void modify() {
		System.out.println("MySQL 수정처리");

	}

	@Override
	public void remove() {
		System.out.println("MySQL 삭제처리");

	}

}

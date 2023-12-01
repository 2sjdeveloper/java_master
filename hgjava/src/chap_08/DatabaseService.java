package chap_08;

//추상클래스처럼 추상메소드만 정리할 수 있음.
//Oracle : insert(), update() / MySQL : add(), modify()
//
public interface DatabaseService {
	public static final String name = ""; // 상수만 사용 가능.
	// 입력, 수정, 삭제

	// 입력
	public void add();

	// 수정
	public void modify();

	// 삭제
	public void remove();

}

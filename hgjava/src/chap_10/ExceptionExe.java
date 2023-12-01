package chap_10;

public class ExceptionExe {
	public static void main(String[] args) {

		// 일반예외 : 반드시 예외를 처리해줘야함. 안그러면 컴파일이 안됨.
		

		System.out.println("end of prog.");
	}
	
	public static void test() {
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}

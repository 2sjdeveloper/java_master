package remind_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainExe {
	static Connection conn;
	public static void main(String[] args) {
		// jdbc lib
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver"); //클래스 확인
			conn = DriverManager.getConnection(url, "dev", "dev"); //커넥션 어쩌구
			System.out.println("연결 성공");
			//select();
			String sql ="insert into student (stu_no, stu_name, eng, math)\r\n"
					+ "values(?, ?, ?, ?)";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "23-003");
			psmt.setString(2, "박씨");
			psmt.setInt(3, 80);
			psmt.setInt(4, 85);
			
			//입력, 수정, 삭제 => executeUpdate(); 메소드 사용.
			int r = psmt.executeUpdate();
			if(r == 1) {
				System.out.println("입력 성공");
			}

		} catch (Exception e) {
			e.printStackTrace();
			// System.out.println("드라이브 없음."); //에러 메세지를 보기위해 주석처리.
		}

	} //main

	public static void select() throws Exception {
		String sql = "select * from student";
		PreparedStatement psmt = conn.prepareStatement(sql);
		ResultSet rs = psmt.executeQuery(); //셀렉트 문을 실행하는 쿼리 
		while (rs.next()) {
			System.out.println("번호:" + rs.getString("stu_no") + ", 이름:" + rs.getString("stu_name") + ", 영어:"
					+ rs.getInt("eng") + ", 수학:" + rs.getInt("math"));
		}

	}
	
	
}



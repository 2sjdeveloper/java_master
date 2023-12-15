package sujinTravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TravelMemberDAO {

//회원 
//테이블 : travel_member
//아이디 : mem_id
//비밀번호 : mem_pw
//이름 : mem_name
//권한 : mem_rights 값을 넣을 때 회원/관리자따로
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.err.println("연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}


	
}// end of class

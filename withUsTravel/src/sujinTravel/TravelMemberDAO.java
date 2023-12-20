package sujinTravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


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
		String url = "jdbc:oracle:thin:@192.168.0.33:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}



	TravelMember logInCheck(String id, String pw) {
		getConn();
		String sql = "select * from travel_member where mem_id = ? and mem_pw = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				TravelMember pm = new TravelMember();
				pm.setMemId(id);
				pm.setMemPw(pw);
				pm.setMemRights(rs.getString("mem_rights"));

				return pm;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}// end of class

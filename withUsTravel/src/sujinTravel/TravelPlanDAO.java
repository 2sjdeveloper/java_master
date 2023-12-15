package sujinTravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TravelPlanDAO {
	
	
	
//	2. 여행 계획 테이블 : travel_plan
//	글번호(자동부여) : text_no
//	지역번호코드 : area_code
//	여행코스 : travel_course
//	시간 : use_time
//	비용 : use_money
//	작성자 아이디 : 
//	좋아요 : travel_like
//	글숨김 : text_hide
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;	
	
	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	
	
	}
}

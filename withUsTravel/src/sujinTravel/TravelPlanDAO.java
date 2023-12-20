package sujinTravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

	// 필드
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

	void disconn() {
		try {
			if (conn != null)
				conn.close();
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 1. 여행 계획 입력
	boolean addPlan(TravelPlan tp) {
		getConn();
		String sql = "insert into travel_plan\r\n" + "values (text_auto_no.nextval, ?, ?, ?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tp.getAreaCode());
			psmt.setString(2, tp.getTravelCourse());
			psmt.setString(3, tp.getUseTime());
			psmt.setString(4, tp.getUseMoney());
			psmt.setString(5, tp.getMemId());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return false;
	}

	// 2. 목록
	ArrayList<TravelPlan> getTravelPlanList() {
		getConn();
		ArrayList<TravelPlan> travels = new ArrayList<>();

		String sql = "select * from travel_plan order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				TravelPlan travelPlan = new TravelPlan();
				travelPlan.setTextNo(rs.getInt("text_no"));
				travelPlan.setAreaCode(rs.getString("area_code"));
				travelPlan.setTravelCourse(rs.getString("travel_course"));
				travelPlan.setUseTime(rs.getString("use_time"));
				travelPlan.setUseMoney(rs.getString("use_money"));
				travelPlan.setMemId(rs.getString("mem_id"));

				travels.add(travelPlan);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return travels;
	}

	// 3. 조회하기
	TravelPlan getTravelPlan(String travelNo) {
		getConn();
		String sql = "select * \r\n"//
				+ "from travel_plan\r\n"//
				+ "where text_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, travelNo);
			rs = psmt.executeQuery();
			if (rs.next()) {
				TravelPlan travelPlan = new TravelPlan();
				travelPlan.setTextNo(rs.getInt("text_no"));
				travelPlan.setAreaCode(rs.getString("area_code"));
				travelPlan.setTravelCourse(rs.getString("travel_course"));
				travelPlan.setUseTime(rs.getString("use_time"));
				travelPlan.setUseMoney(rs.getString("use_money"));
				travelPlan.setMemId(rs.getString("mem_id"));

				return travelPlan;

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// 관리자 권한 2. 삭제하기
	boolean removeTravel(String travelNo) {
		getConn();
		String sql = "delete from travel_plan " + "where text_no = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, travelNo);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}// end of class
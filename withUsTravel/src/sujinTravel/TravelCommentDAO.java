package sujinTravel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TravelCommentDAO {

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

	// 3-1. 댓글 달기
	boolean addTravelComment(TravelComment comment) {
		getConn();
		String sql = "insert into travel_comment \r\n" + "values(comment_auto_no.nextval, ?, sysdate)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, comment.getComment());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}
		} catch (

		SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//댓글 조회
	ArrayList<TravelComment> getCommentList() {
		getConn();
		ArrayList<TravelComment> comments = new ArrayList<>();
		String sql = "select *\r\n" + "from travel_comment\r\n" + "order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				TravelComment travelComment = new TravelComment();
				travelComment.setCommentNo(rs.getInt("comment_no"));
				travelComment.setComment(rs.getString("comment_content"));

				comments.add(travelComment);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return comments;

	}

}

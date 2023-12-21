package common;
//저장공간 : 오라클 DB.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//추가/수정/삭제/목록/단건조회.

public class StudentDAO { // 스튜던트exe의 기능을 여기에 넣는다... 디비 활용.
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 클래스 확인
			conn = DriverManager.getConnection(url, "dev", "dev"); // 커넥션 어쩌구
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 목록.
	public List<Student> getStudentlist() {
		getConn();
		List<Student> students = new ArrayList<>();
		String sql = "select * from student order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStuNo(rs.getString("stu_no"));
				student.setStuName(rs.getString("stu_name"));
				student.setEng(rs.getInt("eng"));
				student.setMath(rs.getInt("math"));

				students.add(student);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}// end of getStudentList()

// 추가.
	public boolean addStudent(Student std) {
		getConn();
		String sql = "insert into student values(?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, std.getStuNo());
			psmt.setString(2, std.getStuName());
			psmt.setInt(3, std.getEng());
			psmt.setInt(4, std.getMath());

			int r = psmt.executeUpdate(); // 디비에 처리된 건수 반환.
			if (r == 1) {
				return true; // 정상처리되면 트루 반환
			}

		} catch (SQLException e) {
			e.printStackTrace(); // 예외발생
		}
		return false; // 처리 중 에러 발생
	}// end of addStudent()

//단건 조회
	public Student getStudent(String sno) {
		getConn();
		String sql = "select * \r\n"//
				+ "from student\r\n"//
				+ "where stu_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sno);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Student student = new Student();
				student.setStuNo(rs.getString("stu_no"));
				student.setStuName(rs.getString("stu_name"));
				student.setEng(rs.getInt("eng"));
				student.setMath(rs.getInt("math"));
				return student;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 값이 없으면 null 값 반환
	} // end of getStudent

//수정
	public boolean modifyStudent(String no, int eng, int math) {
		getConn();
		String sql = "update student\r\n"//
				+ "set eng = ?\r\n,"//
				+ "    math = ?\r\n"//
				+ "where stu_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, eng);
			psmt.setInt(2, math);
			psmt.setString(3, no);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	} // end of modifyStudent

//삭제(이름으로 여러건 삭제)
	public boolean removeStudent(String name) {
		getConn();
		String sql = "delete from student " + "where stu_name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}

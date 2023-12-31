package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public Connection getConn() {
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
}

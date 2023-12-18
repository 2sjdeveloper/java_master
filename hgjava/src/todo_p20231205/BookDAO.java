package todo_p20231205;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import remind_06.Student;

//1.등록 2.목록 3.단건조회 4.수정 5.삭제 6.종료

public class BookDAO {
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	Connection getConn() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, "dev", "dev");
			System.out.println("연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	// 연결 접속 해제
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

//1. 등록
	boolean addBook(Book book) {
		getConn();
		String sql = "insert into book values(?,?,?,?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getBookCode());
			psmt.setString(2, book.getBookTitle());
			psmt.setString(3, book.getAuthor());
			psmt.setString(4, book.getPress());
			psmt.setInt(5, book.getPrice());

			int r = psmt.executeUpdate();
			if (r == 1) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

//2. 목록(컬렉션 형태)
	ArrayList<Book> getBookList() {
		getConn();
		ArrayList<Book> books = new ArrayList<>();

		String sql = "select * from book order by 1";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_code"));
				book.setBookTitle(rs.getString("book_title"));
				book.setAuthor(rs.getString("author"));
				book.setPress(rs.getString("press"));
				book.setPrice(rs.getInt("price"));

				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconn();
		}

		return books;
	} // end of getBookList()

//3. 단건조회
	Book getBook(String bcode) {
		getConn();
		String sql = "select * \r\n"//
				+ "from book\r\n"//
				+ "where book_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bcode);
			rs = psmt.executeQuery();
			if (rs.next()) {
				Book book = new Book();
				book.setBookCode(rs.getString("book_code"));
				book.setBookTitle(rs.getString("book_title"));
				book.setAuthor(rs.getString("author"));
				book.setPress(rs.getString("press"));
				book.setPrice(rs.getInt("price"));

				return book;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null; // 조회된 값이 없으면 null 값 반환
	} // end of getBook

//4.수정
	boolean modifyBook(String bcode, int price) {
		getConn();
		String sql = "update book\r\n"//
				+ "set price = ?\r\n"//
				+ "where book_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, price);
			psmt.setString(2, bcode);
			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	} // end of modifyBook

//5.삭제
	boolean removeBook(String bookCode) {
		getConn();
		String sql = "delete from book " + "where book_code = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, bookCode);

			int r = psmt.executeUpdate();
			if (r > 0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}// class

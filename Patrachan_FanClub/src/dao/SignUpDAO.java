package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.AccountDTO;

public class SignUpDAO {

	//データベースへアクセスするための情報
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";//MySQLドライバ
	private final String DB_URL = "jdbc:mysql://localhost:3306/";//DBサーバー名
	private final String DB_NAME = "patrachan_fanclub_db";//データベース名
	private final String DB_ENCODE = "?useUnicode=true&characterEncoding=utf8";//文字化け防止
	private final String JDBC_URL = DB_URL + DB_NAME + DB_ENCODE;//接続DBとURL
	private final String DB_USER = "root";//ユーザーID
	private final String DB_PASS = "root";//パスワード

	public void SignUpAccount(AccountDTO account) {

		//データベースへ接続
		try {
			//JDBCドライバの読み込み
			Class.forName(DRIVER_NAME);
			//データベースの読み込み
			Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);

			//sqlを初期化しておく
			String sql = "INSERT INTO FanInfo(sei, mei, dob_year, dob_month, dob_date, gender, zipcode, streetAddress, streetAddress2, phoneNumber, userId, password, mailAddress) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

			//sql文の?の部分に値を代入
			PreparedStatement pstmt = connection.prepareStatement(sql);
			pstmt.setString(1, account.getSei());
			pstmt.setString(2, account.getMei());
			pstmt.setInt(3, account.getDob_year());
			pstmt.setInt(4, account.getDob_month());
			pstmt.setInt(5, account.getDob_date());
			pstmt.setString(6, account.getGender());
			pstmt.setInt(7, account.getZipcode());
			pstmt.setString(8, account.getStreetAddress());
			pstmt.setString(9, account.getStreetAddress2());
			pstmt.setString(10, account.getPhoneNumber());
			pstmt.setString(11, account.getUserId());
			pstmt.setString(12, account.getPassword());
			pstmt.setString(13, account.getMailAddress());

			//SQL文を実行
			pstmt.executeUpdate();

		} catch(SQLException e) {
			System.out.println("データベースへアクセスできませんでした" + e);
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			System.out.println("ドライバが見つかりませんでした" + e);
			e.printStackTrace();
		}
	}
}

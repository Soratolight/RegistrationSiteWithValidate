package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.EmployeeAccount;
import model.Login;

public class EmployeeAccountDAO {

	//データベースへアクセスするための情報
	private final String DRIVER_NAME = "com.mysql.jdbc.Driver";//MySQLドライバ
	private final String DB_URL = "jdbc:mysql://localhost:3306/";//DBサーバー名
	private final String DB_NAME = "employee_db";//データベース名
	private final String DB_ENCODE = "?useUnicode=true&characterEncoding=utf8";//文字化け防止
	private final String JDBC_URL = DB_URL + DB_NAME + DB_ENCODE;//接続DBとURL
	private final String DB_USER = "root";//ユーザーID
	private final String DB_PASS = "root";//パスワード

	public EmployeeAccount findByLogin(Login login) {

		EmployeeAccount employeeAccount = null;

		//データベースへ接続
		try {
			//JDBCドライバの読み込み
			Class.forName(DRIVER_NAME);
			//データベースの読み込み
			Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS);
			//SELECT文
			if (login.getAuthority().isEmpty()) {
				String sql = "SELECT * FROM employee WHERE EMPLOYEE_ID = ? AND EMPLOYEE_PASSWORD = ?";
				PreparedStatement pstmt = connection.prepareStatement(sql);
				pstmt.setString(1, login.getEmployeeId());
				pstmt.setString(2, login.getEmployeePassword());

				ResultSet rs = pstmt.executeQuery();

				//一致したユーザーが存在した場合
				//そのユーザーを表すemployeeAccountインスタンスを生成
				if (rs.next()) {
					//結果からデータを取得
					String employeeId = rs.getString("EMPLOYEE_ID");
					String employeePassword = rs.getString("EMPLOYEE_PASSWORD");
					String employeeName = rs.getString("EMPLOYEE_NAME");
					String employeePosition = rs.getString("EMPLOYEE_POSITION");
					int authority = rs.getInt("AUTHORITY");
					employeeAccount = new EmployeeAccount(employeeId, employeePassword, employeeName, employeePosition,
							authority);
				}
			} else if (login.getAuthority().equals("999")) {
				//SQL文
				String sqlAdmin = "SELECT * FROM employee WHERE EMPLOYEE_ID = ? AND EMPLOYEE_PASSWORD = ? AND AUTHORITY = ?";

				PreparedStatement pstmtAdmin = connection.prepareStatement(sqlAdmin);

				//SELECT文の?の値を決めう
				pstmtAdmin.setString(1, login.getEmployeeId());
				pstmtAdmin.setString(2, login.getEmployeePassword());
				pstmtAdmin.setString(3, login.getAuthority());

				//SELECT文を実行し、結果表を取得
				ResultSet rs = pstmtAdmin.executeQuery();

				//一致したユーザーが存在した場合
				//そのユーザーを表すemployeeAccountインスタンスを生成
				if (rs.next()) {
					//結果からデータを取得
					String employeeId = rs.getString("EMPLOYEE_ID");
					String employeePassword = rs.getString("EMPLOYEE_PASSWORD");
					String employeeName = rs.getString("EMPLOYEE_NAME");
					String employeePosition = rs.getString("EMPLOYEE_POSITION");
					int authority = rs.getInt("AUTHORITY");
					employeeAccount = new EmployeeAccount(employeeId, employeePassword, employeeName, employeePosition,
							authority);
				}
			}

		} catch (SQLException e) {
			System.out.println("データベースへアクセスできませんでした" + e);
			e.printStackTrace();
			return null;
		} catch (ClassNotFoundException e) {
			System.out.println("ドライバが見つかりませんでした" + e);
			e.printStackTrace();
			return null;
		}
		return employeeAccount;
	}
}

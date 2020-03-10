package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.ZipcodeData;

public class ZipcodeDataDAO {
	//フィールド
	//接続するデータベースのアドレス
	private final String DB_PATH =  "jdbc:mysql://localhost:3306/zipcode20190218?useUnicode=true&characterEncoding=utf8";

	//データベースのユーザー名
	private final String DB_USERNAME = "root";
	//DBpass
	private final String DB_PASSWORD = "root";
	//JDBCドライバ
	private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	
	//コンストラクタでJDBCドライバを読み込む
	public ZipcodeDataDAO() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("ドライバが見つかりません");
			e.printStackTrace();
		}
	}
	
	public ZipcodeData findZipcodeData(String zipcode) {
		ZipcodeDataDAO result = null;
		//DAOのお約束① : try-with-resources分の中でDBへ接続
		try(Connection conn = DriverManager.getConnection(DB_PATH,  DB_USERNAME, DB_PASSWORD)){
			
			// SQLを用意
			String sql = "";
			sql += " SELECT"; //取り出す項目を書く
			sql += "pref";
			sql += ",city";
			sql += ",street";
			sql += ",pref_kana";
			sql += ",zipcode";
			sql += " FROM"; //どこから取り出すかを書く
			sql += " zipcode";
			sql += " WHERE"; //取り出す条件
			sql +=  " zipcode = ?";
			
			//PreparedStatementを作成
			PreparedStatement pStatement = conn.prepareStatement(sql);
			
			//PreparedStatement.set
		}
	}
}

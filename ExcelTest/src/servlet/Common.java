package servlet;

import java.sql.Connection;
import java.sql.DriverManager;

public class Common {
	static Connection getConnection() throws Exception {//DB接続関数
		String user = "root";
		String password = "";
		String url = "jdbc:mysql://localhost:3306/hanai?characterEncoding=UTF-8&serverTimezone=JST";
		Class.forName("com.mysql.cj.jdbc.Driver");//ドライバのロード
		Connection con = DriverManager.getConnection(url, user, password);
		return con;

	}

}

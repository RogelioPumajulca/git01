package com.upc.ds;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconexion {
	private static Connection connection = null;

	public static Connection connection() throws Exception {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/dbrepasoexamenparcial";

		String user = "root";
		String pwd = "LEXUS123";

		if (connection == null) {
			Class.forName(driver).newInstance();
			connection = DriverManager.getConnection(url, user, pwd);

		}

		return connection;
	}

}

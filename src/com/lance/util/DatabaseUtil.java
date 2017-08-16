/**
 * 数据库操作类
 */
package com.lance.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseUtil {

	private static String username;		// 用户名
	private static String password;		// 密码
	private static String dataBaseName;	// 数据库名

	// 加载时自动调用
	static {
		config("config/jdbc.properties");
	}

	// 实例化时候自动调用
	public DatabaseUtil() {
		config("config/jdbc.properties");
	}

	public static void config(String dataPath) {
		try {
			BufferedReader configStream = new BufferedReader(new FileReader(dataPath));// DatabaseUtil.class.getClassLoader.getResourceAsStream(jdbc.properties)
			Properties p = new Properties();
			p.load(configStream);
			username = p.getProperty("db.username");
			password = p.getProperty("db.password");
			dataBaseName = p.getProperty("db.dataBaseName");
			System.out.println(username);
		}
		catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/" + dataBaseName + "?useUnicode=true&characterEncoding=utf8", username,
					password);
		}
		catch (SQLException | ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		return connection;

	}
}

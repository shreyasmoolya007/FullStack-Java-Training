package com.alvas.jdbc;

import java.sql.*;

public class Delete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement stat = con.createStatement();
		stat.execute("delete from student where id = '1';");
		stat.close();
		con.close();
	}
}

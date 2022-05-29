package com.alvas.jdbc;

import java.sql.*;
public class Insert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stat = con.createStatement();
		stat.execute("insert into student values(2,'Kaito','kaitomoolya@gmail.com',897867564)");
		stat.close();
		con.close();
	}
}

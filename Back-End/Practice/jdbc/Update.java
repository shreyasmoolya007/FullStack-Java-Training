package com.alvas.jdbc;

import java.sql.*;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	Statement stat = con.createStatement();
	stat.execute ("update student set name = 'Shinichi' where id='2'");
	stat.close();
	con.close();
}
}

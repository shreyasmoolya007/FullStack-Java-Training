package com.alvas.jdbc;

import java.sql.*;

public class Select {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery("select * from student");
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
			
}
		stat.close();
		con.close();
}
}

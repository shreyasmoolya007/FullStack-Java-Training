package com.alvas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StatementSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstat = con.prepareStatement("select * from student");
		ResultSet res = pstat.executeQuery();
		while(res.next()) {
			System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4));
		}
		pstat.execute();
		con.close();
	}
}

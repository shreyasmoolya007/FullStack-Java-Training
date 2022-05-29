package com.alvas.jdbc;

import java.sql.*;
import java.util.*;

public class Statement {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstat = con.prepareStatement("insert into student values(?,?,?,?)");
		System.out.println("Enter id,name,email,phone");
		int id=s.nextInt();
		String name=s.next();
		String email=s.next();
		int phone=s.nextInt();
		pstat.setInt(1,id);
		pstat.setString(2,name);
		pstat.setString(3,email);
		pstat.setInt(4,phone);
		pstat.execute();
		con.close();
		}
}

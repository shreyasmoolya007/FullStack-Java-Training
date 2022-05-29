package com.alvas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StatementUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstat = con.prepareStatement("update student set name=? where id=?");
		System.out.println("Enter name you want to update by providing id");
		int id=s.nextInt();
		String name=s.next();
		pstat.setInt(2,id);
		pstat.setString(1,name);
		pstat.execute();
		con.close();
		}
}

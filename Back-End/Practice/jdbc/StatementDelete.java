package com.alvas.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StatementDelete {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		PreparedStatement pstat = con.prepareStatement("delete from student where id=?");
		System.out.println("Enter id to delete");
		int id=s.nextInt();
		pstat.setInt(1, id);
		pstat.execute();
		con.close();
		}
}

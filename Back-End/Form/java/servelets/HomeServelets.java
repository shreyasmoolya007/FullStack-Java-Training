package servelets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HomeServelets extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String age=req.getParameter("age");
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","root");
			PreparedStatement pstat = con.prepareStatement("insert into form2 values(?,?,?)");
			pstat.setString(1,id);
			pstat.setString(2,name);
			pstat.setString(3,age);
			pstat.execute();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}
	}
}




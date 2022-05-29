package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import DAO.PersonDemo;
@WebServlet("/delete")
public class DeletePerson extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		
		System.out.println("Inside delete --->\nID :"+id);
		
		PersonDemo pd=new PersonDemo();
		try {
			pd.deletePerson(id);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}

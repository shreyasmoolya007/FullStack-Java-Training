package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import DAO.PersonDemo;
import DTO.Person;

public class HomeServlets extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(req.getParameter("id"));
		int age=Integer.parseInt(req.getParameter("age"));
		String name=req.getParameter("name");
		System.out.println("Inside HomeServlets -->\nID :"+id+"\nname :"+name+"\nage :"+age);
		
		Person p=new Person();
		p.setId(id);
		p.setAge(age);
		p.setName(name);
		PersonDemo pd=new PersonDemo();
		try {
			pd.insertPerson(p);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import DTO.Person;

public class PersonDemo {
	public void insertPerson(Person p) throws Exception
	{
		int id=p.getId();
		String name=p.getName();
		int age=p.getAge();
		
		Connection con=getConnection();
		PreparedStatement pstat=con.prepareStatement("insert into person_details values(?,?,?)");
		
		pstat.setInt(1, id);
		pstat.setString(2, name);
		pstat.setInt(3, age);
		
		pstat.execute();
		con.close();
	}
	public static void updatePerson(Person p) throws Exception
	{
		Connection con=getConnection();
		PreparedStatement pstat=con.prepareStatement("update person_details set name=?,age=? where id=?");
		pstat.setInt(3,p.getId());
		pstat.setString(1,p.getName());
		pstat.setInt(2,p.getAge());
		
		System.out.println("Inside updatePerson -->\nID :"+p.getId()+"\nname :"+p.getName()+"\nage :"+p.getAge());
		pstat.execute();
		System.out.println("Inside updatePerson after -->\nID :"+p.getId()+"\nname :"+p.getName()+"\nage :"+p.getAge());
		con.close();
	}
	public static void deletePerson(int id) throws Exception
	{
		Connection con=getConnection();
		PreparedStatement pstat=con.prepareStatement("delete from  person_details where id=?");
		pstat.setInt(1, id);
		
		System.out.println("Inside deletePerson --->\nID :"+id);
		pstat.execute();
		
		con.close();
	}
	public static Connection getConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","root");
		return con;
	}
}

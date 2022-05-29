package com.alvas.jdbcdemo;

import java.sql.*;
import java.util.Scanner;

public class EmployeeDriver {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		Employee e = new Employee();
		boolean exit=true;
		while(exit)
		{
			System.out.println("1]Insert Employee\n2]Delete Employee\n3]Update Employee details\n4]Show Employee\n5]Exit");
			int ch=s.nextInt();
			System.out.println("Enter the Employee ID");
			int empId1 = s.nextInt();
			e.setEmpId(empId1);
			switch(ch)
			{
			case 1: 
					System.out.println("Enter the Employee Name");
					String empName2 = s.next();
					System.out.println("Enter the Employee Gender");
					String gender3 = s.next();
					System.out.println("Enter the Employee Phone Number");
					long phone4 = s.nextLong();
					
					e.setEmpName(empName2);
					e.setGender(gender3);
					e.setPhone(phone4);
					insertEmployee(e);
					System.out.println("Employee Details Added Successfully");
					break;
			
			case 2: deleteEmployee(empId1);
					System.out.println("Employee Details Deleted Successfully");
					break;
					
			case 3: updateEmployee(e,empId1);
					break;
					
			case 4:displayEmployee(e);
				    break;
			
			case 5:exit=false;
			}
		}
	}
		
		public static void insertEmployee(Employee emp) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement pstat = con.prepareStatement("insert into new_table values(?,?,?,?)");
		    pstat.setInt(1,emp.getEmpId());
			pstat.setString(2,emp.getEmpName());
			pstat.setString(3,emp.getGender());
			pstat.setLong(4,emp.getPhone());
			pstat.execute();
			con.close();
		}
		
		public static void deleteEmployee(int empId1) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement pstat = con.prepareStatement("delete from new_table where empId=?");
			pstat.setInt(1,empId1);
			pstat.execute();
			con.close();
		}
		
		public static void updateEmployee(Employee e,int id) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement pstat;
			Scanner w = new Scanner(System.in);
			boolean exit=true;
			while(exit)
			{
				System.out.println("What you want to update...?\n1]Name\n2]Phone\n3]Exit");
				int z=w.nextInt();
				switch(z)
				{
				case 1:pstat = con.prepareStatement("update new_table set empName=? where empId=?");
					   System.out.println("Confirm the ID you have entered");
					   int x=w.nextInt();
					   pstat.setInt(2,x);
					   System.out.println("Enter the Employee Name");
					   String y=w.next();
					   pstat.setString(1,y);
					   pstat.execute();
					   break;
				case 2:pstat = con.prepareStatement("update new_table set phone=? where empId=?");
					   System.out.println("Confirm the ID you have entered");
					   int m=w.nextInt();
					   pstat.setInt(1,m);
					   System.out.println("Enter the Employee Phone");
					   long n=w.nextLong();
					   pstat.setLong(2,n);
					   pstat.execute();
					   break;
				case 3:exit=false;
				}
			}	
		}
		public static void displayEmployee(Employee e) throws Exception
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			PreparedStatement pstat = con.prepareStatement("select * from new_table");
			ResultSet res = pstat.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getLong(4));
			}
			pstat.execute();
			con.close();
		}
}


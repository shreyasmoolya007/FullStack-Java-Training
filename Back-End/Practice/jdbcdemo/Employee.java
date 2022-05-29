package com.alvas.jdbcdemo;

public class Employee {
		private int empId;
		private String empName;
		private String gender;
		private long phone;
		Employee emp;
		
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		public Employee()
		{

		}
		
		public Employee(int empId)
		{
			super();
			this.empId = empId;
		}
		
		public Employee(int empId, String empName)
		{
			super();
			this.empId = empId;
			this.empName = empName;
		}
		
		public Employee(int empId, String empName, String gender)
		{
			super();
			this.empId = empId;
			this.empName = empName;
			this.gender = gender;
		}
		
		public Employee(int empId, String empName, String gender, long phone) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.gender = gender;
			this.phone = phone;
		}
		
		
}

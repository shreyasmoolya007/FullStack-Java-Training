package DTO;


public class Person
{
	private int id,age;
	private String name;
		
	Person(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}



package COMPARE;

public class Employee {
    String name;
    int id;
    char gender;
    String address;
    Employee(String name,int id,char gender,String address)
    {
        this.name=name;
        this.id=id;
        this.gender=gender;
        this.address=address;
    }
    public boolean equals(Object o)
    {
        Employee e1=(Employee)o;
        if((this.name==e1.name)&&(this.id==e1.id)&&(this.gender==e1.gender)&&(this.address==e1.address))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Shinichi",1,'M',"Baker Street");
        Employee e2=new Employee("Shinichi",1,'M',"Baker Street");
        System.out.println(e1==e2);
        Employee e3=new Employee("Shinichi",1,'M',"Baker Street");
        Employee e4=new Employee("Shinichi",1,'M',"Baker Street");
        Employee e5=new Employee("Shinichi",1,'M',"Baker Street");
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
        System.out.println(e1.equals(e5));
    }
}

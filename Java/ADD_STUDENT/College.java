package ADD_STUDENT;

public class College {
    String college_name;
    String location;
    String capacity;
    String principal_name;
    Student s;

    College(String college_name,String location,String capacity,String principal_name)
    {
        this.college_name=college_name;
        this.location=location;
        this.capacity=capacity;
        this.principal_name=principal_name;
    }
        public void AddStudent()
        {
            if(this.s==null) {
                this.s = new Student("Shinichi", 17, 'M');
                System.out.println("Student added successfully");
            }
            else
                System.out.println("Student already present");
        }
        public void collegeDetails()
        {
            System.out.println(college_name);
            System.out.println(location);
            System.out.println(capacity);
            System.out.println(principal_name);
        }
        public void studentdetails()
        {
            System.out.println(s.name);
            System.out.println(s.age);
            System.out.println(s.gender);
        }
        public void RemoveStudent()
        {
            if(this.s!=null) {
                this.s = null;
                System.out.println("Student removed successfully");
            }
            else
            {
                System.out.println("Student is not present");
            }
        }

}

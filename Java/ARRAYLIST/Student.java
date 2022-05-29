package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    School_School ss=null;
    ArrayList<School_School> sal=new ArrayList();
    static Scanner scan=new Scanner(System.in);

    public void addStudent()
    {
        System.out.println("Enter the student id");
        int id=scan.nextInt();
        System.out.println("Enter the student name");
        String name=scan.next();
        System.out.println("Enter the Student number");
        long no=scan.nextLong();

        this.ss=new School_School(id,name,no);
        sal.add(ss);

    }
    public void studentDetails()
    {
        System.out.println("Enter the student id");
        int newId=scan.nextInt();

        for(School_School a:sal)
        {
            if(a.id==newId)
            {
                System.out.println(a);
                return;
            }
            System.out.println("Student not found");
        }
    }
    public void updateStudent()
    {
        System.out.println("Enter the student id");
        int newId=scan.nextInt();
        for(School_School a:sal)
        {
            if(a.id==newId)
            {
                System.out.println("Enter the name of the student");
                String name=scan.next();
                a.name=name;
                System.out.println("Student name updated");
                return;
            }
            System.out.println("Student not found");
        }
    }
    public void removeStudent()
    {
        System.out.println("Enter the Student id");
        int newId=scan.nextInt();
        for(School_School a:sal)
        {
            if(a.id==newId)
            {
                sal.remove(a);
                return;
            }
            System.out.println("Student does not exists");
        }
    }
}

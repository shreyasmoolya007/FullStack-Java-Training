package ARRAYLIST;

import java.util.Scanner;
public class StudentDriver {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Student stu=new Student();
        boolean exit=true;
        while(exit)
        {
            System.out.println("1]Add Student\n2]Student Details\n3]Update Student\n4]Remove Student\n5]Exit");
            int ch=s.nextInt();
            if(ch==1)
            {
                stu.addStudent();
            }
            else if(ch==2)
            {
                stu.studentDetails();
            }
            else if(ch==3)
            {
                stu.updateStudent();
            }
            else if(ch==4)
            {
                stu.removeStudent();
            }
            else
            {
                exit=false;
            }

        }
    }
}

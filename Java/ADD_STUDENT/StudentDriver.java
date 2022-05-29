package ADD_STUDENT;
import java.util.Scanner;
public class StudentDriver {
    public static void main(String[] args) {
        College c=new College("AIET","Mijar","Full1","Peter Parker");
        Scanner s=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
            System.out.println("1]Add Student\n2]Collge Details\n3]Student Details\n4]Remove Student\n5]Exit");
            System.out.println("Enter the Choice");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1 -> c.AddStudent();
                case 2 -> c.collegeDetails();
                case 3 -> c.studentdetails();
                case 4 -> c.RemoveStudent();
                case 5 -> exit=false;
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

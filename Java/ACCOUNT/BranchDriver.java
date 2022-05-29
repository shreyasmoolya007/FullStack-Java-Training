package ACCOUNT;

import java.util.Scanner;
public class BranchDriver {
    public static void main(String[] args)
    {

        Branch b=new Branch("peter",35200002);
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("1)create an account\n2)Account details\n3)Branch Attributes\n4)Delete account\n5)Exit\n\nEnter your choice:");
            int ch= s.nextInt();
            switch(ch)
            {
                case 1:b.createAccount();
                    break;
                case 2:b.a.accDetails();
                    break;
                case 3:b.branchAttribute();
                    break;
                case 4:b.deleteAcc();
                    break;
                case 5:System.exit(0);
                default:System.out.println("Enter the correct input!");
            }
        }

    }
}

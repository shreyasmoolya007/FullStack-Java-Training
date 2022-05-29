package ACCOUNT;

import java.util.Scanner;
public class Branch {
    private String manager_name;
    private long ifsc;
    Account a;

    Branch()
    {
    }
    Branch(String manager_name)
    {
        this.manager_name=manager_name;
    }
    Branch(String manager_name,long ifsc)
    {
        this(manager_name);
        this.ifsc=ifsc;
    }
    public String getManager_name()
    {
        return manager_name;
    }
    public long getIfsc()
    {
        return ifsc;
    }
    public void setManager_name(String manager_name)
    {
        this.manager_name=manager_name;
    }
    public void createAccount()
    {
        if(this.a!=null)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the account holder name:");
            String a=s.nextLine();
            System.out.println("Enter the account acc no:");
            long d=s.nextLong();
            System.out.println("Enter the account balance:");
            int c=s.nextInt();
            System.out.println("Account has been created successfully!!");
        }
        else {
            System.out.println("Account has already been created!!");
        }
    }

    public void branchAttribute()
    {
        System.out.println("Bank Manager name :"+manager_name);
        System.out.println("Bank IFSC code    :"+ifsc);
    }

    public void deleteAcc()
    {
        if(this.a!=null)
        {
            this.a=null;
            System.out.println("Deleted successfully!");
        }
        else
        {
            System.out.println("No account has been created!");
        }
    }
}

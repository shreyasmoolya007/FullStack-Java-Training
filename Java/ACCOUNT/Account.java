package ACCOUNT;

public class Account {
    private String account_holder_name;
    private long acc_no;
    private int bal;
    Account p=new Account();


    Account()
    {
    }

    Account(String account_holder_name)
    {
        this.account_holder_name=account_holder_name;
    }
    Account(String account_holder_name,long acc_no)
    {
        this(account_holder_name);
        this.acc_no=acc_no;
    }
    Account(String account_holder_name,long acc_no,int bal)
    {
        this(account_holder_name,acc_no);
        this.bal=bal;
    }
    public String toString()
    {
        return "Account Holder Name: "+account_holder_name+"Account NAme: "+acc_no+"Balance: "+bal;
    }

    /*public String getAccount_holder_name()
    {
        return account_holder_name;
    }
    public long getAcc_no()
    {
        return acc_no;
    }
    public int getBal()
    {
        return bal;
    }
    public void setAccount_holder_name(String account_holder_name)
    {
        this.account_holder_name=account_holder_name;
    }
    public void setBal(int bal)
    {
        this.bal=bal;
    }*/

    public void accDetails()
    {
        System.out.println(p);

    }
}

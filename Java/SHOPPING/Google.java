package SHOPPING;

import java.util.Scanner;
public class Google {
    Shopping a;
    Scanner s=new Scanner(System.in);

    public void addOrders()
    {
        System.out.println("Enter the shopping site");
        System.out.println("1)Flipkart\n2)Myntra\n3)Amazon");
        int ch=s.nextInt();
        if(ch==1)
        {
            System.out.println("Enter the belt name\n");
            String x=s.next();
            System.out.println("Enter the shoe name\n");
            String y=s.next();
            System.out.println("Enter the dress name\n");
            String z=s.next();
            this.a=new Flipkart(x,y,z);
        }
        else if(ch==2)
        {
            System.out.println("Enter the belt name\n");
            String x=s.next();
            System.out.println("Enter the shoe name\n");
            String y=s.next();
            System.out.println("Enter the dress name\n");
            String z=s.next();
            this.a=new Myntra(x,y,z);
        }
        else
        {
            System.out.println("Enter the belt name\n");
            String x=s.next();
            System.out.println("Enter the shoe name\n");
            String y=s.next();
            System.out.println("Enter the dress name\n");
            String z=s.next();
            this.a=new Amazon(x,y,z);
        }
    }
    public void shoppingDetails()
    {
        if(a instanceof Flipkart)
        {
            Flipkart p=(Flipkart)a;
            p.getBelt();
            p.getShoe();
            p.getDress();
        }
        else if(a instanceof Myntra)
        {
            Myntra p=(Myntra)a;
            p.getBelt();
            p.getShoe();
            p.getDress();
        }
        else
        {
            Amazon p=(Amazon)a;
            p.getBelt();
            p.getShoe();
            p.getDress();
        }
    }
    public void cancelOrders()
    {
        if(a instanceof Flipkart)
        {
            this.a=null;
            System.out.println("Flipkart order is cancelled");
        }
        else if(a instanceof Myntra)
        {
            this.a=null;
            System.out.println("Myntra order is cancelled");
        }
        else
        {
            this.a=null;
            System.out.println("Amazon order is cancelled");
        }
    }

}

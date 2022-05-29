package SHOPPING;

import java.util.Scanner;
class GoogleDriver
{
    public static void main(String[] args)
    {
        Google g=new Google();
        Scanner s=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
            System.out.println("Choose the option");
            System.out.println("1.add order\n2.Show shopping details\n3.Cancel\n4.Exit");
            int choice=s.nextInt();
            switch(choice)
            {
                case 1:g.addOrders();
                    break;
                case 2:g.shoppingDetails();
                    break;
                case 3:g.cancelOrders();
                    break;
                case 4:exit=false;
                default:System.out.println("Choose the correct option");

            }
        }
    }
}


package SWIGGY;
import java.util.Scanner;
public class SwiggyDriver {
    public static void main(String[] args) {
        Hotel h=new Hotel("Pavan",20,"Burger");
        boolean exit=true;
        while(exit)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("1]Book Order\n2]Swiggy Details\n3]Hotel Details\n4]Cancel Order\n5]Exit");
            System.out.println("Enter the choice:");
            int ch=s.nextInt();
            switch (ch) {
                case 1 -> h.BookDetails();
                case 2 -> h.Swiggydetails();
                case 3 -> h.hoteldetails();
                case 4 -> h.CancelOrder();
                case 5 -> exit=false;
                default -> System.out.println("Enter valid choice");
            }
        }
    }
}

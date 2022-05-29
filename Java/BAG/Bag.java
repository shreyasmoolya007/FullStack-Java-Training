package BAG;
import java.util.Scanner;
public class Bag {
    Ball b;
    Scanner s=new Scanner(System.in);
    public void addBall()
    {
        System.out.println("Enter the Game you want to play");
        System.out.println("1)Basket Ball\n2)Tennis Ball");
        int choice=s.nextInt();
        if(choice==1)
        {
            this.b=new BasketBall(10);
            System.out.println("Basketball Added");
        }
        else
        {
            this.b=new TennisBall(5);
            System.out.println("Tennis Added");
        }
    }
    public void isBagEmpty()
    {
        if(this.b==null)
        {
            System.out.println("Bag is empty");
        }
        else
        {
            System.out.println("Bag is full");
        }
    }
    public void removeBall()
    {
        if(b instanceof  BasketBall)
        {
            this.b=null;
            System.out.println("BasketBall is removed");
        }
        else
        {
            this.b=null;
            System.out.println("Tennis is removed");
        }
    }
    public void getRadius()
    {
        if(b instanceof BasketBall) {
            BasketBall c= (BasketBall) b;
            c.getRadius();
        }
        else
        {
            TennisBall d=(TennisBall) b;
            d.getRadius();
        }
    }
}

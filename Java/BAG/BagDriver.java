package BAG;

import java.util.Scanner;
public class BagDriver {
    public static void main(String[] args) {
        Bag g=new Bag();
        Scanner a=new Scanner(System.in);
        boolean exit=true;
        while(exit)
        {
            System.out.println("1)AddBall\n2)Is Bag Empty\n3)Remove Ball\n4)Get Radius\n5)Exit");
            int ch=a.nextInt();
            switch(ch)
            {
                case 1:g.addBall();
                        break;
                case 2:g.isBagEmpty();
                        break;
                case 3:g.removeBall();
                        break;
                case 4:g.getRadius();
                        break;
                case 5:exit=false;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

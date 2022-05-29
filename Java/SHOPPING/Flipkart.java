package SHOPPING;

public class Flipkart extends Shopping{
    Flipkart(String belt)
    {
        super(belt);
    }
    Flipkart(String belt,String shoe)
    {
        super(belt,shoe);
    }
    Flipkart(String belt,String shoe,String dress)
    {
        super(belt,shoe,dress);
    }

    public void getBelt()
    {
        System.out.println(belt);
    }
    public void getShoe()
    {
        System.out.println(shoe);
    }
    public void getDress()
    {
        System.out.println(dress);
    }
}

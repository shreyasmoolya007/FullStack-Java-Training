package SHOPPING;

public class Amazon extends Shopping{
    Amazon(String belt)
    {
        super(belt);
    }
    Amazon(String belt, String shoe)
    {
        super(belt,shoe);
    }
    Amazon(String belt, String shoe, String dress)
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

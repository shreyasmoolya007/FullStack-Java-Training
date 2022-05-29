package SHOPPING;

public class Myntra extends Shopping {
    Myntra(String belt) {
        super(belt);
    }

    Myntra(String belt, String shoe) {
        super(belt, shoe);
    }

    Myntra(String belt, String shoe, String dress) {
        super(belt, shoe, dress);
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


package SWIGGY;

public class Swiggy {
    int ord_no;
    int price;
    String location;

    Swiggy(int ord_no,int price,String location)
    {
        this.ord_no=ord_no;
        this.price=price;
        this.location=location;
    }
    public String toString()
    {
        return "Order No: "+ord_no+"\nPrice: "+price+"\nLocation: "+location;
    }
}

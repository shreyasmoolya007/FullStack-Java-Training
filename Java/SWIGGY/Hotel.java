package SWIGGY;

public class Hotel {
    String name;
    int capacity;
    String order_name;
    Swiggy s;

    Hotel(String name,int capacity,String order_name)
    {
        this.name=name;
        this.capacity=capacity;
        this.order_name=order_name;
    }
    public void BookDetails()
    {
        this.s=new Swiggy(125,200,"Banglore");
        System.out.println("Object created Successfully");
    }
    public void Swiggydetails() {
        System.out.println(s);
    }
    public void hoteldetails()
    {
        System.out.println(name);
        System.out.println(capacity);
        System.out.println(order_name);
    }
    public void CancelOrder()
    {
        this.s=null;
        System.out.println("The Order Canceled Successfilly");
    }
}
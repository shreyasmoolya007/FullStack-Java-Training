package MOBILE;

public class Mobile {
    String brand;
    String colour;
    long price;
    int ram;
    Sim s;

    Mobile(String brand,String colour,long price,int ram,Sim s)
    {
        this.brand=brand;
        this.colour=colour;
        this.price=price;
        this.ram=ram;
        this.s=s;
    }
    public void simdetails()
    {
        System.out.println("TalkTime Recharge is : "+s.talk_time);
        System.out.println("SimCard Name is : "+s.sim_name);
        System.out.println("SimCard Number is : "+s.sim_num);
    }
    public void mobiledetails()
    {
        System.out.println("The Mobile Brand is : "+brand);
        System.out.println("The Mobile Colour is : "+colour);
        System.out.println("The Mobile Price is : "+price);
        System.out.println("The Mobile Ram is : "+ram);
    }
}

package SHOW;

public class Ticket {
    private int ticketNo;
    private float price;
    private String movieTime;
    private String date;

    Ticket(int ticketNo,float price,String movieTime,String date)
    {
        this.ticketNo=ticketNo;
        this.price=price;
        this.movieTime=movieTime;
        this.date=date;
    }
    public String toString()
    {
        return "Ticket No: "+ticketNo+"\nPrice : "+price+"\nMovie Time: "+movieTime+"\nDate: "+date;
    }
    /*public int getticketNo()
    {
        return ticketNo;
    }
    public float getprice()
    {
        return price;
    }
    public String getmovieTime()
    {
        return movieTime;
    }
    public String getdate()
    {
        return date;
    }
    public void setticketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }
    public void setprice(float price)
    {
        this.price=price;
    }
    public void setmovieTime(String movieTime)
    {
        this.movieTime=movieTime;
    }
    public void setdate(String date)
    {
        this.date=date;
    }*/
}


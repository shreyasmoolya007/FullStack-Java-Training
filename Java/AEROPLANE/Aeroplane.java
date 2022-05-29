package AEROPLANE;

public class Aeroplane {
    String air_name;
    String air_start;
    String air_dest;
    Airport p;

    Aeroplane(String air_name,String air_start,String air_dest,Airport p)
    {
        this.air_name=air_name;
        this.air_start=air_start;
        this.air_dest=air_dest;
        this.p=p;
    }
    public void aeroplanedetails()
    {
        System.out.println("The Aeroplane Name is: "+air_name);
        System.out.println("Starting point is: "+air_start);
        System.out.println("Destination point is: "+air_dest);
    }
    public void airportdetails()
    {
        System.out.println("The Airport Name is: "+p.port_name);
        System.out.println("The Airport Location is: "+p.port_loc);
        System.out.println("The Number of Passengers are: "+p.port_no);
    }
}

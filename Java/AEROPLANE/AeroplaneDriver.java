package AEROPLANE;

public class AeroplaneDriver {
    public static void main(String[] args) {
        Aeroplane a=new Aeroplane("Kingfisher","Manglore","Banglore",new Airport("Manglore International Airport","Manglore",20));
        a.aeroplanedetails();
        a.airportdetails();
    }
}

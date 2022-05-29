package MOBILE;

public class MobileSim {
    public static void main(String[] args) {
        Mobile m=new Mobile("Samsung","Black",20000,6,new Sim(199,"Idea",98765432));
        m.simdetails();
        m.mobiledetails();
    }
}

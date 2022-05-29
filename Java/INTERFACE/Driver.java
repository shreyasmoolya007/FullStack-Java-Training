package INTERFACE;

public class Driver {
    public static void main(String[] args) {
        B s=new B();
        s.m2();
        A.m1();
        s.m3();
        System.out.println(s.a);
        System.out.println(s.b);
    }
}

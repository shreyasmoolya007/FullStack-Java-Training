package VARIABLE_SHADOWING;

public class ClassDriver {
    public static void main(String[] args) {
        Class_A x=new Class_B();
        System.out.println(x.a);
        System.out.println(x.b);
        x.m1();
        x.m2();

        Class_A y=new Class_B();
        System.out.println(y.a);
        System.out.println(y.b);
        y.m1();
        y.m2();
    }
}

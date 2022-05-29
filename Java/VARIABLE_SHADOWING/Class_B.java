package VARIABLE_SHADOWING;

public class Class_B extends Class_A{
    int a=70;
    static int  b=80;

    public static void m1()
    {
        System.out.println("Hello class b");
    }
    public static void m2()
    {
        System.out.println("class b is Hello");
    }
}

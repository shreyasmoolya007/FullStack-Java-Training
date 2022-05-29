package PARENTCHILD;

public class ParentDriver {
    public static void main(String[] args) {
        Parent p=new Child();
        Child x=(Child)p;
        System.out.println(x.a);
        x.m1();
        System.out.println(x.b);
        x.m2();
    }
}

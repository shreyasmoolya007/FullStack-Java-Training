package FRUIT;

import java.util.Scanner;
public class FruitDriver {
    private static void greenapple() {
        GreenApple g=new GreenApple();
        System.out.println(g instanceof GreenApple);
        System.out.println(g instanceof Apple);
        System.out.println(g instanceof Fruit);
        //System.out.println(g instanceof Mango);
    }

    private static void apple() {
        Apple a=new Apple();
        System.out.println(a instanceof GreenApple);
        System.out.println(a instanceof Apple);
        System.out.println(a instanceof Fruit);
       // System.out.println(a instanceof Mango);
    }

    private static void mango() {
        Mango m=new Mango();
       //System.out.println(m instanceof GreenApple);
       // System.out.println(m instanceof Apple);
        System.out.println(m instanceof Fruit);
        System.out.println(m instanceof Mango);
    }

    private static void fruit() {
        Fruit f=new Fruit();
        System.out.println(f instanceof GreenApple);
        System.out.println(f instanceof Apple);
        System.out.println(f instanceof Fruit);
        System.out.println(f instanceof Mango);
    }

    public static void main(String[] args) {





        boolean exit=true;
        while(exit)
        {
            System.out.println("1)\n2)\n3)\n4)\n5)");
            Scanner s=new Scanner(System.in);
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:greenapple();
                    break;
                case 2:apple();
                    break;
                case 3:mango();
                    break;
                case 4:fruit();
                    break;
                case 5:exit=false;
                default:
                    System.out.println("Invalid Choice");
            }
        }


    }

}

package ARRAYLIST;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class StringDemo {
    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        a1.add(10);
        a1.add(true);
        a1.add(10.0);
        a1.add('C');
        a1.add("SHINICHI");
        System.out.println(a1);

        a1.remove(2);
        System.out.println(a1);
        ArrayList a2= (ArrayList) a1.clone();
        System.out.println(a2);
        System.out.println(a2.contains(true));

        PriorityQueue p=new PriorityQueue();

        p.add(1021);
        p.add(2350);
        p.add(6542);
        p.add(5488);
        System.out.println(p);

        ArrayList <Integer> a3=new <Integer> ArrayList();

        a3.add(100);
        a3.add(101);
        a3.add(102);
        a3.add(101);
        System.out.println(a3);

    }
}

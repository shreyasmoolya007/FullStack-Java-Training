package DIVIDE;

import java.util.Scanner;
public class Divide {
    int m,n;
    public static void divide(int m,int n)
    {
        int product=m/n;
        System.out.println("The Quotient is: "+product);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        int m=s.nextInt();
        System.out.println("Enter the second number");
        int n=s.nextInt();
        divide(m,n);
    }
}

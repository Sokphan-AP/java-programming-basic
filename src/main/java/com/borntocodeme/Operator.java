package com.borntocodeme;

public class Operator {
    public static void main(String[] args) {
        //1 Operator
        int a=10;
        int b=20;
        int total = a + b;
        int subtotal = a - b;
        int mult = a * b;
        int div = a / b;
        int remainder = b % 3;
        System.out.print("Total =" +total);
        System.out.println("Subtotal =" +subtotal);
        System.out.println("Mult =" +mult);
        System.out.println("Div =" +div);
        System.out.println("Remainder =" +remainder);
        //2 Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        //3Logical Operator
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators");
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!x || !y);

    }
}
package com.borntocodeme.condition;

public class IfElseCondition {
    public static void main(String[] args) {
        int absent = 2;
        double average = 30.50;
        if (average >= 25 && absent <= 10) {
            System.out.println("pass");
            System.out.println("Congratulation!!");
        } else{
            System.out.println("Fail");
            System.out.println("Try again next year");
        }
    }
}
package com.borntocodeme.condition;

import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {

        double average = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an average: ");
        average = input.nextDouble();

        // IF Statement
        if (average < 25) {
            System.out.println("Average is less than 25");
            System.out.println("You are failed");
            System.out.println("Please try again next month");
        }

        if (average >= 25) {
            System.out.println("Average is greater than or equal to 25");
            System.out.println("You are pass");
            System.out.println("Congratulations!");
        }

        // បិទ Scanner ឲ្យល្អ (ជាការអនុវត្តល្អ)
        input.close();
    }
}
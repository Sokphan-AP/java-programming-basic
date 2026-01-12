package com.borntocodeme;

public class Main {

    public static void main(String[] args) {

        // ប្រកាសអថេរ (variables)
        int studentId = 1;
        String studentName = "Sokphan";
        String studentGender = "Female";
        String dateOfBirth = "31/12/1990";
        String placeOfBirth = "Siem Reap";

        // បង្ហាញព័ត៌មានសិស្ស
        System.out.println("Student ID              = " + studentId);
        System.out.println("Student name            = " + studentName);
        System.out.println("Student gender          = " + studentGender);
        System.out.println("Student date of birth   = " + dateOfBirth);
        System.out.println("Student place of birth  = " + placeOfBirth);

        // ឬបើចង់បង្ហាញតាមរបៀបស្អាតជាងនេះ (ជម្រើសបន្ថែម)
        System.out.println("\n=== ព័ត៌មានសិស្ស ===");
        System.out.printf("អត្តលេខ៖ %d%n", studentId);
        System.out.printf("ឈ្មោះ៖ %s%n", studentName);
        System.out.printf("ភេទ៖ %s%n", studentGender);
        System.out.printf("ថ្ងៃខែឆ្នាំកំណើត៖ %s%n", dateOfBirth);
        System.out.printf("ទីកន្លែងកំណើត៖ %s%n", placeOfBirth);
    }
}
package com.bridgelabzs.empwage;

public class EmployeeWage {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        int Emp_RATE_PER_HOUR = 20;
        // variables
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);

        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * Emp_RATE_PER_HOUR;
        System.out.println("Emp wage: " + empWage);

    }

}
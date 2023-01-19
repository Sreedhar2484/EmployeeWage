package com.bridgelabzs.empwage;

import java.util.Random;

public class EmployeeWage {
    /*
     * Refactor the Code to write a Class Method to Compute Employee Wage
     */

    public static int wagePerHour = 20;
    public static int fullDayHours = 8;
    public static int halfDayHours = 4;
    public static int salary = 0;
    public static int monthlySalary = 0;
    public static int workingDaysPerMonth = 20;
    public static int days = 0;
    public static int monthlyHours = 0;

    public static int EmployeeWage(){
        System.out.println("Welcome to Employee Wage Computation Program");
        Random random = new Random(); // create object

        /*
         * for a month assuming 100 hours and 20day will give 0,1,2 random number
         */

         while(days!=20 && monthlyHours!=100){
            days++;
            int randomNum = random.nextInt(3);

            switch(randomNum){
                case 0:
                    System.out.println("Employee is absent");
                break;
                case 1:
					System.out.println("employee is present for Full Time: ");
					salary = wagePerHour * fullDayHours;
					monthlyHours = monthlyHours+fullDayHours;
					break;
				case 2:
					System.out.println("employe present for Part Time: ");
					salary = wagePerHour * halfDayHours;
					monthlyHours = monthlyHours+halfDayHours;
            }
            monthlySalary = monthlySalary + salary;
            System.out.println("total hours "+monthlyHours+" and Day "+ days + " salary is : " + salary);
        }
        System.out.println("Monthly Salary: " + monthlySalary);
		return monthlySalary;
    }

    public static void main(String[] args) {
        EmployeeWage();
    }
}


        
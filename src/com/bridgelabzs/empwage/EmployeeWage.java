package com.bridgelabzs.empwage;

import java.util.Random;

public class EmployeeWage {
    /*
     * Refactor the Code and caluculate wage for multiple companies
     */

    public static int fullDayHours = 8;
    public static int halfDayHours = 4;

    private final String companyName;
    private final int wagePerHour;
    private final int workingHours;
    private final int workingDays;

    static Random random = new Random();

    public EmployeeWage(String companyName, int wagePerHour, int workingHours, int workingDays){
        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.workingDays = workingDays;
        this.workingHours = workingHours;
    }
    
    public int caluculateWage(){
        int salary = 0;
        int totalSalary = 0;
        int totalWorkingHours = 0;
        int days = 0;
        while(totalWorkingHours<=workingHours && days <= workingDays){
            days++;
            int empCheck = random.nextInt(3);

            switch(empCheck){
                case 0:
                    System.out.println("Employee is absent");
                break;
                case 1:
					System.out.println("employee is present for Full Time: ");
					salary = wagePerHour * fullDayHours;
					totalWorkingHours = totalWorkingHours+fullDayHours;
					break;
				case 2:
					System.out.println("employee present for Part Time: ");
					salary = wagePerHour * halfDayHours;
					totalWorkingHours = totalWorkingHours+halfDayHours;
                default:
                    System.out.println("Employee is Absent");
            }
            System.out.println("Day: " + days + empCheck + " ");
            System.out.println("Working Hours: " + totalWorkingHours + " ");
            System.out.println("Salary is: " + salary + " ");
            totalSalary = totalSalary + salary;
        }
        return totalWorkingHours * wagePerHour;

    }

    public static void main(String[] args) {
        /* create new object and run  */
        EmployeeWage reliance = new EmployeeWage("Reliance", 20, 6, 12);
        EmployeeWage Dmart = new EmployeeWage("Dmart", 25, 4, 8);
        EmployeeWage Google = new EmployeeWage("Google", 50, 7, 14);

        System.out.println("Total Employee wage of "+ reliance.companyName +" company is " + reliance.caluculateWage());
        System.out.println("Total Employee wage of " + Dmart.companyName + " company is " + Dmart.caluculateWage());
        System.out.println("Total Employee wage of " + Google.companyName + " company is " + Google.caluculateWage());
        
    }
}


        
package com.bridgelabzs.empwage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int Full_Day_Hours = 8;
        int Emp_RATE_PER_HOUR = 20;
        int Total_Working_Days = 20;
        Random attendance = new Random();
        // variables
         int Check_Attendance = attendance.nextInt(3);
        switch (Check_Attendance) {
        case 1:
        	System.out.println("Employee Is Present");
        	System.out.println("Daily employee wage is:"+(Total_Working_Days*Emp_RATE_PER_HOUR*Full_Day_Hours));
            break;
        case 2 :
        	System.out.println("Employee Is Present But PartTime:");
        	System.out.println("Part Time Employee daily wage is:"+((Emp_RATE_PER_HOUR/2)*Full_Day_Hours*Total_Working_Days));
            break;
        default:
        	System.out.println("Employee is Abscent");
            break;
        }
	}
}
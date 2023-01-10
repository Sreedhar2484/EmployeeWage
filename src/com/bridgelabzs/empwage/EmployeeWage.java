package com.bridgelabzs.empwage;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        int Full_Day_Hours = 8;
        int Emp_RATE_PER_HOUR = 20;
        int Total_Working_Days = 0;
        int Total_Working_Hours = 0;
       
        // variables
        Random attendance = new Random();
         int Check_Attendance = attendance.nextInt(3);
         int check = new Random().nextInt(2);
        switch (Check_Attendance) {
        case 1:
                while (Total_Working_Hours <= 100 && Total_Working_Days < 20) {
                if (check == 1) {
                    Total_Working_Days++;

                    System.out.println(" employee wage for " + Total_Working_Days + " days is: "
                            + (Total_Working_Hours * Emp_RATE_PER_HOUR * Full_Day_Hours));
                } else {
                    System.out.println(" employee wage for " + Total_Working_Days + " hours is:"
                            + (Total_Working_Hours * Emp_RATE_PER_HOUR));
                    Total_Working_Hours++;
                }
            }
            System.out.println("Employee Is Present and performing full time");

        	
        case 2 :
                 while(Total_Working_Hours<=100 && Total_Working_Days<20) {
        		if(check ==1) {
        			Total_Working_Days++;
        	System.out.println("part Time Employee wage for "+Total_Working_Days+"days is: "+((Emp_RATE_PER_HOUR/2)*Full_Day_Hours*Total_Working_Days));
        		}else {
        			System.out.println("part Time Employee wage for "+Total_Working_Hours+"hours is:"+((Emp_RATE_PER_HOUR/2)*Total_Working_Hours));
        			Total_Working_Hours++;
        		}
        	}System.out.println("Employee Is Present But PartTime");

        	break;
        default:
        	System.out.println("Employee is Abscent");
        	break;
        }
	}
}
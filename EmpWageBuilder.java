package com.bridgeLabz;
import java.util.Random;
public class EmpWageBuilder {
    public static final int IS_PRESENT=1;
    public static final int IS_ABSENT=0;
    public static final int IS_FULLTIME=8;
    public static final int IS_PART_TIME=4;
    public static final int WAGE_PER_HOUR=20;
    public static final int NUMBER_OF_WORKING_DAYS=20;
    public static int DAILY_WAGE=0;
    public static int MONTHLY_WAGE=0;
    public static int TOTAL_HOURS=0;
    public static int HOURS=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation program");
        for( int i=0; i<NUMBER_OF_WORKING_DAYS && TOTAL_HOURS<100; i++) {
            Random random = new Random();
            int Emp_check = random.nextInt(3);
            switch (Emp_check) {
                case IS_PRESENT: {
                    System.out.println("Employee is present");
                    DAILY_WAGE = IS_FULLTIME * WAGE_PER_HOUR;
                    HOURS=IS_FULLTIME;
                    break;

                }
                case IS_ABSENT: {
                    System.out.println("Employee is Absent");
                    break;
                }
                default: {
                    System.out.println("Employee is part time ");
                    DAILY_WAGE = IS_PART_TIME * WAGE_PER_HOUR;
                    HOURS=IS_PART_TIME;
                    break;
                }
            }
            MONTHLY_WAGE = DAILY_WAGE + MONTHLY_WAGE;
            TOTAL_HOURS = HOURS + TOTAL_HOURS;
        }
        System.out.println("Daily wage : " +DAILY_WAGE);
        System.out.println("Monthly wage : " +MONTHLY_WAGE);

    }

}

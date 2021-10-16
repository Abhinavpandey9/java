package com.bridgeLabz;
import java.util.Scanner;
public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int YEAR = sc.nextInt();
        if ((YEAR <= 1000) || (YEAR >= 9999)){
            System.out.println("Please Enter the Four Digit Number");
        }

        else{
            if (((YEAR % 4 == 0) && (YEAR % 100 != 0)) || (YEAR % 400 == 0)) {
                System.out.println(YEAR + " is a Leap year");
            }
            else {
                System.out.println(YEAR + " is not a Leap Year");
            }

        }
    }
}

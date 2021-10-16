package com.bridgeLabz;
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers num1 and num2 : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double quotient,remainder;
        quotient = num1/num2;
        remainder = num1%num2;
        System.out.println("Quotient of the numbers is :" + quotient);
        System.out.println("Remainder of the numbers is : " + remainder);


    }
}

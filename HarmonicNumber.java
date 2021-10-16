package com.bridgeLabz;
import java.util.Scanner;
public class HarmonicNumber {
    public static double VALUE=0;
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double N = sc.nextInt();
        for (double i=1;i<=N;i++){
            VALUE=VALUE+(1/i);
        }
        System.out.println(VALUE + "Its the value for given n");
    }
}

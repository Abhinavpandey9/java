package com.bridgeLabz;
import java.util.Scanner;
public class PowerOfTwo {
    public static int VALUE = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N>0 && N<=31){
            for (int i=1;i<=N;i++){
                VALUE= VALUE*2;
            }
            System.out.println(VALUE + "its the value");
        }
    }
}

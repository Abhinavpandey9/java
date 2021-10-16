package com.bridgeLabz;
import java.util.Scanner;
public class PrimeFactors {
    public static void main(String args[]){
        int N;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        N = sc.nextInt();

        for(int i = 2; i*i< N; i++) {
            while(N%i == 0) {
                System.out.println(i+" ");
                N = N/i;
            }
        }
        if(N >2) {
            System.out.println(N);
        }
    }
}

package com.bridgeLabz;

import java.util.Random;
import java.util.Scanner;
public class FlipCoin {
    public static int HEAD_COUNT = 0;
    public static int TAIL_COUNT = 0;
    public static double HEAD_PERCENTAGE = 0;
    public static double TAIL_PERCENTAGE = 0;
    public static void main(String[] args) {
        System.out.println("Enter how many times to flip");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        for (int i=0;i<n;i++){
            Random rand = new Random();
            double coin = rand.nextInt(2);
            if (coin < 0.5){
                System.out.println("Its Tails");
                TAIL_COUNT = 1 + TAIL_COUNT;
                System.out.println(+TAIL_COUNT);
            }
            else {
                System.out.println("Its Heads");
                HEAD_COUNT = 1 + HEAD_COUNT;
                System.out.println(+HEAD_COUNT);
            }
        }
        HEAD_PERCENTAGE = (HEAD_COUNT/n)*100;
        TAIL_PERCENTAGE = (TAIL_COUNT/n)*100;
        System.out.println("Head_Percentage" +HEAD_PERCENTAGE);
        System.out.println("Tail_Percentage" +TAIL_PERCENTAGE);

    }
}

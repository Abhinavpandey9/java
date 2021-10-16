package com.bridgeLabz;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x and y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z;
        System.out.println("Before Swapping " + x + "  " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("After Swapping " + x + "  " + y);
    }
}

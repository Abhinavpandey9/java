package com.bridgeLabz;
import java.util.Scanner;
public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char ch = scanner.next().charAt(0);
        if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')){
            System.out.println(ch + " is a Vowel ");
        }
        else
            System.out.println(ch + " is a Constant");
    }
}

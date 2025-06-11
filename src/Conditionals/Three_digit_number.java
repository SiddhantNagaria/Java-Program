package Conditionals;

import java.util.Scanner;

public class Three_digit_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 99 && num < 1000) {
            System.out.println("number " + num + "is a three digit number");
        } else {
            System.out.println("number is not 3 digit");
        }
    }
}

package Conditionals;

import java.util.Scanner;

public class absoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num < 0) {
            num *= (-1);
        }
        System.out.println("absolute value is " + num);
    }
}

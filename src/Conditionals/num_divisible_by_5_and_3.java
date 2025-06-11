package Conditionals;

import java.util.Scanner;

public class num_divisible_by_5_and_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println("num is divisible by 5 and 3");
        } else {
            System.out.println("not divisible");
        }
    }
}

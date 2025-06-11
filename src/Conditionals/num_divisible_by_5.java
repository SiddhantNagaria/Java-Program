package Conditionals;

import java.util.Scanner;

public class num_divisible_by_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("number " + num + " is divible by 5");
        } else {
            System.out.println("number is not divible by 5");
        }
    }
}

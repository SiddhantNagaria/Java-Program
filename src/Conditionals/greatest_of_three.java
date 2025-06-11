package Conditionals;

import java.util.Scanner;

public class greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println(a + " is greater of three");
        } else if (b > a && b > c) {
            System.out.println(b + " is greater of three");
        } else {
            System.out.println(c + " is greater of three");
        }
    }
}

package Basics_of_Java;

import java.util.Scanner;

public class FindRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dividend : ");
        int a = sc.nextInt();
        System.out.println("Enter divisor :");
        int b = sc.nextInt();
        int q = a / b;
        int r = a - (b * q);
        int r_easy = a % b;
        System.out.println("remainder when " + a + " is divided by " + b + " is : ");
        System.out.println(r);
        System.out.println(r_easy);
    }
}


package Conditionals;

import java.util.Scanner;

public class Sides_of_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("triangle can be formed");
        } else {
            System.out.println("triangle cant be formed");
        }
    }
}

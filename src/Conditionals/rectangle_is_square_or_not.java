package Conditionals;

import java.util.Scanner;

public class rectangle_is_square_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        if (l == b) {
            System.out.println("it is square");
        } else {
            System.out.println("it is rectangle");
        }
    }
}

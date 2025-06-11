package Conditionals;

import java.util.Scanner;

public class Three_points_on_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = 3, x2 = 4, x3 = 6, y1 = 0, y2 = 4, y3 = 6;
        double m1 = y2 - y1 / x2 - x1;
        double m2 = y3 - y2 / x3 - x2;
        if (m1 == m2) {
            System.out.println("points are on a single line");
        } else {
            System.out.println("coordinates mismatch");
        }
    }
}

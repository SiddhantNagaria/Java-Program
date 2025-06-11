package Conditionals;

import java.util.Scanner;

public class Rectangle_area_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        if (area > perimeter) {
            System.out.println("area is greater than perimeter");
        } else {
            System.out.println("area is less than perimeter");
        }
    }
}

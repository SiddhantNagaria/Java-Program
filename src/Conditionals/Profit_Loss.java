package Conditionals;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price");
        int cp = sc.nextInt();
        System.out.println("enter selling price");
        int sp = sc.nextInt();
        if (cp > sp) {
            System.out.println("loss");
        } else if (cp < sp) {
            System.out.println("profit");
        }
    }
}

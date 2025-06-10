package Bitwise;

public class Bitwise_Operations {
    public static void main(String[] args) {
        int a = 9, b = 10;
        System.out.println(a&b); //8
        System.out.println(a|b); //11
        System.out.println(a^b); //3

        System.out.println(a<<1); //18
        System.out.println(a<<2); //36
        System.out.println(b<<1); //20
        System.out.println(b<<2); //40

        System.out.println(a>>1); //4
        System.out.println(a>>2); //2
        System.out.println(b>>1); //5
        System.out.println(b>>2); //2
    }
}

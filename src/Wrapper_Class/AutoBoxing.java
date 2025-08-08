//autoboxing  is automatic conversion of primitive data type to its wrapper class.

package Wrapper_Class;

public class AutoBoxing {
    public static void main(String[] args) {
        int a = 20;
        Integer A = a;  //autoboxing
        Integer AA = Integer.valueOf(a);    //int into Integer explicitly
        System.out.println(A);
        System.out.println(AA);
    }
}

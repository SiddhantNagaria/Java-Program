package String;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Siddhant Nagaria";

        for (int i = name.length() - 1; i >= 0; i--) {
            // System.out.print(name.charAt(i));
            System.out.println("i = " + i + "  char = " + name.charAt(i));
        }


    }
}

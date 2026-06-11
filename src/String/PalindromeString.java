package String;

public class PalindromeString {
    public static void main(String[] args) {
        String orgString = "ABCDEDCBA";
        String revString = "";

        for (int i = orgString.length() - 1; i >= 0; i--) {
            revString += orgString.charAt(i);
        }
//        if (orgString.equals(revString)) {
//            System.out.println("it is palindrome");
//        } else {
//            System.out.println("not palindrome");
//        }

        System.out.println(orgString.equalsIgnoreCase(revString) ? "palindrome" : "not palindrome");
    }
}

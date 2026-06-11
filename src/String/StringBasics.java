package String;

public class StringBasics {
    public static void main(String[] args) {
        String s1 = "Java";    // literal
        String s2 = new String("java");  // object
        System.out.println(s1 == s2);   //false - compare addresses
        System.out.println(s1.equals(s2));  //false  - compare content or value
        System.out.println(s1.equalsIgnoreCase(s2));    // true
        System.out.println(s1.length());    // 4
        System.out.println(s1.toLowerCase());   //java
        System.out.println(s2.toUpperCase());   //JAVA
        System.out.println(s1.charAt(1));   // a
        System.out.println(s1.substring(0, 2)); //Ja
        System.out.println(s1.subSequence(0, 3));   //Jav
        s1.concat(s2);
        System.out.println(s1); //Java
        String s3 = s1.concat(s2);
        System.out.println(s3); //Javajava
        System.out.println(s1.compareTo(s2));   //-32


    }
}

package String;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer("Java");
        StringBuffer buffer2 = new StringBuffer("Java");

        buffer1.append(buffer2);
        System.out.println(buffer1);

    }
}

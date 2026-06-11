package String;

public class StringBuilderEx {
    public static void main(String[] args) {
        StringBuilder builder1 = new StringBuilder("React");
        StringBuilder builder2 = new StringBuilder("React");
        builder2.append(builder1);
        System.out.println(builder2);
    }
}

package Exception_Handling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int a =args.length;
            System.out.println("a " + a);
            int b = 42/a;
            int c[] = {1};
            c[42] = 99;
        }catch(ArithmeticException e){
            System.out.println("Divide by 0 : " + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bounds : " + e);
        }
        System.out.println("After catch block");
    }
}

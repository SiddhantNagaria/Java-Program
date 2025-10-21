//TypeCasting- Convert one type into another type
//
//types of typecasting:
//
//1. Upcasting (Widening) lower datatype into a higher datatype.
//        Ex- int to double
//        Happens automatically
//        No data loss
//        Converts lower to higher data types
//        Upcasting Conversion Order:
//            byte short int→ long → float double
//
//2. Down casting (Narrowing) - higher datatype into a lower datatype.
//        Ex- double to int
//        Not automatic
//        Converts higher to lower data types
//        Data loss may occur
//        Downcasting Conversion Order:
//        double float long → int short → byte


package TypeCasting;

public class Type_casting {
    public static void main(String[] args) {

        //upcasting
        int empSalary = 97000;
        double employeeSalary = empSalary;
        System.out.println(empSalary);
        System.out.println(employeeSalary);

        //downcasting
        double price = 25000.43;
        int price2 = (int) price;
        System.out.println(price);
        System.out.println(price2);

        //string to int
        String empCode = "1099";
        int emplCode = Integer.parseInt(empCode);
        System.out.println(emplCode);

        //int to string
        int employeecode = 9901;
        String employCode = String.valueOf(employeecode);
        String ecCode = Integer.toString(employeecode);
        System.out.println(employCode);
        System.out.println(ecCode);
    }
}

//1. Final Class : A class declared as final cannot be extended by another class.
// This is useful when you want to create a class that should not be inherited to maintain its integrity.

// 2. Final Method: A method declared as final cannot be overridden by a subclass.
// This ensures that the method's implementation remains consistent and cannot be altered.

//3. Final Variable : A variable declared as final cannot be reassigned after it is initialized.
// It essentially acts as a constant

// HOW TO CREATE A CUSTOM IMMUTABLE CLASS IN JAVA
// 1. declare class with FINAL keyword
// 2. All variables are private
// 3. Dont use setter, use constructor
// 4. All fields make private and final

package Final_Concept;

class Customer{
    final int custCode = 555;
    void show(int custId, String custName){
//        custCode = 111; //cant reinitialize
        System.out.println("\n Customer id: " +  custId + " \n Customer Name: " + custName + "\n Customer Code: " + custCode);
    }
}
class Product extends Customer{
    //overriding possible because final keyword not used
    @Override
    void show(int custId, String custName) {
        super.show(custId, custName);
    }
}

public class Final_Concept {

    public static void main(String[] args) {
        Product product = new Product();
        product.show(121, "Siddhant");

        Customer cust= new Customer();
        cust.show(1234,"Nagaria");
    }
}

package OOPS.Inheritance;

class Company {
    void show() {
        System.out.println("Company");
    }

    void showCompanyInfo(int Cid, String cName, String cAddress) {
        System.out.println("Company id :" + Cid + " Name : " + cName + " Address : " + cAddress);
    }
}

class Customer extends Company {
    void show() {
        System.out.println("Customer");
    }

    void showCustomerInfo(int custID, String custName, long custContactNumber) {
        System.out.println("Customer id : " + custID + " Customer Name : " + custName + " Phone number : " + custContactNumber);

        //Dynamic Method Dispatch (RunTime Polymorphism)
        //When you call a non-static overridden method like show():
        //The compiler looks at the reference type (compile-time check).
        //The JVM looks at the actual object type at runtime and decides which method to call.
        //So even though you’re inside the Customer class,
        //the object (this) is still of type Product.
        //Therefore, JVM dynamically calls Product’s show() method.
        show();
    }
}

class Product extends Customer {
    void show() {
        System.out.println("Product");
    }

    void showProductInfo(int productId, String productName, double productPrice) {
        System.out.println("Product ID :" + productId + " Product Name :" + productName + " product Price : " + productPrice);
    }
}


public class MultiLevel_Inheritance_Ex {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.showCompanyInfo(121, "Accenture", "Noida");
        p1.showCustomerInfo(101, "Rahul", 789063421);
        p1.showProductInfo(1023, "Face Wash", 200.00);
    }
}

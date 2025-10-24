//Abstraction -> Hiding implementation details and showing
// only essential features.

//Abstract Class -> A class that cannot be instantiated (you can’t create objects of it)
// and can contain both abstract (unimplemented) and non-abstract (implemented) methods.
//It allows constructor.
//Can't instantiate abstract class.
/// /methods are may/not be public/final/static
// All variables may/may not be public/static/final


//Interface -> interface is a contract that defines what a class must do but not how to do it.
//All methods are abstract by default (except default/static methods).
//No Constructor
//all methods are public
//Can't instantiate interface.
// All variables are public/static/final
//promotes multiple inheritance

//Data Binding -> linking a method call to its actual method body in memory.


package OOPS.Abstraction;

interface Department {

    //by default - public, static & final -> can't re-initialize
    int empCode = 999;


    //all methods are abstract in interface by default
    //all methods are public
    void showDeptInfo(int deptId, String deptName);

    //JDK-8+ support static and default methods -> are not abstract in interface
    static void set() {
        System.out.println("I am from static");
    }

    default void get() {
        System.out.println("I am from default");
    }
}

interface Employee {

    void showEmployeeInfo(int empId, String empName, double empSalary);

}

abstract class Product {

    public Product() {

    }

    public static final int productCode = 111;

    abstract void showProductInfo(int pId, String pName);

    void displayProductData(String pDescription) {
        System.out.println(pDescription);
    }
}

//If a class inherits a abstract class as well as implements a interface then its mandatory
// for the class to provide  implementation all the methods of the abstract class and interface
class Company extends Product implements Department, Employee {

    @Override
    public void showDeptInfo(int deptId, String deptName) {
        System.out.println("deptId : " + deptId + " Dept name : " + deptName);
    }

    @Override
    public void showEmployeeInfo(int empId, String empName, double empSalary) {
        System.out.println("EMpId : " + empId + " emp name : " + empName + " empSalary : " + empSalary);
    }

    @Override
    void showProductInfo(int pId, String pName) {
        System.out.println("Product id : " + pId + " product name : " + pName);
    }

    void showCompanyInfo(int cId, String cName, String cAddress) {
        System.out.println("company id : " + cId + " company name : " + cName + "company address : " + cAddress);
    }
}


public class Abstraction {
    public static void main(String[] args) {
        //can't instantiate a interface and abstract class
        //Department d1 = new Department();
        //Product p1 = new Product();

        Company c1= new Company();
        c1.showDeptInfo(121,"CSE");
        Department.set();
        c1.get();
        c1.showEmployeeInfo(123423,"Siddhant",35436.00);
        c1.showProductInfo(1323,"Laptop");
        c1.showCompanyInfo(64574,"Accenture","Noida");

    }
}

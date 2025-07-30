//Static Block: It always execute before main method.This is particularly useful for performing
// initialization tasks that need to be done only once, such as establishing connections.

//Static Class: Outer class never static, but inner class will be static.
// Static classes do not require an instance of the outer class to be instantiated.
// They can only access static members of the outer class.

//Static Method: You can call a static method without creating an object of the class.
// Static methods can only access other static members (variables or methods) of the class.

//Static Variable: It always declared with class level and must be static.
// A static variable is shared among all instances of the class.
// This means that all objects of the class refer to the same variable.
// Static variables are initialized when the class is loaded.

package Static_Concept;

class Example{
    //inner classes are static
    static class InnerClass{

    }
}

//outer class can never be static
public class StaticEx {
    //static variable always declared within class level
    static int empID = 123;
    //static block execute before main method
    static{
        System.out.println("static block before main method");
    }
    public static void main(String[] args) {
        show();
        StaticEx ex = new StaticEx();
        ex.display();
        System.out.println("main block");
    }
    static void show(){
        System.out.println("show method");
    }
    void display(){
        System.out.println("display method");
    }
    static{
        System.out.println("static block after main method");
    }

}


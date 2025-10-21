package Access_Modifiers;

public class Concepts_Access_Modifiers {
    public static void main(String[] args) {

        //Access Modifiers -> Scope of visibility of variables / members /fields
        // Help in data hiding and security.
        // promote modular and organized code.
        //proper encapsulation in object-oriented programming.
        // control how different parts of a program interact with each other.

        // 1. Private ->
        //  a. Scope within class.
        //  b. Not even in package.
        //  c. Use public Setter and Getter to access the members outside class.
        //  d. Private members are never shared ,
        //      If you create class A obj in class B then , class A obj can access getter sette
        //  e. private data + public getter/setter = encapsulation with safe external access.

        // default -> Scope within the package.
        // If you do not specify any access level, it will be default.
        // Cannot be accessed outside the package.

        // public -> Scope is everywhere.
        // can be accessed outside and inside class as well as outside and inside the package.

        // 4. Protected ->
        //  a. Scope within package.
        //  b. Outside package - only through child class.
        //  c. Not accessed outside package other class.
        //  d. if you create class B object and class A has protected member , then class B object
        //      has direct access via Inheritance. And if you create class A object in class B , then
        //      class A object in class B has direct access via Object reference.
    }
}

//Object Cloning in Java Object Cloning it means copy one object into another object.

//How Object Cloning Works in Java-
//1. Implements Cloneable interface
//      Cloneable is an Marker Interface (i.e. empty interface)
//      If a class does not implement Cloneable and you try to clone an object of that class,
//      it will throw a CloneNotSupportedException.

//2. Override clone() method
//      The clone() method is defined in the Object class. However, it's protected, so to make it accessible,
//      you need to override it in your own class (if the class implements Cloneable).

//Key Points:
//  Cloneable Interface: The class must implement Cloneable interface
//  Clone Method: The clone() method creates a shallow copy of the object.
//  Shallow vs Deep Cloning: Shallow cloning is faster but shares references,
//          whereas deep cloning creates fully independent objects.

package Object_Cloning;

class Employee implements Cloneable {
    private int id;
    private String Name;

    public Employee(int id, String name) {
        this.id = id;
        Name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Object_Cloning {
    //compile time exception
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee(111, "Siddhant");
        Employee e2 = (Employee) e1.clone();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println("e1 == e2 :" + (e1==e2));

    }
}

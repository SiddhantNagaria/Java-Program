package OOPS.Inheritance;

class Department {
    void show(int id, String Name) {
        System.out.println("id : " + id + " Name : " + Name);
    }
}

class Employee extends Department {
    void display(int id, String Name, double salary) {
        System.out.println("id : " + id + " Name : " + Name + " Salary : " + salary);
    }
}

public class Single_Inheritance_Ex {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        //child class can access parent class properties
        e1.show(101, "CSE");
        e1.display(1001, "CSE", 80000.00);
        System.out.println();

        //ClassCastException
        //You are trying to downcast a Department object (parent) into an Employee (child).
        //But the object in memory is actually a Department, not an Employee.
        //You can’t force a parent object to become a child — Java throws:
        //Upcasting (child → parent) is allowed.

        Employee e11 = (Employee) new Department();
        e11.show(11, "CSE");
        e11.display(121, "Mechanical", 45640.00);
        System.out.println();

        Department d1 = new Employee();
        d1.show(1, "CSE");
        //Downcast reference d1 to Employee
        ((Employee) d1).display(121, "Mech", 45000.00);

    }
}

// Encapsulation -> Wrapping up of data and functions into single unit.
// Data is not accessed directly, it is accessed through the functions present inside class.
// Attributes are kept private and public getter and setter of the class are used to manipulate / access the attributes.

// Data hiding -> it restrict the access to members of an object reducing the
//negative effect due to dependencies - protected , private


package OOPS.Encapsulation;

public class Encapsulation_Ex {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        //private attributes are accessed using public getter and setter
        // Data Hiding - restricted access to members of the class.
        e1.setId(121);
        e1.setName("Siddhant");
        e1.setSalary(60000.00);

        System.out.println(e1.getId() + " " + e1.getName() + " " + e1.getSalary());
    }
}

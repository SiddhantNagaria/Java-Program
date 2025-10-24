//Constructor -> itself initialize at the time of object creation.

//Two types ->
//1.default constructor (no parameters)
//when you want to create an object without providing any initial values.

//2. Parameterized constructor (passing parameters)
// when you want to initialize an object with specific values
//provided by the use at the time of object creation

//Note->
// Constructor itself initialize at the time of oject creation
// Constructor name same name as class name
// Constructor does not have any return type.
// Constructor overload possible in java.
//Constructor override never possible in java


package Constructor;

class Employee {
    private int empId = 123;
    private String empName = "Siddhant";

//    public Employee() {
//        System.out.println("Id : " + empId + " emp name : " + empName);
//    }

    //method overloading possible in java
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

public class Constructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(121,"Siddhant");
        System.out.println(e1);
    }
}

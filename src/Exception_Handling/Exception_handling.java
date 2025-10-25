//Exception Handling -> used to handle runtime errors caused by exception

//Errors - indicate something severe has gone wrong,
//         the application should crash rather than try to handle the error
//Ex - Stack Overflow Error , Virtual Machine error, OutOfMemory Error


//Exception -> it is a abnormal condition  or an event which interrupts normal flow of program.
//It is an object in java that describes exceptional condition.
//A programmer can handle such conditions/ events.

//Types -
//1. Checked Exception - (Compile Time) ->
//          Compiler checks during compilation whether the programmer has handled them ot not.
//Ex - IOException, SQLException, ClassNotFoundException

//2. UncheckedException (Run Time) ->
//          These exceptions are not checked at the compileTime so its the responsibility of the programmer
//          to handle these exceptions and provide a safe exit.
//Ex - NullPointerException, ArithmeticException, ArrayIndexOutOfBoundException

//Blocks-
//try - contains code statements monitored for exceptions

//catch - it is used to catch the exception and handle it.

//throw - user defined / custom exception
//      - manually throw an error
//      - will declared throw inside method
//      - throw will handle only exception at a time
//      - it is called explicitly.

//throws - it is system generated exception
//       - declare throws at time of method declaration
//       - throws will handle multiple exception at a time by
//              "," separated.
//       - it is called implicitly.

//finally - it always absolutely gets executed.
//        - Close db connection , close hibernate session, etc.

package Exception_Handling;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String empName;

    public Employee(int id, String empName) {
        this.id = id;
        this.empName = empName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                '}';
    }
}

public class Exception_handling {
    public static void main(String[] args) throws RecordNotFoundException {
        List<Employee> em = Stream.of(new Employee(11, "SIddhant"),
                new Employee(12, "Rahul"),
                new Employee(13, "Rohit"),
                new Employee(14, "Krish")).toList();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter Employee id : ");
        int empId = sc.nextInt();
        for (Employee emp : em) {
            if (emp.getId() == empId) {
                System.out.println(emp);
                break;
            } else {
                throw new RecordNotFoundException("Employee ID does not exist");
            }
        }
    }
}

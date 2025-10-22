package Enum.Enum_Example;

import Enum.Constant.EmployeeStatus;
import Enum.HRM.Model.Employee;

import java.util.Scanner;
import java.util.stream.Stream;

public class HRMApplicatiom {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Please enter Employee Status : ");
        String employeeStatus = sc.next();

        Stream.of(new Employee(121, "Siddhant", 7800.00, EmployeeStatus.ACTIVE),
                new Employee(122, "Rahul", 8800.00, EmployeeStatus.TERMINATED),
                new Employee(123, "Rohit", 7900.00, EmployeeStatus.ON_HOLD),
                new Employee(124, "Prakhar", 9800.00, EmployeeStatus.ON_NOTICE),
                new Employee(125, "King Paul", 3800.00, EmployeeStatus.RESIGNED)).filter(
                emp -> emp.getEmployeeStatus().toString().equals(employeeStatus)).forEach(System.out::println);
    }
}

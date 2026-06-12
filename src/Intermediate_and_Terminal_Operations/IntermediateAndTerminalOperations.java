package Intermediate_and_Terminal_Operations;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", dept='" + dept + '\'' + ", salary=" + salary + '}';
    }
}

public class IntermediateAndTerminalOperations {
    public static void main(String[] args) {

        List<Employee> list = Stream.of(new Employee(121, "siddhant", "IT", 50000.00),
                new Employee(122, "rahul", "IT", 45000.00)).toList();

        // filter employee by salary>=48000
        //filter = intermediate operation
        //forEach = terminal operation
        list.stream()
                .filter(emp -> emp.getSalary() >= 48000)
                    .forEach(System.out::println);

        //ascending order by salary
        list.stream()
                .sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);

        //using Comparator
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        //descending order by salary
        list.stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

        //using comparator
        list.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .forEach(System.out::println);
    }
}

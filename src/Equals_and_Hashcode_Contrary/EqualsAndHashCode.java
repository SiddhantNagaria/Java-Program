package Equals_and_Hashcode_Contrary;

import java.util.Objects;

class Employee {
    private int empId;
    private String name;
    private double empSalary;

    public Employee(int empId, String name, double empSalary) {
        this.empId = empId;
        this.name = name;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && Double.compare(empSalary, employee.empSalary) == 0 && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name, empSalary);
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Employee e1 = new Employee(121,"siddhant",98000.00);
        Employee e2 = new Employee(121,"siddhant",98000.00);

        System.out.println(e1.equals(e2));

        System.out.println(e1.getName().equals(e2.getName()));

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
